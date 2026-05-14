import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos preços deseja cadastrar? ");
        int n = sc.nextInt();

        // CRIANDO O VETOR: double[] indica que é um vetor de números decimais
        // O 'new double[n] reserva 'n' espaços na memória
        double[] vect = new double[n];

        //LOOP PARA ENTRADA: O 'i' vai de 0 até n-1
        for (int i=0; i<n; i++) {
            System.out.println("Digite o preço do ativo " + (i+1) + ": ");
            vect[i] = sc.nextDouble(); //Guarda o valor na posição 'i'
        }

        // LOOP PARA SOMA: Percorremos o vetor somando tudo
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("A MÉDIA DE PREÇOS É: R$ %.2f%n", media);

        sc.close();

    }
}
