import java.util.Scanner;

public class Projeto067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        System.out.println("=== Cadastro de Usuário ANBIMA ===");

        while (true) {
            System.out.print("Digite seu e-mail institucinal: ");
            email = scanner.nextLine();

            // Validação: precisa ter '@' E '.'
            if (email.contains("@") && email.contains(".")) {
                break; // E-mail parece válido
            } else {
                System.out.println("ERRO: E-mail inválido! Certifique-se de usar '@' e '.'");
            }
        }
        System.out.println("E-mail cadastrado: " + email);
        scanner.close();
    }
}
