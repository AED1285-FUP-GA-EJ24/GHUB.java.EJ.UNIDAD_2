package triangulo;

import java.util.Scanner;

public class Triangulo {

    public void calcularperimetrosuperficie() {
        Scanner entrada= new Scanner(System.in);
        double per,sup,base,altura,hip;
        System.out.print("Prporciona altura ");
        altura = entrada.nextDouble();
        System.out.print("Prporciona base ");
        base = entrada.nextDouble();
        sup=(base*altura)/2;
        hip=Math.sqrt(Math.pow(base,2))+(float)(Math.pow(altura, 2));
        per=base+altura+hip;
        System.out.println("Superficie= "+sup);
        System.out.println("Perimetro= "+per);

        entrada.close();
    }
}