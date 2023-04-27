import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {

      /*  Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

        float gir;
        float hava = 0;
        Scanner input = new Scanner(System.in);
        gir = input.nextFloat();

        if(gir<5){
            System.out.println("kayak yapabilirsin");
        }
        else if (gir<5 || gir<15){
            System.out.println("sinemaya gidebilirsin");
        }
        else if (gir<15 || gir< 25){
            System.out.println("pikniğe gidebilirsin");
        }
        else if (gir>25){
            System.out.println("yüzmeye gidebilirsin");
        }


    }
}
