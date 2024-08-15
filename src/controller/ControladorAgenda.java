package controller;

import exception.ContatoNaoEncontradoException;
import exception.NaoExisteContatoException;
import exception.TelefoneExistenteException;
import model.Contato;
import util.Util;


import java.util.Scanner;

public class ControladorAgenda {
    private Scanner leitura = new Scanner(System.in);
    private Contato[] contatos;
    int contador = 0;

    public ControladorAgenda() {
        contatos = new Contato[0]; // Inicializa o array de contatos como vazio
    }


    public Contato [] adicionarContato(Contato contato) throws Exception {
        try {
            if (consultarTelefoneExistente(contato.getTelefone())) {
                throw new TelefoneExistenteException();
            }

            int tamanhoAgenda = verificarTamanho();
            Contato[] contatosAtualizados = new Contato[tamanhoAgenda + 1];
            contatosAtualizados = copiarContatos(contatos, contatosAtualizados);
            contatosAtualizados[tamanhoAgenda] = contato; // Adiciona o novo contato
            contatos = contatosAtualizados;

            return contatos;
        } catch (NaoExisteContatoException  e) {
            contatos = new Contato[1];
            contatos[0] = contato;
            return contatos;
        } catch (Exception e) {
            throw e;
        }
    }

    private boolean consultarTelefoneExistente(String telefone) throws NaoExisteContatoException {
        if(contatos != null) {
            for (Contato c : contatos) {
                if(c.getTelefone().equals(telefone)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int verificarTamanho() {
        if (contatos == null) {
            return 0;
        } else {
            return contatos.length;
        }
    }

    private Contato[] copiarContatos(Contato[] contatos, Contato[] novosContatos) {
        for (int i = 0; i < contatos.length; i++) {
            novosContatos[i] = contatos[i];
        }
        return novosContatos;
    }
    public Contato[] getContatos() {
        return contatos;
    }

    private Contato buscarContatoPorTelefone(String telefone) throws ContatoNaoEncontradoException {
        if (contatos != null) {
            for (Contato c : contatos) {
                if (c.getTelefone().equals(telefone)) {
                    return c;
                }
            }
        }
        throw new ContatoNaoEncontradoException();
    }


    public void detalharContatos(String telefone) {
        try {
            Contato contato = buscarContatoPorTelefone(telefone);
            System.out.println(contato);
        } catch (ContatoNaoEncontradoException e) {
            Util.erro(e.getMessage());
        }
    }


    public void listarTodosContatos() {
        if (contatos.length == 0) {
            System.out.println("Nenhum contato cadastrado!");
        } else {
            System.out.println("========================== TODOS CONTATOS ==========================");
            System.out.printf("%-4s %-20s %-30s %-15s\n", "ID", "Nome", "E-mail", "Telefone");
            for (int i = 0; i < contatos.length; i++) {
                Contato contato = contatos[i];
                System.out.printf("%-4d %-20s %-30s %-15s\n",
                        i + 1,
                        contato.getNome() + " " + contato.getSobrenome(),
                        contato.getEmail(),
                        contato.getTelefone());
                System.out.println("---------------------------------------------------------------------");
            }
        }
    }
}
