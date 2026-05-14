import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos (digite um número par): ");
        int n = sc.nextInt();
        Ativo[] vect = new Ativo[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Ticker #" + (i + 1) + ": ");
            String ticker = sc.nextLine();
            vect[i] = new Ativo(ticker, 0.0); // Preço não importa neste exercício
        }

        // LÓGICA DE INVERSÃO (SWAP)
        // Percorremos apenas até a metade, senão desinvertemos o que já foi feito!
        for (int i = 0; i < n / 2; i++) {
            Ativo tempo = vect[i];          //Guarda o da frente no "copo vazio"
            vect[i] = vect[n - 1 - i];      // O da frente recebe o de trás
            vect[n -1 - i] = tempo;         // O de trás recebe o que estava no copo
        }

        System.out.println("\n--- CARTEIRA INVERTIDA ---");
        for (Ativo obj : vect) {
            System.out.println(obj);
        }

        sc.close();
    }
}