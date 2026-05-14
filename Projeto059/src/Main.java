public class Main {
    public static void main(String[] args) {
        double investimentoInicial = 1000.0;
        double taxaJuros = 0.10; // 10% ao ano
        int periodo = 3;
        double resultado = CalculadoraFinanceira.calcularMontante(investimentoInicial, taxaJuros, periodo);

        System.out.printf("%nMontante Final após %d anos: R$ %.2f%n", periodo, resultado);
    }
}