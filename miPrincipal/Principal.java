package miPrincipal;


import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");//comentario
        //demostracion tipo de variale
        /*los tipo de varibale float y double tiene 3 variables */
        /*infinito positivo */
        /*infinito negativo*/
        /*Nah, I'd win */
        /*Nan (not number) */

        System.out.println(Math.sqrt(8));//retorno un punto flotante
        System.out.println(Math.sqrt(-3));//NaN
        System.out.println(1.1e5*1.1e2);
        System.out.println(1.10000*1.10);//retoran infinito pos
        System.out.println(1.1e200*1.1e200);//da infinito

        calculardistancia();
        expresion();

    }
    public static void calculardistancia() {
        Scanner entrada=new Scanner(System.in);

        float d;
        float v,t;

        System.out.print("Proporciona velocidad m/s");
        v=entrada.nextFloat();
        System.out.print("Proporciona tiempo en s");
        t=entrada.nextFloat();
        d=v/t;

        System.out.println("Distancia= "+d+" Metros");
        entrada.close();
    }
    public static void expresion() {
        Scanner entrada=new Scanner(System.in);

        float r;
        int a,b;

        System.out.print("Proporciona valor de a");
        a=entrada.nextInt();
        System.out.print("Proporciona valor de b");
        b=entrada.nextInt();
        r=(float)Math.pow((a+b),2)/(3*b);

        System.out.println("Resultado= "+r);
        entrada.close();
    }
}