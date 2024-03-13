package Partido;

import java.util.Scanner;

public class Partido {
    public static void calcularpuntaje() {
        Scanner teclado = new Scanner(System.in);
        short g,p,e;
        short puntos;

        System.out.print("Proporciona partidos ganados");
        g= teclado.nextShort();
        System.out.print("Proporciona partidos perdidos");
        p= teclado.nextShort();
        System.out.print("Proporciona partidos empatados");
        e= teclado.nextShort();
        
        /*La constante literal es int por los que todas
         la expresion se convierte a int, y por lo que no puede de manera implicita
         asignarle un valor short
         */
        puntos= (short)(g*3+e);

        System.out.print("Puntaje: "+puntos);

        teclado.close();
    }
}
