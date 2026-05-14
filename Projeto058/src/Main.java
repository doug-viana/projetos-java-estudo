public class Main {
    public static void main(String[] args) {
        double lucroBruto = 1000.0;

        // Podemos acessar a ALIQUOTA_PADRAO diretamente porque ela é pública e da classe
        System.out.println("A alíquota atual é: " + (ConfiguracaoFiscal.ALIQUOTA_PADRAO * 100) + "%");

        double totalPagar = ConfiguracaoFiscal.calcularTotal(lucroBruto);
        System.out.printf("Total a pagar (Imposto + Taxa): R$ %.2f%n", totalPagar);

        //ERRO PROPOSITAL: Se você tentar digitar:
        // System.out.println(imposto);
        // O Java vai dar erro! A variável 'imposto' morreu quando o métodx terminou.
    }
}