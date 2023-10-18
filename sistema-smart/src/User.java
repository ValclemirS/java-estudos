public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv= new SmartTv();


       //estado de funcionamento
        System.out.println(smartTv.ligada);//inicia o esatado da tv.
        smartTv.ligar();
        System.out.println(smartTv.ligada);//após o metódo de ligar>true.
        smartTv.desliagr();
        System.out.println(smartTv.ligada);//após o metódo de desligar>false
        // canal
        System.out.println(smartTv.canal);//inicia o primeiro canal  com 1.
        smartTv.alterarCanal(30);//altera o canal para 30.
        smartTv.pularCanal();//incrementa +1 canal
        smartTv.voltarCanal();//decrementar -1 canal
        //volume
        System.out.println(smartTv.volume);//inicia o primeiro canal  com 25.
        smartTv.aumentarVolumel();//incrementa +1 volume
        smartTv.diminuirVolume();//decrementar -1 volume
    }
}
