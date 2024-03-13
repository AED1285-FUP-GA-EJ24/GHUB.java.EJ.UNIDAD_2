package Puntaje;

import java.util.Scanner;

public class Puntaje {
    private static final Scanner Salida = null;

    public static void calcularpuntaje() {
        Scanner Entrada=new Scanner(System.in);
        int c,i,b;
        int p;
        
        System.out.print("Proporciona respuestas correctas");
        c= Entrada.nextInt();
        System.out.print("Proporciona respuestas incorrectas");
        i= Entrada.nextInt();
        System.out.print("Proporciona respuestas en blanco");
        b= Entrada.nextInt();
        p=c*4-1+b*0;
        System.out.print("Puntaje obtenido="+p);

        Entrada.close();

    }
}
