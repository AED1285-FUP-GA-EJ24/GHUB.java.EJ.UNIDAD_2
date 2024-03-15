package calculadora;

import java.util.Scanner;

public class Calculadora{
    public void Suma() {
        Scanner.entrada=new Scanner(System.in);
        int R;
        int x1,x2;
        System.out.println("*******************");
        System.out.println("       Suma        ");
        System.out.println("*******************");
        System.out.print("Primer numero= ");
        x1= entrada.nextint();
        System.out.print("Segundo numero= ");
        x2= entrada.nextint();
        R=x1+x2;
        System.out.println("Resultado= "+R);
        entrada.close();
        
    }
    public void Resta() {
        Scanner.entrada=new Scanner(System.in);
        int R;
        int x1,x2;
        System.out.println("*******************");
        System.out.println("       Resta       ");
        System.out.println("*******************");
        System.out.print("Primer numero= ");
        x1= entrada.nextint();
        System.out.print("Segundo numero= ");
        x2= entrada.nextint();
        R=x1-x2;
        System.out.println("Resultado= "+R);
        entrada.close();
    }
    public void Multi() {
        Scanner.entrada=new Scanner(System.in);
        int R;
        int x1,x2;
        System.out.println("*******************");
        System.out.println("  Multiplicalcion  ");
        System.out.println("*******************");
        System.out.print("Primer numero= ");
        x1= entrada.nextint();
        System.out.print("Segundo numero= ");
        x2= entrada.nextint();
        R=x1*x2;
        System.out.println("Resultado= "+R);
        entrada.close();
    }
    public void Divid() {
        Scanner.entrada=new Scanner(System.in);
        int R;
        int x1,x2;
        System.out.println("*******************");
        System.out.println("      Division     ");
        System.out.println("*******************");
        System.out.print("Primer numero= ");
        x1= entrada.nextint();
        System.out.print("Segundo numero= ");
        x2= entrada.nextint();
        R=x1/x2;
        System.out.println("Resultado= "+R);
        entrada.close();
    }
    public void Residuo() {
        Scanner.entrada=new Scanner(System.in);
        int R;
        int x1,x2;
        System.out.println("*******************");
        System.out.println("      Residuo      ");
        System.out.println("*******************");
        System.out.println("Proporciona valor 1:");
        x1=entrada.nextInt();
        System.out.println("Proporciona valor 2:");
        x2=entrada.nextInt();
        R= x1%x2;
        System.out.println("Residuo = "+r);
        entrada.close();

    }
}