import java.util.Scanner;
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.
public class taksi {
    public static void main(String[] args) {
        int km;
        double kmbasina=2.20, acilisucret=10, total;
        Scanner input = new Scanner(System.in);
km= input.nextInt();


   total= (km*kmbasina);
total += acilisucret;

        total=  (total<20) ? 20: total;
        System.out.println(total);
    }
}
