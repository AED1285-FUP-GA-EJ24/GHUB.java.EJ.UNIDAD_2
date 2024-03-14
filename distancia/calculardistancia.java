package distancia;

import java.util.Scanner;

public class calculardistancia {
    public void calculardistancia() {
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
    
}
