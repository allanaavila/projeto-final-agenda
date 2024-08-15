import java.util.Scanner;

public class exibirMenu {

    private static Scanner leitura;

    public static void main(String args[]) {

        String menu = "\n╔══════════════════════════════╗\n"
                + "║          AGENDA              ║\n"
                + "╠══════════════════════════════╣\n"
                + "║  1 - Adicionar contatos      ║\n"
                + "║  2 - Detalhar contatos       ║\n"
                + "║  3 - Alterar contatos        ║\n"
                + "║  4 - Excluir contatos        ║\n"
                + "║  5 - Listar todos contatos   ║\n"
                + "╠══════════════════════════════╣\n"
                + "║  0 - Sair                    ║\n"
                + "╚══════════════════════════════╝\n";

        System.out.println(menu);
        System.out.print("Escolha a opção desejada: ");
        int opcao = leitura.nextInt();
        leitura.nextLine();

        switch (opcao) {
            case 0:
                System.out.println("Saindo...");
                break;
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
                excluirContatos();
                break;
            case 5:
                listarTodosContatos();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    private static void listarTodosContatos() {
        
    }

    private static void excluirContatos() {
    }

    private static void alterarContatos() {
    }

    private static void detalharContatos() {
    }

    private static void adicionarContatos() {
    }


}