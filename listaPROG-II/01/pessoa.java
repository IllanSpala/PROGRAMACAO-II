public class pessoa{
    private int idade;
    private String nome;
    
    public pessoa(String nome, int idade){
        this.nome = nome;
        this. idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        if(nome.length() > 0){
        this.nome = nome;
        }else{
            System.out.println("NOME INVALIDO");
        }
    }
    
    public void setIdade(int idade){
        if(idade > 0 && idade < 100){
        this.idade = idade;
    }else{
        System.out.println("IDADE INVALIDA");
        }
    }
    
}