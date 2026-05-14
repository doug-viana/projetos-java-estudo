import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Qual é a sua meta de liberdade financeira? R$ ");
        double meta = sc.nextDouble();

        System.out.println("Quanto você vai poupar por mês? R$ ");
        double aporte = sc.nextDouble();

        double saldoAtual = 0;
        int mes = 0;

        //O MOTOR DO SISTEMA: Enquanto o saldo for menor que a meta, ele repete!
        while (saldoAtual < meta) {
            mes++; // Soma 1 ao mês
            saldoAtual += aporte; // Soma o aporte ao saldo
            System.out.println("Mês " + mes + ": Saldo de R$ " + saldoAtual);
        }

        System.out.println("--- PARABÉNS ---");
        System.out.println("Meta atingida em " + mes + " meses.");

        sc.close();
    }
    }
