public class Main {

    public static void main(String[] args) {

        // 1. Criar o Locatário
        Locatario locatario = new Locatario();
        locatario.setNome("Carolina Carvalho");
        locatario.setEmail("ana_cv_carvalho@estudante.sesisenai.org.br");
        locatario.setCpf("123.456.789-00");
        locatario.setSalario("5000.00");

        // 2. Criar o Proprietário
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Isabel do Rocio Vieira de Carvalho");
        proprietario.setCpf("987.654.321-00");
        proprietario.setConta("12345-6");
        proprietario.setAgencia("0001");

        // 3. Criar o Corretor
        Corretor corretor = new Corretor();
        corretor.setNome("ISabella Wieczorkiecz");
        corretor.setCpf("456.789.123-00");
        corretor.setRegistro("CRECI-12345");
        corretor.setComissao(0.10);

        // 4. Criar um Apartamento
        Apartamento apartamento = new Apartamento();
        apartamento.setCodigo(1);
        apartamento.setEndereco("Rua Bom Pastor, 1457 - São José/SC");
        apartamento.setValorLocacao(1500.00);
        apartamento.setCondominio(300.00);
        apartamento.setFundoReserva(50.00);
        apartamento.setInvestimentos(30.00);
        apartamento.setQuartos(2);
        apartamento.setBanheiros(1);
        apartamento.setVagasGaragem(1);
        apartamento.setAndar(5);
        apartamento.setNumero(502);

        // 5. Criar uma Casa
        Casa casa = new Casa();
        casa.setCodigo(2);
        casa.setEndereco("Criatiano Buch, 545 - Rio Negro/PR");
        casa.setValorLocacao(2000.00);
        casa.setQuartos(3);
        casa.setBanheiros(2);
        casa.setVagasGaragem(2);
        casa.setQtdadeAndares(2);

        // 6. Criar a Locação com o Apartamento
        Locacao locacao = new Locacao();
        locacao.setLocatario(locatario);
        locacao.setProprietario(proprietario);
        locacao.setCorretor(corretor);
        locacao.setImovel(apartamento);

        // 7. Testar os métodos
        System.out.println("===== COBRANÇA - APARTAMENTO =====");
        locacao.enviarCobranca();

        System.out.println("\n===== PAGAMENTO - APARTAMENTO =====");
        locacao.pagarProprietario();

        System.out.println("\n===== SAQUE DE COMISSÃO =====");
        corretor.sacarComissoes(100.00);

        System.out.println("\n===== COBRANÇA - CASA =====");
        locacao.setImovel(casa);
        locacao.enviarCobranca();

        System.out.println("\n===== PAGAMENTO - CASA =====");
        locacao.pagarProprietario();
    }
}