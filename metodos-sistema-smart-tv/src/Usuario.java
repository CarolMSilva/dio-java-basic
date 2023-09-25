public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();
             
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();
        System.out.println("Volume Atual : " + SmartTv.volume);

        System.out.println("Canal Atual : " + SmartTv.canal);
        SmartTv.mudarCanal(07);
        System.out.println("Canal Atual : " + SmartTv.canal);

        SmartTv.diminuirCanal();
        SmartTv.diminuirCanal();
        SmartTv.aumentarCanal();
        System.out.println("Canal Atual : " + SmartTv.canal);

        System.out.println("TV Ligada ? " + SmartTv.ligada);
        System.out.println("Canal Atual : " + SmartTv.canal);
        System.out.println("Volume Atual : " + SmartTv.volume);

        SmartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + SmartTv.ligada);
        SmartTv.desligar();
        System.out.println("Novo Status -> TV desligada ? " + SmartTv.ligada);
    }
}
