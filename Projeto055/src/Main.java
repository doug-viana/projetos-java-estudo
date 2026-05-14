import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual foi o seu lucro total? R$ ");
        double lucro = sc.nextDouble();
        //DELEGAÇÃO: Chamamos o métodx e ele nos devolve o resultado
        double impostoDevido = CalculadoraFiscal.calc(lucro);
        System.out.printf("O valor a pagar de IR (15%%) é: R$ %.2f%n", impostoDevido);
        System.out.printf("Lucro Líquido: R$ %.2f%n", (lucro - impostoDevido));

        sc.close();
    }
}