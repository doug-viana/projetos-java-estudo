public class Ativo {
    public String ticker;
    public double preco;
    public int quantidade;

    //MÉTODX: O comportamento do objeto
    public double valorTotalEmCarteira(){
        return preco * quantidade;
    }
}
