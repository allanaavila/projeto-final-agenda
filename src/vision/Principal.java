package vision;

import controller.ControladorAgenda;
import exception.TelefoneExistenteException;
import model.Contato;
import util.Util;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ControladorAgenda controladorAgenda = new ControladorAgenda();

    public void exibeMenu() throws Exception {
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
                    perguntarMenuOuSair();
                    break;
                case 2:
                    detalharContatos();
                    break;
                case 3:
                   // alterarContatos();
                    break;
                case 4:
                   // excluirContatos();
                    break;
                case 5:
                    listarTodosContatos();
                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void adicionarContatos() throws Exception {
        boolean continuar = true;
        while (continuar) {
            try {
                controladorAgenda.adicionarContato(obterDadosContato());
            } catch (TelefoneExistenteException e) {
                // O erro já foi tratado e exibido no método adicionarContato
                Util.erro(e.getMessage());
            }
            continuar = Util.ler(leitura, "Deseja adicionar outro contato? (sim/não): ").equalsIgnoreCase("sim");
        }
    }

    private Contato obterDadosContato() {
        String telefone = Util.ler(leitura, "Digite o telefone do contato: ");
        String nome = Util.ler(leitura, "Digite o nome do contato: ");
        String sobrenome = Util.ler(leitura, "Digite o sobrenome do contato: ");
        String email = Util.ler(leitura, "Digite o e-mail do contato: ");
        return new Contato(nome, sobrenome, email, telefone);
    }

    private void perguntarMenuOuSair() {
        String resposta = Util.ler(leitura, "\nDeseja voltar ao menu ou sair? (menu/sair): ");
        if (resposta.equalsIgnoreCase("sair")) {
            System.out.println("Saindo....");
            System.exit(0);  // encerra o programa
        }
    }

    private void detalharContatos() {
        String telefone = Util.ler(leitura, "Digite o telefone do contato: ");
        controladorAgenda.detalharContatos(telefone);
        perguntarMenuOuSair();
    }

    private void listarTodosContatos() {
        controladorAgenda.listarTodosContatos();
        perguntarMenuOuSair();
    }

}
