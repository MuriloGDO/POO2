package sixth_project;

public interface Visitor {
    void visit(RelatorioAnual ra);
    void visit(RelatorioDiario rd);
    void visit(RelatorioSemanal rs);
}
