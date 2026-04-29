package sixth_project;

public class RelatorioSemanal implements Relatorio {
    private String titulo;
    private String grafico;
    private String formato;
    private String texto;

    RelatorioSemanal(String titulo, String grafico, String formato, String texto) {
        this.titulo = titulo;
        this.grafico = grafico;
        this.formato = formato;
        this.texto = texto;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getGrafico() {
        return grafico;
    }

    @Override
    public String getFormato() {
        return formato;
    }

    @Override
    public String getTexto() {
        return texto;
    }
}
