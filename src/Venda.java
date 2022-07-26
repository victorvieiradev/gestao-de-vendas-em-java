public class Venda {

    private String cliente;
    private String vendedor;
    private String produto;
    private String data;

    public Venda(String cliente, String vendedor, String produto, String data) {
        this.setCliente(cliente);
        this.setVendedor(vendedor);
        this.setProduto(produto);
        this.setData(data);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
