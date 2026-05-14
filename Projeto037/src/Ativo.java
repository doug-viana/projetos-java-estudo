public class Ativo {
    private String ticker;
    private double yield;

    public Ativo(String ticker, double yield) {
        this.ticker = ticker;
        this.yield = yield;
    }

    public String getTicker() { return ticker; }
    public double getYield() { return yield; }

    @Override
    public String toString() {
        return String.format("%-6s | Yield: %.2f%%", ticker, yield);
    }
}
