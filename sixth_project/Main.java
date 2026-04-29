package sixth_project;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Criando uma lista de relatórios (Polimorfismo)
        List<Relatorio> listaDeRelatorios = new ArrayList<>();

        listaDeRelatorios.add(new RelatorioDiario("Vendas Segunda", "Barras", "A4", "Vendas do dia 01..."));
        listaDeRelatorios.add(new RelatorioSemanal("Semana 15", "Pizza", "Digital", "Resumo da semana..."));
        listaDeRelatorios.add(new RelatorioAnual("Consolidado 2025", "Linhas", "Impresso", "Análise anual..."));

        Visitor exportadorHTML = new HTMLVisitor();
        Visitor exportadorPlanilha = new PlanilhaVisitor();
        Visitor exportadorPDF = new PDFVisitor();

        System.out.println("--- Iniciando Exportação para HTML ---");
        for (Relatorio r : listaDeRelatorios) {
            r.accept(exportadorHTML);
        }

        System.out.println("\n--- Iniciando Exportação para Planilha ---");
        for (Relatorio r : listaDeRelatorios) {
            r.accept(exportadorPlanilha);
        }

        System.out.println("\n--- Iniciando Exportação para PDF ---");
        for (Relatorio r : listaDeRelatorios) {
            r.accept(exportadorPDF);
        }
    }
}