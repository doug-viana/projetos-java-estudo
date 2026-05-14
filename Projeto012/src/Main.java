//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Usando o Construtor 1 (Completo)
        Ativo acao1 = new Ativo("PETR4", 38.50, 100);

        // Usando o Construtor 2 (Parcial)
        Ativo acao2 = new Ativo("VALE3", 62.00);

        System.out.println("Ação 1: " + acao1);
        System.out.println("Ação 2: " + acao2);
        }
    }