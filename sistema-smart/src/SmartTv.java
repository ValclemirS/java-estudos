public class SmartTv {
    boolean ligada= false;
    int canal= 1;
    int volume=25;
//metódo para ligar/delisgar
public void ligar(){//metódo para ligar
    ligada=true;
}
public void desliagr(){//metódo para desligar
    ligada=false;
}
// metódo para alterar o canal
public void alterarCanal(int novoCnal){//metódo para alterar para qualquer canal
    canal= novoCnal;
    System.out.println("canal atual: " + novoCnal);
}

public void pularCanal(){//metódo para pular 1 canal
    canal++;
        System.out.println("canal atual: " + canal);
}
public void voltarCanal(){//metódo para voltar 1 canal
    canal--;
        System.out.println("canal atual: " + canal);
// metódo para alterar o volume        
}
public void aumentarVolumel(){//metódo para aumentar 1 volume
    volume++;
        System.out.println("Volume atual: " + volume);
}
public void diminuirVolume(){//metódo para diminuir 1 volume
    volume--;
         System.out.println("Volume atual: " + volume);
}
}