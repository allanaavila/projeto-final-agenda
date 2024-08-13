package vision;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);

    public void exibeMenu() {
        var opcao = -1;

        while (opcao != 0) {
            var menu = """
                    ======== AGENDA ======== 
                    1 - Adicionar contatos
                    2 - Detalhar contatos
                    3 - Alterar contatos
                    4 - Excluir contatos
                    
                    0 - Sair
                    """;

            System.out.println("\nEscolha a opção deseja: \n" + menu);
            System.out.println("Digite a opção: ");
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    //adicionarContatos();
                    break;
                case 2:
                    //detalharContatos();
                    break;
                case 3:
                    //alterarContatos();
                    break;
                case 4:
                    //excluirContatos();
                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }

    }


}
