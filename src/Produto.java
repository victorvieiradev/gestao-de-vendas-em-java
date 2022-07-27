import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;


    public Produto(String nome, double preco) {

        this.setNome(nome);
        this.setPreco(preco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 && nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
