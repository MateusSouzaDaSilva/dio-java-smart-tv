public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();

        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.mudarCanal(15);

        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.aumentarCanal();

        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        System.out.println("Novo canal: " + smartTv.canal);
    }
}
