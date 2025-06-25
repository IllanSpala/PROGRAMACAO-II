public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, double preco, int codigo, String dataValidade) {
        super(nome, preco, codigo);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        String stringSClass = super.toString();
        String stringSClassFormatada = stringSClass.substring(0, stringSClass.length() - 1);
        return stringSClassFormatada + ", Data de validade: " + this.dataValidade + "}";
    }
}