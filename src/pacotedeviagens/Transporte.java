package PacoteDeViagens;
import java.util.Scanner;


class Transporte {
    private String tipo; // aéreo, rodoviário, marítimo
    private double valor;

    public Transporte(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Transporte: " + tipo + " - Valor: $" + valor;
    }
}



