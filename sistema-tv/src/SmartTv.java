public class SmartTv{
    boolean ligada = false;
    int canal  = 1;
    int volume = 25;


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuindoVolume(){
        volume--;
        System.out.println("Diminuindo o Volume: " + volume);
    }

    public void ligar(){
          ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}