public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double preco;

    public Fatura(String numero, String descricao, int quantidadeComprada, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidadeComprada(quantidadeComprada);
        setPreco(preco);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    public double getTotalFatura() {
        double total = quantidadeComprada * preco;
        if (total < 0) {
            total = 0.0;
        }
        return total;
    }
}
