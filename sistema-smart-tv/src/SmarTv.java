public class SmarTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25; 

    public void ligar(){
        ligada = true;
        System.out.println("Ligando a TV : " + ligada);
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando Voulume : " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo Voulume : " + volume);
    }

    public void mudarCanal( int novoCanal){
        canal = novoCanal;
        System.out.println("Trocando o canal -> "+ canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal:" + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal:" + canal);
    }
}