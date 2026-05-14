import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // O cofre tem sempre 10 gavetas
        Cliente[] gavetas = new Cliente[10];

        System.out.println("Quantos clientes vão alugar gavetas? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nAluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine(); //Limpar buffer
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Número da gaveta (0 a 9): ");
            int numeroGaveta = sc.nextInt();

            //Criamos o objeto e colocamos na posição ESPECÍFICA escolhida
            gavetas[numeroGaveta] = new Cliente(nome, email);
        }

        System.out.println("\nRELATÓRIO DE GAVETAS OCUPADAS: ");
        for (int i = 0; i < 10; i++) {
            // SÓ IMPRIMIMOS SE A GAVETA NÃO ESTIVER VAZIA (NULL)
            if (gavetas[i] != null) {
                System.out.println(i + ": " + gavetas[i]);
            }
        }
        sc.close();

    }
}