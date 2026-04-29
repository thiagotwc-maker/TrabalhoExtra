
import java.util.ArrayList;

public class GerenciadorDeTarefas {

    private ArrayList<Tarefa> lista;

   public GerenciadorDeTarefas() {
        lista = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa t) {
        lista.add(t);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (lista.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }


    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.get(indice).marcarComoConcluida();
            System.out.println("Tarefa concluída!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    public void exibirStatus(){
         if (lista.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                Tarefa t = lista.get(i);
                String status = t.isConcluida() ? "Concluida" : "Pendente";
                System.out.println(i + " - " + t.getTitulo() + " -> " + status);
            }
        }
    }
}
