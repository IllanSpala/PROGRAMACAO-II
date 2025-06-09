public class contador{
    private static int totalObjetosCriados = 0;
    
    public contador(){
        totalObjetosCriados ++;
    }
    
    public static void printCont(){
        System.out.println("Objetos criados: " + totalObjetosCriados);
    }
}