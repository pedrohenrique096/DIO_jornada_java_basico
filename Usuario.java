public class Usuario {
    public static void main(String[] args) throws Exception {
        
        
            SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
       

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual é o Canal Atual: " + smartTv.canal1);
        System.out.println("Qual é o Volume Atual: " + smartTv.volume);



        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.diminuirCanal();
        System.out.println("Qual é o Canal Atual: " + smartTv.canal1);

    }
}
