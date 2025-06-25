public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int codigo, int garantiaMeses) {
        super(nome, preco, codigo);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return this.garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        String stringSClass = super.toString();
        String stringSClassFormatada = stringSClass.substring(0, stringSClass.length() - 1);
        return stringSClassFormatada + ", Garantia: " + this.garantiaMeses + " meses}";
    }
}