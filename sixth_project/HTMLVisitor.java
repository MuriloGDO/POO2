package sixth_project;

public class HTMLVisitor implements Visitor {
    @Override
    public void visit(RelatorioAnual ra) {
        System.out.println("Relatorio Anual sendo escrito em HTML");
    }

    @Override
    public void visit(RelatorioDiario rd) {
        System.out.println("Relatorio Diario sendo escrito em HTML");
    }

    @Override
    public void visit(RelatorioSemanal rs) {
        System.out.println("Relatorio Semanal sendo escrito em HTML");
    }
}
