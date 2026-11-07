public class Casa extends Imovel {

    private int qtdadeAndares;

    @Override
    public double calcularAluguel() {
        return getValorLocacao();
    }

    public int getQtdadeAndares() { return qtdadeAndares; }
    public void setQtdadeAndares(int qtdadeAndares) { this.qtdadeAndares = qtdadeAndares; }
}