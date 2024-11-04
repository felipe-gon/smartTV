public class User {
    public static void main(String[] args) {
        smartTv smartTv = new smartTv();

        System.out.println("A TV está ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);

        smartTv.aumentaVolume();
        System.out.println("Volume atual: "+ smartTv.volume);

        smartTv.desligar();
        System.out.println("A TV está ligada? "+ smartTv.ligada);

        smartTv.ligar();
        System.out.println("A TV está ligada? "+ smartTv.ligada);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: "+smartTv.canal);

        smartTv.setarCanal(435);
        System.out.println("Canal selecionado: "+smartTv.canal);
    }
}