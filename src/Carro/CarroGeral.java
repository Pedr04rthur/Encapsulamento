package Carro;

public class CarroGeral implements PaineldoCarro {
    private boolean ligado;
    private int quilometragem;
    private boolean rodando;
    private boolean chaveInserida;

    public CarroGeral(){
        this.ligado = false;
        this.quilometragem = 0;
        this.rodando = false;
        this.chaveInserida = false;
    }

    public boolean isChaveInserida() {
        return chaveInserida;
    }

    public void setChaveInserida(boolean chaveInserida) {
        this.chaveInserida = chaveInserida;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean getRodando() {
        return rodando;
    }

    public void setRodando(boolean rodando) {
        this.rodando = rodando;
    }

    @Override
    public void chave() {
        setChaveInserida(true);
    }

    @Override
    public void ligar() {
        if (this.chaveInserida){
            this.setLigado(true);
            System.out.println("CARRO LIGADO");
        }else {
            System.out.println("INSIRA A CHAVE");
        }
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setChaveInserida(false);
        this.setQuilometragem(0);

    }

    @Override
    public void marcha(int estado) {
        if (this.ligado){
            if (estado >= 1 && estado <= 5){
                this.setQuilometragem(quilometragem = estado * 10);
                this.setRodando(true);
                System.out.println(estado + "º marcha");
            }else {
                System.out.println("Tente novamente passar a marcha.");
            }
        }else {
            System.out.println("ligue o carro");
        }
    }

    @Override
    public void acelerar() {
        if (this.ligado && this.rodando){
            System.out.println("Passe a marcha para acelerar");

        }else {
            System.out.println("Ligue o carro e passe a marcha");
        }
    }

    @Override
    public void desacelerar() {
        if (this.ligado && this.rodando){
            System.out.println("diminua a marcha");
        }else {
            System.out.println("o carro está parado");
        }
    }

    @Override
    public void freiar() {
        this.setRodando(false);
        this.setQuilometragem(0);
    }

    @Override
    public void status() {
        System.out.println("LIGADO: " + this.getLigado());
        System.out.println("VELOCIDADE " + getQuilometragem() + "Km");
    }
}
