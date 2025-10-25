package PacoteDeViagens;

import java.util.Scanner;

public class Viajante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Cadastro Transporte =====
        System.out.print("Informe o tipo de transporte (aéreo, rodoviário, marítimo): ");
        String tipoTransporte = sc.nextLine();
        System.out.print("Informe o valor do transporte em dólar: ");
        double valorTransporte = sc.nextDouble();
        sc.nextLine(); // consumir quebra de linha
        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

        // ===== Cadastro Hospedagem =====
        System.out.print("Informe a descrição da hospedagem: ");
        String descHospedagem = sc.nextLine();
        System.out.print("Informe o valor da diária em dólar: ");
        double valorDiaria = sc.nextDouble();
        Hospedagem hospedagem = new Hospedagem(descHospedagem, valorDiaria);

        // ===== Cadastro Pacote =====
        sc.nextLine(); // consumir quebra de linha
        System.out.print("Informe o destino da viagem: ");
        String destino = sc.nextLine();
        System.out.print("Informe a quantidade de dias: ");
        int dias = sc.nextInt();

        PacoteViagem pacote = new PacoteViagem(transporte, hospedagem, destino, dias);

        // ===== Margem e taxas =====
        System.out.print("Informe a margem de lucro (%): ");
        double margemLucro = sc.nextDouble();
        System.out.print("Informe o valor de taxas adicionais em dólar: ");
        double taxaAdicional = sc.nextDouble();

        // ===== Venda =====
        sc.nextLine(); // consumir quebra de linha
        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Informe a forma de pagamento: ");
        String formaPagamento = sc.nextLine();

        System.out.print("Informe a cotação do dólar (R$): ");
        double cotacaoDolar = sc.nextDouble();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacote);

        // ===== Mostrar resultado =====
        System.out.println("\n===== INFORMAÇÕES DO PACOTE =====");
        System.out.println(pacote.toString());

        venda.mostrarVenda(margemLucro, taxaAdicional, cotacaoDolar);
    }
}
    

