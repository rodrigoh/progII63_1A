package aulaCinco.exemploWhile;

public class ExemploUm {
    public static void main(String[] args) {
        int cont= 0;
        while(cont<=10){
            System.out.print(cont+" ");
            cont++;
        }
        System.out.printf("\n");
        cont = 10;
        while(cont>=0)
            System.out.print((cont--)+" ");
    }
}
