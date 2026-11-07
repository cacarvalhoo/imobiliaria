public class Proprietario extends Pessoa implements ReceberValor {

    private String conta;
    private String agencia;

    @Override
    public void receber(double valor) {
        System.out.println("O proprietário " + getNome() +
            " está recebendo o valor de R$" + valor);
    }

    public String getConta() { return conta; }
    public void setConta(String conta) { this.conta = conta; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }
}