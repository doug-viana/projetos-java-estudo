public class CalculadoraFiscal {

    // Agora o métodx pede duas coisas: um número e um texto

    public static double calc(double lucro, String tipoOperacao) {
        if (tipoOperacao.equalsIgnoreCase("DT")) {
            return lucro * 0.20; // 20% para Day Trade
        } else {
            return lucro * 0.15; // 15% para Swing Trade (padrão)
        }
    }
}
