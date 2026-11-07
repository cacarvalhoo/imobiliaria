public class Apartamento extends Imovel {

    private int andar;
    private int numero;
    private double condominio;
    private double fundoReserva;
    private double investimentos;

    @Override
    public double calcularAluguel() {
        return getValorLocacao() + condominio - fundoReserva - investimentos;
    }

    public int getAndar() { return andar; }
    public void setAndar(int andar) { this.andar = andar; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public double getCondominio() { return condominio; }
    public void setCondominio(double condominio) { this.condominio = condominio; }

    public double getFundoReserva() { return fundoReserva; }
    public void setFundoReserva(double fundoReserva) { this.fundoReserva = fundoReserva; }

    public double getInvestimentos() { return investimentos; }
    public void setInvestimentos(double investimentos) { this.investimentos = investimentos; }
}