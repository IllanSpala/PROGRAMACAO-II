public class Estudante{
    private String nome;
    private int matricula;
    private double nota01;
    private double nota02;
    
    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.nota01 = (0.0);
        this.nota02 = (0.0);
    }
    
    //getters
    
    public String getNome(){
        return nome;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public double getNota01(){
        return nota01;
    }
    
    public double getNota02(){
        return nota02;
    }
    
    //setters
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setNota01(double nota01){
        if(nota01 >= 0.0 && nota01 <= 10.0){
        this.nota01 = nota01;
        }else{
            System.out.println("Nota inválida");
        }
    }
    
    public void setNota02(double nota02){
        if(nota02 >= 0.0 && nota02 <= 10.0){
        this.nota02 = nota02;
        }else{
            System.out.println("Nota inválida");
        }
    }
    
    
    // metodo calcularMedia()
    
    public double calcularMedia(){
        return (nota01 + nota02) / 2;
    }
    
   
}

   

