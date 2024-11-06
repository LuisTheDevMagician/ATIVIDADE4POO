public class ContaCorrente {
    private String numero;
    private double saldo;
    private String status;
    private String statusEspecial;
    private double limite;

    public ContaCorrente(String numero, double saldo, String status, String statusEspecial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
        this.statusEspecial = statusEspecial;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusEspecial() {
        return statusEspecial;
    }

    public void setStatusEspecial(String statusEspecial) {
        this.statusEspecial = statusEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        double total = this.saldo;
        if(total < valor) {
            this.saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }

    }
}
