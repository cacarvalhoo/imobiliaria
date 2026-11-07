import java.util.Date;

public class Corretor extends Pessoa implements ReceberValor {

    private String registro;
    private Date dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    @Override
    public void receber(double valor) {
        System.out.println("O corretor " + getNome() +
            " está recebendo o valor de R$" + valor);
        totalComissaoAcumulada += valor;
    }

    public void sacarComissoes(double valor) {
        totalComissaoAcumulada -= valor;
        System.out.println("Saque de R$" + valor + " realizado. " +
            "Saldo atual: R$" + totalComissaoAcumulada);
    }

    public String getRegistro() { return registro; }
    public void setRegistro(String registro) { this.registro = registro; }

    public Date getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(Date dataAdmissao) { this.dataAdmissao = dataAdmissao; }

    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { this.comissao = comissao; }

    public double getTotalComissaoAcumulada() { return totalComissaoAcumulada; }
}