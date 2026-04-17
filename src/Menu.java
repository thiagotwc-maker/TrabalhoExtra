
import java.util.Scanner;

public class Menu {
    
    public static int menu(Scanner scanner){
        System.out.println("Escolha um opção");
        System.out.println("[1] Criar tarefa ");
        System.out.println("[2] Listar tarefas ");
        System.out.println("[3] Marcar tarefa como conlcuida ");
        System.out.println("[4] Exibir status da tarefa ");
        System.out.println("[5] Sair (Encerrar Sistema) ");
        
        int opcao= scanner.nextInt();
        
        // Limpar
        scanner.nextLine();
        
        //Se for necessario
        //return opcao;
        
        switch (opcao) {
            case 1:
                adicionarTarefa();
                break;
                
            case 2:
                gerenciador.listarTarefa();
                break;
                
            case 3:
                concluirTarefa();
                break;
                
            case 4:
                //criar função exibir status da tarefa
                break;
                
            case 5:
                System.out.println("Saindo");
                break;
        }
    }
}
