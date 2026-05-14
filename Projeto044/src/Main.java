import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoMedio;
        try {
            // BLOCO DE TENTATIVA
            System.out.print("Valor total investido: ");
            double total = sc.nextDouble();

            System.out.print("Quantidade de cotas: ");
            int cotas = sc.nextInt();

            // Se 'cotas for 0, o Java lança uma arithmeticException
            precoMedio = total / cotas;

            if (Double.isInfinite(precoMedio)) {
                throw new ArithmeticException();
            }

            System.out.printf("Seu preço médio é: R$ %.2f%n", precoMedio);

        } catch (InputMismatchException e) {
            //Erro de digitação (ex: letras no lugar de números
            System.err.println("ERRO: Você deve digitar apenas números!");
        } catch (ArithmeticException e) {
            // Erro matemático
            System.err.println("ERRO: A quantidade de cotas não pode ser zero!");
        } catch (Exception e) {
            // "Rede de segurança" para qualquer outro erro desconhecido
            System.err.println("ERRO INESPERADO: " + e.getMessage());
        } finally {
            // Sempre executa, dando erro ou não
            System.out.println("\nAuditoria finalizada.");

            sc.close();
        }
    }
}
