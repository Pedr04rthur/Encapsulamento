package Carro;

public interface PaineldoCarro {
    public abstract void chave();
    public abstract void ligar();
    public abstract void desligar();
    public abstract void marcha(int estado);
    public abstract void acelerar();
    public abstract void desacelerar();
    public abstract void freiar();
    public abstract void status();
}
