public class CalculadoraFinanceira {
    // Atributo ESTÁTICO: A taxa é a mesma para todo o mercado
    public static double TAXA_CORRETAGEM = 9.90;

    // Métodx ESTÁTICO: Você não precisa de um objeto para calcular IR
    public static double calcularImposto(double lucro) {
        return lucro * 0.15;
    }
}
