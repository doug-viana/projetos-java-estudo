import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos na carteira? ");
        int n = sc.nextInt();
        Ativo[] vect = new Ativo[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Ativo #" + (i + 1));
            System.out.print("Ticker: ");
            String ticker = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            vect[i] = new Ativo(ticker, preco);
        }

        // LÓGICA DO MAIOR
        double maiorPreco = vect[0].getPreco();
        int posMaior = 0;

        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getPreco() > maiorPreco) {
                maiorPreco = vect[i].getPreco();
                posMaior = i; //Guardamos o índice de onde o "campeão" está
            }
        }

        System.out.println("\n--- ATIVO MAIS CARO DA CARTEIRA ---");
        //Usamos a posição guardada para imprimir o objeto completo
        System.out.println(vect[posMaior]);
        System.out.printf("POSIÇÃO NO VETOR: %d%n", posMaior);

        sc.close();
    }
}