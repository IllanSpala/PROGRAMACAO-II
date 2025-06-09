public class Main {
    public static void main(String[] args) { 
        produto detergente = new produto("detergente", 10, 2.50);
        produto.printDados(detergente);
        
        produto cloro = new produto("cloro", 5, 25.99);
        produto.printDados(cloro);
    }
}