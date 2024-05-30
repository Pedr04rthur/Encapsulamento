package ControleTV;

public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void abrirMenu();
    public  abstract void fecharMenu();
    public abstract void mutar();
    public abstract void desmutar();
}