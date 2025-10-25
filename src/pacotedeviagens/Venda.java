package PacoteDeViagens;

class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacote;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacote) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    public double converterParaReais(double valorDolar, double cotacao) {
        return valorDolar * cotacao;
    }

    public void mostrarVenda(double margemLucro, double taxaAdicional, double cotacaoDolar) {
        double totalDolar = pacote.calcularTotalPacote(margemLucro, taxaAdicional);
        double totalReais = converterParaReais(totalDolar, cotacaoDolar);

        System.out.println("\n===== VENDA =====");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println(pacote.toString());
        System.out.println("Valor total do pacote em dólar: $" + totalDolar);
        System.out.println("Valor total do pacote em reais (cotação R$" + cotacaoDolar + "): R$" + totalReais);
    }
}
