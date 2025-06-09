public class aluno{
    private int matricula;
    private String nome;
    private String curso;
    
    public aluno(int matricula, String nome, String curso){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setNome(String nome){
        if(nome.length() < 0){
            System.out.println("NOME INVALIDO");
        }else{
            this.nome = nome;
        }
    }
    
    public void setCurso(String curso){
        if(curso.length() < 0){
            System.out.println("CURSO INVALIDO");
        }else{
            this.curso = curso;
        }
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void printDados(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("");
    }
    
}