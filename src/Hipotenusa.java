import java.util.Scanner;
public class Hipotenusa {

    public void hip(){
        int caA, caB, sumaCa;
        double hipotenusa;
        Scanner h = new Scanner(System.in);

        System.out.print("Ingresa el primer cateto: ");
        caA = h.nextInt();
        System.out.print("Ingresa el segundo cateto: ");
        caB = h.nextInt();

        caA = caA * caA;
        caB = caB * caB;
        sumaCa = caA + caB;
        hipotenusa = Math.sqrt(sumaCa);

        System.out.println("La hipotenusa es: "+ hipotenusa);

    }
}
