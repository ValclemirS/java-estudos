public class Escopo {
    public static int main(String[] args) throws Exception {
        int number=1;//está variável pode ser usada por todos os metódos.
        int newNumber= 0 ;//está variável pode ser usada por todos os metódos.

        for(int x=1;x<=5;x++){
            int incremento= number + x;
            newNumber= newNumber + incremento;// a variável incremento só pode ser feito no escopo do for
            
        }
        return newNumber;//
        
}
}