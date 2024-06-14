package revisando.arrays;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Vetores {
    public static void main(String[] args){
        int[] numeros = new int[5];
        //os arrays são orientados à indices
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;

        for(int i= 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //passando todos os valores no array
        String[] letras = {"a", "b", "c"};
        for(int i = 0; i < letras.length; i++){
            System.out.printf(letras[i] + "%n");
        }

        //SEM PRECISAR DO FOR, MAS O JAVA TRANSFORMA OS INT'S EM STRINGS
        int[] numerico = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(numerico));

        //buscando o maior ou o menor
        int[] busca = {1,2,3,4,5};
        //preciso começar avaliando o primeiro elemento do array
        int maior = busca[0];
        int menor = busca[0];
        int media = 0;

        // fazendo as comparações
        for (int i = 0; i < busca.length; i ++){
            if (numeros[i] >  maior){
                maior = busca[i];
            }
            if(numeros[i] < menor){
                menor = busca[i];
            }

            media += busca[i];


        }

        System.out.println("Média: " + media/busca.length);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
