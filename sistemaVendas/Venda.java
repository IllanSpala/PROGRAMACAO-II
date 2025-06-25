public class Venda{
    private Produto produtoVendido;
    private int quantidade;
    
    //CONSTRUTOR
    public Venda(Produto produtoVendido, int quantidade){
        this.produtoVendido = produtoVendido;
        this.quantidade = quantidade;
    }
    
    //GETTERS
    public Produto getProdutoVendido(){
        return this.produtoVendido;
    }
    
     public int getQuantidade(){
        return this.quantidade;
    }
    
    //SETTERS
    public void setProdutoVendido(Produto produtoVendido){
        this.produtoVendido = produtoVendido;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    //toString pt4 mdsss
    @Override
     public String toString() {
        double valorTotal = this.produtoVendido.getPreco() * this.quantidade;
        return "Venda{ Produto: " + this.produtoVendido.getNome() + ", Quantidade: " + this.quantidade + ", Valor Total: R$ " + String.format("%.2f", valorTotal) + "}";
    }
}
