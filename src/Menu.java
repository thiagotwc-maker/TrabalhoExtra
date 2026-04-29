
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
        
        int opcao= scanner.nextInt();
        
        // Limpar
        scanner.nextLine();
        
        //Se for necessario
        return opcao;
        
        switch (opcao){
            case 1:Tarefa tarefa =  new Tarefa();
                funcao.adicionarTarefa(tarefa);
                break;
                
            case 2:
                funcao.listarTarefas();
                break;
                
            case 3:
                funcao.concluirTarefa(int indice);
                break;
                
                
            case 4:
                System.out.println("Saindo");
                break;
        }
    }
}
