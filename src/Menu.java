import java.util.Scanner;
 
public class Menu {
 
    public static void menu(Scanner scanner) {
 
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        int opcao;
 
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("[1] Criar tarefa");
            System.out.println("[2] Listar tarefas");
            System.out.println("[3] Marcar tarefa como concluída");
            System.out.println("[4] Exibir status");
            System.out.println("[5] Sair");
 
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
 
            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
 
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
 
                    Tarefa tarefa = new Tarefa(titulo, descricao);
                    gerenciador.adicionarTarefa(tarefa);
                    break;
//switch case 1 - JV
                case 2:
                    gerenciador.listarTarefas();
                    break;
 
                case 3:
                    System.out.print("Digite o índice da tarefa: ");
                    int indice = scanner.nextInt();
                    gerenciador.concluirTarefa(indice);
                    break;
//switch case 2 e 3 - JV
                case 4:
                    gerenciador.exibirStatus();
                    break;
 
                case 5:
                    System.out.println("Saindo...");
                    break;
 
                default:
                    System.out.println("Opção inválida!");
            }
//bugs menu e concatenação - JV e JP 
        } while (opcao != 5);
    }
}