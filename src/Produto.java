public class Produto {
    private String nome;
    private double preco;
    private String data;

    public Produto(String nome, double preco, String data) {

        this.setNome(nome);
        this.setPreco(preco);
        this.setData(data);
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
