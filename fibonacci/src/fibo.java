import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        //Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.

        Scanner sc = new Scanner(System.in);

        int n;
        int total;
        int sayi1 = 0, sayi2 = 1;
        System.out.print("n sayısını gir : ");
        n = sc.nextInt();
        System.out.print(sayi1+" "+sayi2);//0 ve 1 yazdır
        for (int i = 2; i < n; i++) {
            total = sayi1 + sayi2;
            System.out.print("  " +total);
            sayi1 = sayi2;
            sayi2 = total;
        }
        System.out.println();
    }
}

