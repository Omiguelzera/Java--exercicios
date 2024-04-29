public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        
        System.out.println("Volume : " + smartTv.ligada);
        System.out.println("Volume : " + smartTv.volume);
        System.out.println("Volume : " + smartTv.canal);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuindoVolume();

        smartTv.mudarCanal(20);

        System.out.println("Novo canal : " + smartTv.canal);

        smartTv.desligar();

    }
}
