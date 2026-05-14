public class CalculadoraFiscal {

    // Versão A: Lucro direto
    public static double calc(double lucro) {
        System.out.println("-> Usando cálculo por lucro direto (15%)");
        return lucro * 0.15;
    }

    // Versão B: Preços e Quantidade (Sobrecarga)
    public static double calc(double compra, double venda, int qtd) {
        System.out.println("-> Usando cálculo por diferença de preços (15%)");
        double lucroTotal = (venda - compra) * qtd;
        return lucroTotal * 0.15;
    }
}
