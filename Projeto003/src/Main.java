//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double patrimonio = 15000000.00;
        System.out.println("Analisando Patrimônio: R$ " + patrimonio);

        if (patrimonio < 100000.0) {
            System.out.println("CATEGORIA: Investidor Varejo");
    } else if (patrimonio >= 100000.0 && patrimonio < 1000000.0) {
            System.out.println("CATEGORIA: Investidor Alta Renda");
        } else {
            System.out.println("CATEGORIA: Investidor Qualificado (Private)");
        }
        System.out.println("--- Auditoria Concluída ---");
    }
}