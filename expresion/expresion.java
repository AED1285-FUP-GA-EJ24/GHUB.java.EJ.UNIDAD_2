package expresion;

import java.util.Scanner;

public class expresion {
    public void expresion() {
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
