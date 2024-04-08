package aulaOito.exemplos;

import java.util.Random;

public class Exemplo2 {
    static Random aleatorio = new Random();
    public static String geraImpressao(int[][] matriz){
        String retorno = "";
        for(int l=0;l< matriz.length;l++){
            for(int c=0;c<matriz[l].length;c++){
                retorno += String.format("%02d ",matriz[l][c]);
            }
            retorno += "\n";
        }
        return retorno;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[5][4];

        for(int l=0;l<5;l++){
            for(int c=0;c<4;c++){
                matriz[l][c] = aleatorio.nextInt(100);
            }
        }
        String impressao = geraImpressao(matriz);
        System.out.printf("%s",impressao);
    }
}
