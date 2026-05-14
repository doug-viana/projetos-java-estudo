public class CalculadoraFinanceira {
    // Métodx Recursivo
    public static double calcularMontante(double capital, double taxa, int anos) {
        // 1. Condição de Parada (Base) - Sem isso, o código roda para sempre!
        if (anos == 0) {
            return capital;
        }

        // 2. Chamada Recursiva: O montante deste ano é o (capital + juros)
        // aplicado ao cálculo do ano anterior
        double novoCapital = capital * (1 + taxa);
        System.out.printf("Calculando ano %d: R$ %.2f%n", anos, novoCapital);

        return calcularMontante(novoCapital, taxa, anos -1);
    }
}
