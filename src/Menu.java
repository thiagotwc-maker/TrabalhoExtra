
import java.util.Scanner;

public class Menu {
    
    public static int menu(){
        
        GerenciadorDeTarefas funcao = new GerenciadorDeTarefas();
                
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha um opção");
        System.out.println("[1] Criar tarefa ");
        System.out.println("[2] Listar tarefas ");
        System.out.println("[3] Marcar tarefa como concluida ");
        System.out.println("[4] Sair (Encerrar Sistema) ");
        
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
        //atualizado case 1.0 - JV
                case 2:
                    gerenciador.listarTarefas();
                    break;
 
                case 3:
                    System.out.print("Digite o índice da tarefa: ");
                    int indice = scanner.nextInt();
                    gerenciador.concluirTarefa(indice);
                    break;
        //atualizado case 2.0 - JV
        }
    }
}
