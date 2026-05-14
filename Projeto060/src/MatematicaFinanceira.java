public class MatematicaFinanceira {

    public static int fatorial(int n) {
        // Caso Base: Onde a escada termina
        if (n == 1) {
            return 1;
        }

        // O segredo: n * fatorial(n-1)
        // Estamos passando (n -1) para a próxima chamada!
        return n * fatorial(n-1);
    }
}
