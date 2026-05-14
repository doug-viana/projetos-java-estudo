// Melhoria solicitada pelo chefe: Adicionando log de auditoria.
public class CalculadoraFinanceira {

    public static double simularInvestimento(double inicial, double mensal,
                                             double taxa, int meses) {

        double saldo = inicial;

        for (int i = 1; i <= meses; i++) {
            // Aplica os juros sobre o saldo atual
            saldo += saldo * taxa;
            // Adiciona o aporte mensal
            saldo += mensal;

            System.out.printf("Mês %d: Saldo de R$ %.2f%n", i, saldo);
        }

        return saldo;
    }
}
