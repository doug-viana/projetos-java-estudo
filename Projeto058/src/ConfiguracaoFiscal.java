public class ConfiguracaoFiscal {
    // Variáveis de CLASSE (estão fora dos métodos, no topo)
    // 'final' significa que o valor é constante (não muda)
    public static final double ALIQUOTA_PADRAO = 0.15;
    public static final double TAXA_CORRETAGEM = 4.90;

    public static double calcularTotal(double lucro) {
        // 'imposto' é uma variável LOCAL (só existe aqui dentro)
        double imposto = lucro * ALIQUOTA_PADRAO;
        return imposto + TAXA_CORRETAGEM;
    }
}
