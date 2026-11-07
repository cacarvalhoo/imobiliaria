public abstract class Imovel {

    private int codigo;
    private String endereco;
    private double valorLocacao;
    private int vagasGaragem;
    private int quartos;
    private int banheiros;

    public abstract double calcularAluguel();

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public double getValorLocacao() { return valorLocacao; }
    public void setValorLocacao(double valorLocacao) { this.valorLocacao = valorLocacao; }

    public int getVagasGaragem() { return vagasGaragem; }
    public void setVagasGaragem(int vagasGaragem) { this.vagasGaragem = vagasGaragem; }

    public int getQuartos() { return quartos; }
    public void setQuartos(int quartos) { this.quartos = quartos; }

    public int getBanheiros() { return banheiros; }
    public void setBanheiros(int banheiros) { this.banheiros = banheiros; }
}