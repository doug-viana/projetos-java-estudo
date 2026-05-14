public class ConversorMoeda {

    // Atributo estático: IOF fixo de 6%
    public static double IOF = 0.06;

    //Métodx estático: Não precisa de 'new' para calcular
    public static double dolarParaReal(double montanteDolar, double cotacaoDolar) {
        double valorBruto = montanteDolar * cotacaoDolar;
        return valorBruto + (valorBruto * IOF);
    }


}
