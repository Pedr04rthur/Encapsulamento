public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);

    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void aumentarVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("Televisão está ligada " + this.getLigado());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i++){
            System.out.print("-");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado");
    }

    @Override
    public void mutar() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("MUTED");
        }
    }

    @Override
    public void desmutar() {
        this.setVolume(50);
        System.out.println("SOUND");
    }
}
