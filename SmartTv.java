public class SmartTv {
    boolean ligada = false;
    int canal1 = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

        public void diminuirVolume(){
           volume--;
        System.out.println("Diminuindo volume para: " + volume);

        }


    public void aumentarCanal(){
        canal1++;
    }

    public void diminuirCanal(){
        canal1 --;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}