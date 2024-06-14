package revisando;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulaSData {
    public static void main(String[]args){

    String nome = "Jesus";
    String name = "Pedro";
        System.out.println(nome.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        String nomeOutro = "Pedroka";
        System.out.println(nome.equals(nomeOutro)); //Comparando Strings

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        Locale brasil = new Locale("pt","BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime hora = LocalDateTime.now();
        if (hora.getHour() >= 0 && hora.getHour() < 12){
            saudacao = "Bom Dia";
        }else if(hora.getHour() >= 12 && hora.getHour() < 18 ) {
            saudacao = "Boa Tarde";
        }else {
            saudacao = "Boa Noite!";
        }

        System.out.println(saudacao.toUpperCase());
    }
}
