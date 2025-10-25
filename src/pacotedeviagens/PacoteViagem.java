package PacoteDeViagens;

class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public double calcularTotalHospedagem() {
        return quantidadeDias * hospedagem.getValorDiaria();
    }

    public double calcularValorComLucro(double valor, double margemLucroPercentual) {
        return valor + (valor * (margemLucroPercentual / 100));
    }

    public double calcularTotalPacote(double margemLucroPercentual, double taxaAdicional) {
        double total = transporte.getValor() + calcularTotalHospedagem();
        total = calcularValorComLucro(total, margemLucroPercentual);
        total += taxaAdicional;
        return total;
    }

    @Override
    public String toString() {
        return "Destino: " + destino + "\n" +
               transporte.toString() + "\n" +
               hospedagem.toString() + "\n" +
               "Quantidade de dias: " + quantidadeDias + "\n" +
               "Total Hospedagem: $" + calcularTotalHospedagem();
    }
}
