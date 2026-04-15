
import java.util.ArrayList;

public class GerenciadorDeTarefas {

    private ArrayList<Tarefa> lista;

    public GerenciadorDeTarefas() {
        lista = new ArrayList<>();
    }
    
    public void adicionarTarefa(Tarefa t) {
        lista.add(t);
    }

    public void listarTarefas() {
        if (lista.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                Tarefa t = lista.get(i);

                System.out.println(i + " - " + t.getTitulo()
                        + " | " + t.getDescricao()
                        + " | Status: " + (t.isConcluida() ? "Concluída" : "Pendente"));
            }
        }
    }
    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.get(indice).marcarComoConcluida();
            System.out.println("Tarefa concluída!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
