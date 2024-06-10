package Relacionamento;

public class UltraEmojiCombat {
    public static void main(String[] args){
        Lutador Atleta[] = new Lutador[6];

        Atleta[0] = new Lutador("Popó","Bahia",
                40,50,2,10,1.77f,
                80.0f);
        Atleta[1] = new Lutador("Pedrão","Brasil",19,2,0,
                0,1.80f,80.0f);

        Atleta[0].status();
        Atleta[1].status();
    }
}
