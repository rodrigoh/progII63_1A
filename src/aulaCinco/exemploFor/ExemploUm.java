package aulaCinco.exemploFor;

public class ExemploUm {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.printf("\n\nExemplo dois\n");
        for(int i=0,j=9;i<10;i++,j--){
            System.out.println("i="+i+" j="+j);
        }
        System.out.printf("\n\nExemplo três\n");
        int i=9;
        for(;i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.printf("\n\nExemplo quatro\n");
        for(int j=0;j<10;){
            System.out.print(j+" ");
            j++;
        }
        System.out.printf("\n\nExemplo três\n");
        for(int j=0;j<20;j+=2){
            System.out.print(j+" ");
        }

    }

}
