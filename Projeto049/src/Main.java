import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ticker da Ação: ");
            String ticker = sc.next().toUpperCase();

            System.out.print("Valor disponível para investir: R$ ");
            double totalDinheiro = sc.nextDouble();

            System.out.print("Preço unitário da ação: R$ ");
            double precoAcao = sc.nextDouble();
            // VALIDAÇÃO ANTES DO CÁLCULO
            if (precoAcao <= 0) {
                throw new ArithmeticException();
            }

// CÁLCULO SEGURO
            int quantidadeCotas = (int) (totalDinheiro / precoAcao);

            // 2. Regra de Negócio (Nossa Exception genérica)
            if (ticker.length() < 5) {
                throw new Exception("Ticker inválido para o padrão B3.");
            }

            System.out.println("\n--- ORDEM DE COMPRA GERADA ---");
            System.out.println("Ativo: " + ticker);
            System.out.println("Quantidade possível: " + quantidadeCotas + " cotas");
        } catch (InputMismatchException e) {
            System.err.println(" ERRO TÉCNICO: Digite apenas números para valores financeiros.");

        } catch (ArithmeticException e) {
            System.err.println("ERRO MATEMÁTICO: O preço da ação não pode ser zero.");
        }catch (Exception e) {
            System.err.println("ALERTA DE NEGÓCIO: " + e.getMessage());
        } finally {
            System.out.println("\nLog de auditoria encerrado.");
            sc.close();
        }
    }
}