public class MediaEscolar {
    public static void main(String[] args) throws Exception {
        //condiconal composta
        System.out.println("Hello, World!");
        int nota = 6;

        if (nota >= 7){
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }

}