package Carro;

public class Principal {
    public static void main(String[] args){
        CarroGeral honda = new CarroGeral();

        honda.chave();
        honda.ligar();
        honda.marcha(2);
        honda.status();
        honda.desacelerar();
        honda.marcha(1);
        honda.marcha(3);
        honda.freiar();
        honda.status();
        honda.desligar();
        honda.status();
    }
}
