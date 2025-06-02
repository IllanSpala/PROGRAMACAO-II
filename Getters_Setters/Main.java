

public class Main
{
    
     // metodo imprimeAluno
    public static void imprimeAluno(Estudante aluno){
        
        System.out.println("--- Detalhes aluno ---");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("matricula: " + aluno.getMatricula());
        System.out.println("Nota 1: " + aluno.getNota01());
        System.out.println("Nota 2: " + aluno.getNota02());
        System.out.println("De média: " + aluno.calcularMedia());
        System.out.println("-------------------------");
        System.out.println();
    }
    
	public static void main(String[] args) {
    Estudante aluno1 = new Estudante ("jozelan", 2022021138);
    Estudante aluno2 = new Estudante ("wes hauch", 202501666);
    
    aluno1.setNota01(9.0);
    aluno1.setNota02(7.5);
    
    aluno2.setNota01(3.5);
    aluno2.setNota02(10.0);
    
    imprimeAluno(aluno1);
    imprimeAluno(aluno2);
    
	}
}
