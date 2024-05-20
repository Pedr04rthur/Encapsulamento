import javax.naming.ldap.Control;

public class Main {
    public static void main(String[] args) {
        ControleRemoto pedro = new ControleRemoto();
        pedro.ligar();
        pedro.diminuirVolume();
        pedro.abrirMenu();

    }
}
