public class produto{
    private String nome;
    private int quantidade;
    private double preco;
    
    public produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public String getNome(){
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setNome(String nome){
        if(nome.length() > 0){
            this.nome = nome;
        }else{
            System.out.println("NOME INVALIDO");
        }
    }
    
    public void setQuantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade = quantidade;
        }else{
            System.out.println("QUANTIDADE INVALIDA");
        }
    }
    
    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("PREÇO INVALIDO");
        }
    }
    
    public static void printDados(produto product){
        System.out.println("Nome: " + product.getNome());
        System.out.println("Quantidade: " + product.getQuantidade());
        System.out.println("Preço: " + product.getPreco());
        System.out.println("");
    }
}