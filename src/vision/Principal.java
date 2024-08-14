package vision;

import exception.ContatoNaoEncontradoException;
import exception.TelefoneExistenteException;
import model.Contato;
import util.Util;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private Contato[] contatos = new Contato[100];
    private int contador = 0;

    public void exibeMenu() {
        var opcao = -1;

        while (opcao != 0) {
            var menu = """
                                        
                    ========== AGENDA ==========
                                        
                    1 - Adicionar contatos
                    2 - Detalhar contatos
                    3 - Alterar contatos
                    4 - Excluir contatos
                    5 - Listar todos contatos
                                        
                    0 - Sair
                                        
                    ============================
                    """;

            System.out.println("\nEscolha a opção deseja: \n" + menu);
            System.out.println("Digite a opção: ");
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    adicionarContatos();
                    break;
                case 2:
                    detalharContatos();
                    break;
                case 3:
                    alterarContatos();
                    break;
                case 4:
                    // excluirContatos();
                    break;
                case 5:
                    //listarTodosContatos();
                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void adicionarContatos() {
        boolean continuar = true;

        while (continuar) {
            try {
                String telefone = Util.ler(leitura, "Digite o telefone do contato: ");
                if (telefoneJaCadastrado(telefone)) {
                    throw new TelefoneExistenteException();
                }
                String nome = Util.ler(leitura, "Digite o nome do contato: ");
                String sobrenome = Util.ler(leitura, "Digite o sobrenome do contato: ");
                String email = Util.ler(leitura, "Digite o e-mail do contato: ");

                Contato contato = new Contato(nome, sobrenome, email, telefone);
                if (contador < contatos.length) {
                    contatos[contador++] = contato;
                    System.out.println("Contado adicionado com sucesso!");
                } else {
                    System.out.println("Capacidade máxima de contatos já alcançada!");
                }
            } catch (TelefoneExistenteException e) {
                Util.erro(e.getMessage());
            }
            String resposta = Util.ler(leitura, "Deseja continuar cadastrando contatos: (sim/não): ");
            if (resposta.equals("não")) {
                continuar = false;
            }
        }
        perguntarMenuOuSair();
    }

    private void alterarContatos() {
        try {
            String telefone = Util.ler(leitura, "Digite o telefone do contato que deseja alterar: ");
            Contato contato = buscarContatoPorTelefone(telefone);
            System.out.println("Contato atual:");
            System.out.println(contato);

            String novoTelefone = Util.ler(leitura, "Digite o novo telefone do contato: ");
            if (telefoneJaCadastrado(novoTelefone) && !novoTelefone.equals(telefone)) {
                throw new TelefoneExistenteException();
            }

            String novoNome = Util.ler(leitura, "Digite o novo nome do contato: ");
            String novoSobrenome = Util.ler(leitura, "Digite o novo sobrenome do contato: ");
            String novoEmail = Util.ler(leitura, "Digite o novo e-mail do contato: ");

            contato.setTelefone(novoTelefone);
            contato.setNome(novoNome);
            contato.setSobrenome(novoSobrenome);
            contato.setEmail(novoEmail);

            System.out.println("Contato alterado com sucesso!");
        } catch (ContatoNaoEncontradoException e) {
            Util.erro(e.getMessage());
        } catch (TelefoneExistenteException e) {
            Util.erro(e.getMessage());
        }
        perguntarMenuOuSair();
    }

    private boolean telefoneJaCadastrado(String telefone) {
        for (int i = 0; i < contador; i++) {
            if (contatos[i].getTelefone().equals(telefone)) {
                return true;
            }
        }
        return false;
    }

    private void detalharContatos() {
        try {
            String telefone = Util.ler(leitura, "Digite o telefone do contato: ");
            Contato contato = buscarContatoPorTelefone(telefone);
            System.out.println(contato);
        } catch (ContatoNaoEncontradoException e) {
            Util.erro(e.getMessage());
        }
        perguntarMenuOuSair();
    }

    private Contato buscarContatoPorTelefone(String telefone) throws ContatoNaoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (contatos[i].getTelefone().equals(telefone)) {
                return contatos[i];
            }
        }
        throw new ContatoNaoEncontradoException();
    }


    private void perguntarMenuOuSair() {
        String resposta = Util.ler(leitura, "\nDeseja voltar ao menu ou sair? (menu/sair): ");
        if (resposta.equalsIgnoreCase("sair")) {
            System.out.println("Saindo....");
            System.exit(0);  //encerra o programa
        }
    }
}
