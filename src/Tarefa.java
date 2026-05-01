public class Tarefa {

    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }
}