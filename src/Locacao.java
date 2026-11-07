import java.util.Date;

public class Locacao {

    private Date dataInicio;
    private Date dataTermino;
    private Date dataPagamento;

    private Locatario locatario;
    private Corretor corretor;
    private Proprietario proprietario;
    private Imovel imovel;

    public void enviarCobranca() {
        System.out.println("E-mail: " + locatario.getEmail());
        System.out.println("O valor referente ao seu aluguel neste mês foi de R$"
            + imovel.calcularAluguel() + ".");
    }

    public void pagarProprietario() {
        double aluguel = imovel.calcularAluguel();
        double valorComissao = aluguel * corretor.getComissao();
        double valorLiquido  = aluguel - valorComissao;

        proprietario.receber(valorLiquido);
        corretor.receber(valorComissao);
    }

    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date dataInicio) { this.dataInicio = dataInicio; }

    public Date getDataTermino() { return dataTermino; }
    public void setDataTermino(Date dataTermino) { this.dataTermino = dataTermino; }

    public Date getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(Date dataPagamento) { this.dataPagamento = dataPagamento; }

    public Locatario getLocatario() { return locatario; }
    public void setLocatario(Locatario locatario) { this.locatario = locatario; }

    public Corretor getCorretor() { return corretor; }
    public void setCorretor(Corretor corretor) { this.corretor = corretor; }

    public Proprietario getProprietario() { return proprietario; }
    public void setProprietario(Proprietario proprietario) { this.proprietario = proprietario; }

    public Imovel getImovel() { return imovel; }
    public void setImovel(Imovel imovel) { this.imovel = imovel; }
}