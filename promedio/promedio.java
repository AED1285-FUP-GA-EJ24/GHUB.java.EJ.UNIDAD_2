package promedio;

import java.util.Scanner;

public class promedio {
    public void calcularpromedio(){
        Scanner entrada =new Scanner(System.in);

        int n1,n2,n3,r;
        System.out.print("Proporciona parcioal 1. ");
        n1=entrada.nextInt();
        System.out.print("Proporciona parcioal 2. ");
        n2=entrada.nextInt();
        System.out.print("Proporciona parcioal 3. ");
        n3=entrada.nextInt();
        r=(n1+n2+n3)/3;
        System.out.println("Resultado= "+ r);
    }
}
