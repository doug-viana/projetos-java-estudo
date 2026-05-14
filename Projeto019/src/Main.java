public class Main {
    public static void main(String[] args) {

    // REPARE: Eu não usei "new CalculadoraFinanceira()"
    // Eu chamo direto pelo nome da CLASSE!

    double corretagem = CalculadoraFinanceira.TAXA_CORRETAGEM;
    double imposto = CalculadoraFinanceira.calcularImposto(1000.00);

        System.out.println("--- RELATÓRIO DE TAXAS ---");
        System.out.println("Taxa Fixa de Corretagem: R$ " + corretagem);
        System.out.println("Imposto Estimado (15%): R$ " + imposto);

        // Se eu mudar o valor estático, muda para o sistema todo
        CalculadoraFinanceira.TAXA_CORRETAGEM = 4.50;
        System.out.println("Nova Corretagem Promocional: R$ " + CalculadoraFinanceira.TAXA_CORRETAGEM);
        }
    }
