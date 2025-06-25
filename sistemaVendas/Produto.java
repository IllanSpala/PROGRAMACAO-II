public class Produto {
    private String nome;
    private double preco;
    private int codigo;

    public Produto(String nome, double preco, int codigo) {
        boolean nomeContemNumero = nome.matches(".*\\d.*");
        if (nome.trim().isEmpty() || nomeContemNumero) {
            throw new IllegalArgumentException("Nome inválido, por favor insira ao menos um caracter sem números");
        }

        if (preco <= 0.0 || preco >= 10000.0) {
            throw new IllegalArgumentException("Preço inválido, deve ser maior que 0 e menor que 10000");
        }

        if (codigo < 0 || codigo > 999) {
            throw new IllegalArgumentException("Código inválido, deve ser um número entre 0 e 999");
        }


        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public Produto() {
    }
    //GETTERS
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    //SETTERS
    public void setNome(String nome) {
        boolean contemNumero = nome.matches(".*\\d.*");
        if (!nome.trim().isEmpty() && !contemNumero) {
            this.nome = nome;
        } else {
            System.out.println("Nome invalido, por favor insira ao menos um caracter");
        }
    }

    public void setPreco(double preco) {
        if (preco > 0.0 && preco < 10000.0){
            this.preco = preco;
        } else {
            System.out.println("Preço inválido, tente novamente");
        }
    }

    public void setCodigo(int codigo) {
        if (codigo <= 999 && codigo >= 0) {
            this.codigo = codigo;
        } else {
            System.out.println("ERROR, o código deve ser de no máximo 999");
        }
    }

    @Override
    public String toString() {
        return "Produto{ nome: " + this.nome + ", Preço: " + this.preco + ", Codigo: " + this.codigo + "}";
    }
}