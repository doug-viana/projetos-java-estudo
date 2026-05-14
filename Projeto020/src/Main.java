import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preço do dólar hoje? ");
        double cotacao = sc.nextDouble();

        System.out.println("Quantos dólares você vai comprar? ");
        double montante = sc.nextDouble();

        // CHAMADA ESTÁTICA: Classe.metodo()
        double resultado = ConversorMoeda.dolarParaReal(montante, cotacao);

        System.out.printf("Valor a ser pago em reais (com IOF): R$ %.2f%n", resultado);
        sc.close();
    }
}