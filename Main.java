//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fatura fatura1 = new Fatura("12345", "CPU", 5, 1500.0);
        System.out.println("Fatura 1:");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura1.getQuantidadeComprada());
        System.out.println("Preço por Item: " + fatura1.getPreco());
        System.out.println("Total da Fatura: " + fatura1.getTotalFatura());
        System.out.println();

        Fatura fatura2 = new Fatura("12345", "Placa Mãe", -2, 1000.0);
        System.out.println("Fatura 2:");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura2.getQuantidadeComprada());
        System.out.println("Preço por Item: " + fatura2.getPreco());
        System.out.println("Total da Fatura: " + fatura2.getTotalFatura());
        System.out.println();

        Fatura fatura3 = new Fatura("12345", "Memória Ram", 3, -340.0);
        System.out.println("Fatura 3:");
        System.out.println("Número: " + fatura3.getNumero());
        System.out.println("Descrição: " + fatura3.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura3.getQuantidadeComprada());
        System.out.println("Preço por Item: " + fatura3.getPreco());
        System.out.println("Total da Fatura: " + fatura3.getTotalFatura());
        System.out.println();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();

        Empregado empregado1 = new Empregado("William Joseph", "Blazkowicz", 60000.0);
        System.out.println("Empregado 1:");
        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Salário anual: " + empregado1.getSalarioMensal() * 12);
        System.out.println("Salário anual com aumento de 10%: " + String.format("%.2f", (empregado1.getSalarioMensal() * 12) * 1.1));
        System.out.println();

        Empregado empregado2 = new Empregado("José", "Silva", 1200.00);
        System.out.println("Empregado 2:");
        System.out.println("Nome: " + empregado2.getNome());
        System.out.println("Salário anual: " + empregado2.getSalarioMensal() * 12);
        System.out.println("Salário anual com aumento de 10%: " + String.format("%.2f", (empregado2.getSalarioMensal() * 12) * 1.1));
        System.out.println();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();

        Data data1 = new Data(12, 05, 2019);
        System.out.println("Data 1:");
        data1.displayData();
        System.out.println();

        Data data2 = new Data(06, 21, 2022);
        System.out.println("Data 2:");
        data2.displayData();
        System.out.println();

        Data data3 = new Data(01, 14, 2024);
        System.out.println("Data 3:");
        data3.displayData();
        System.out.println();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();


        ContaCorrente contaCorrente1 = new ContaCorrente("01", 700, "Ativa", "Sim", 9000);
        System.out.println("Conta Corrente 1:");
        System.out.println("Saldo atual: " + contaCorrente1.getSaldo());
        contaCorrente1.depositar(700);
        System.out.println("Saldo após depósito: " + contaCorrente1.getSaldo());
        contaCorrente1.sacar(200);
        System.out.println("Saldo após saque: " + contaCorrente1.getSaldo());
        System.out.println("Está usando cheque especial: " + contaCorrente1.getStatusEspecial());
        System.out.println();

        ContaCorrente contaCorrente2 = new ContaCorrente("01", 100, "Ativa", "Não", 9000);
        System.out.println("Conta Corrente 2:");
        System.out.println("Saldo atual: " + contaCorrente2.getSaldo());
        contaCorrente2.depositar(300);
        System.out.println("Saldo após depósito: " + contaCorrente2.getSaldo());
        contaCorrente2.sacar(900);
        System.out.println("Saldo após saque: " + contaCorrente1.getSaldo());
        System.out.println("Está usando cheque especial: " + contaCorrente2.getStatusEspecial());
        System.out.println();

    }
}