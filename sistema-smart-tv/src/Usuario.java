public class Usuario{
    public static void main(String[] args) throws Exception {

        SmarTv smarTv = new SmarTv();

        System.out.println("A Tv está ligada ? " + smarTv.ligada);
        System.out.println("Canal Atual : " + smarTv.canal);
        System.out.println("Volume Atual : " + smarTv.ligada);

        smarTv.ligar();
        System.out.println("Novo status -> Tv Ligada ? " +smarTv.ligada);

        System.out.println("Volume atual: " + smarTv.volume);
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        System.out.println("Volume atual: " + smarTv.volume);

        System.out.println("Canal Atual: " +smarTv.canal);
        smarTv.aumentarCanal();
        smarTv.diminuirCanal();
        System.out.println("Canal Atual: " +smarTv.canal);

        smarTv.mudarCanal(13);
        System.out.println("Canal Atual: " +smarTv.canal);
        
    
        


    }
}
