import java.util.Scanner;

public class SistemaVendas {
	private final Scanner scanner = new Scanner(System.in);
	private final Produto[] produtos = new Produto[10];
	private final Venda[] vendas = new Venda[10];
	private int qntdProdutos = 0;
	private int qntdVendas = 0;


	

	//MAIN EXECUTE
	public void executar() {
		int menu = 0;
		while(menu != 7) {
			printaMenu();
			System.out.print("Escolha uma opcao: ");
			menu = scanner.nextInt();
			scanner.nextLine(); // limpei buffer

			switch (menu) {
                case 1 -> cadastrarProduto(1); // 
                case 2 -> cadastrarProduto(2); // 
                case 3 -> listarProdutos(); // 
                case 4 -> realizarVenda(); // 
                case 5 -> listarVendas(); // 
                case 6 -> consultarProdutoPorNome(); // 
                case 7 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }
		}
		scanner.close();
	}
	
	//MENU
	private void printaMenu() {
        System.out.println("--- SISTEMA DE VENDAS ---");
        System.out.println("Selecione uma opcao:");
		System.out.println("1 - Cadastrar Produto Eletronico");
		System.out.println("2 - Cadastrar Produto Alimenticio");
		System.out.println("3 - Listar Produtos");
		System.out.println("4 - Realizar Venda");
		System.out.println("5 - Listar Vendas");
        System.out.println("6 - Consultar Produto por Nome");
		System.out.println("7 - Sair");
	}

	//METODOS DO SISTEMA


	private void cadastrarProduto(int tipoProduto) {
        if (qntdProdutos >= 10) {
            System.out.println("ERRO: Limite de 10 produtos atingido.");
            return;
        }

        try {
            System.out.print("Digite o código do produto (0-999): ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o nome do produto (sem números): ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto (ex: 59,90): ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            Produto novoProduto;
            if (tipoProduto == 1) {
                System.out.print("Digite a garantia em meses: ");
                int garantiaMeses = scanner.nextInt();
                scanner.nextLine();
                // A validação acontece AQUI, na chamada do construtor.
                novoProduto = new ProdutoEletronico(nome, preco, codigo, garantiaMeses);
            } else {
                System.out.print("Digite a data de validade (ex: DD/MM/AAAA): ");
                String dataValidade = scanner.nextLine();
                // A validação acontece AQUI, na chamada do construtor.
                novoProduto = new ProdutoAlimenticio(nome, preco, codigo, dataValidade);
            }

            produtos[qntdProdutos] = novoProduto;
            qntdProdutos++;
            System.out.println("Produto cadastrado com sucesso!");

        } catch (IllegalArgumentException e) {
            // Captura o erro de validação do construtor de Produto.
            System.out.println("Erro no cadastro: " + e.getMessage());
        } catch (Exception e) {
            // Captura outros erros, como digitar texto em um campo numérico.
            System.out.println("Erro de entrada. Por favor, insira os dados no formato correto.");
            scanner.nextLine(); // Limpa o scanner para evitar loop infinito.
        }
    }

    
    
    private void listarProdutos(){
        if (qntdProdutos == 0){
            System.out.println("Nenhum produto cadastrado!");
            return;
        }
        System.out.println("---LISTA DE PRODUTOS---");
        for (int i = 0; i < qntdProdutos; i++){
            System.out.println(produtos[i].toString());
        }
    }
    
    
    private void realizarVenda(){
        if(qntdProdutos == 0){
            System.out.println("Não tem nada pra vender nessa porra");
            return;
        }
        
        if(qntdVendas >= 10){
            System.out.println("ERROR: max 10 vendas");
            return;
        }
        
        System.out.println("Digite o Código do produto que vai ser vendido: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // vai limpano buffer 
        
        // laço verifica se codigo = getCodigo no [i] Produtos
        
        Produto produtoEncontrado = null;
        for (int i = 0; i < qntdProdutos ; i++){
            if(produtos[i].getCodigo() == codigo){
                produtoEncontrado = produtos[i];
                break;
            }
        }
        
        if(produtoEncontrado == null){
            System.out.println("Produto não encontrado");
        }else{
            System.out.println("Digite quantas unidades serão vendidas: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // amo apagar buffers gagging
            
            vendas[qntdVendas] = new Venda(produtoEncontrado, quantidade);
            qntdVendas ++;
            System.out.println("Venda realizada");
        }
    }
    
    private void listarVendas(){
        if (qntdVendas == 0){
            System.out.println("Vende algo ai vey");
            return;
        }
        
        System.out.println("--- LISTA DE VENDAS ---");
        for (int i = 0; i < qntdVendas; i++) {
            System.out.println(vendas[i].toString());
        }
    }
    
    private void consultarProdutoPorNome(){
        if (qntdProdutos == 0) {
        System.out.println("Nenhum produto cadastrado.");
        return;
        }
        
        System.out.println("Digite o nome do produto a ser buscado: ");
        String nome = scanner.nextLine();
        
        boolean encontrado = false;
        System.out.println("--- RESULTADO DA BUSCA ---");
        for(int i = 0; i < qntdProdutos; i++){
            if(produtos[i].getNome().toLowerCase().contains(nome.toLowerCase())) {
                System.out.println(produtos[i].toString());
                encontrado = true;
            }
        }
        
        if(!encontrado){
            System.out.println("Nada cadastrado com esse nome, tente novamente");
        }
    }
}
