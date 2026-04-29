package sixth_project;

public interface Relatorio {
    void accept(Visitor v);

    String getTitulo();
    String getGrafico();
    String getFormato();
    String getTexto();
}
