import java.util.Scanner;

public class ebbobekkok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;
        int i = 1, j = 1;
        int ebob = 1;
        int ekok = 1;
        System.out.print("n1 sayıyısını giriniz : ");
        x = sc.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        y = sc.nextInt();

        while (i < x && i < y) {

            if (x % i == 0 && y % i == 0) {
                ebob = i;

            }
            i++;

        }
        System.out.println("Ebob:" + ebob);


        //İki ya da daha fazla doğal sayının ortak katlarının
        // en küçüğüne bu sayıların en küçük ortak katı


        while (j < x * y) {

            if (j % x == 0 && j % y == 0) {
                ekok = j;

            }
            j++;

        }
        System.out.println("Ekok:" + ekok);


    }
}
