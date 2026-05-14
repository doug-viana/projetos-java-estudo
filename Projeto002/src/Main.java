import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        double aporteCliente = 150000.00;
        double minimoExigido = 100000.00;

        if (aporteCliente >= minimoExigido) {
            System.out.println("STATUS: Aporte Autorizado.");
        } else {
            System.out.println("STATUS: Aporte Negado.");
        }
    }
}
