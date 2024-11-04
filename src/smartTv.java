public class smartTv {
    boolean ligada = true;
    int volume = 10;
    int canal = 5;

    public void aumentaVolume() {
        volume++;
    }
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
    public void setarCanal(int mudaCanal) {
        canal = mudaCanal;
        if (canal > 50)
            System.out.println("Canal inválido, deve ser menor que 50!");
        else if (canal < 1)
            System.out.println("Canal inválido, deve ser maior que 0!");
    }
}