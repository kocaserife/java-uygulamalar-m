import java.util.Scanner;
public class dairecevrealan {
    public static void main(String[] args) {
        //Dairenin Alanını ve Çevresini Hesaplayan Program
        // Alan Formülü : π * r * r;
        //Çevre Formülü : 2 * π * r;

        int r;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        r= input.nextInt();

        double alan = pi*r*r;
        System.out.println("dairenin alanı : "+ alan);

          double cevre = 2*pi*r;
        System.out.println("dairenin cevresi : "+ cevre);

    }
}
