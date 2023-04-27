import  java.util.Scanner;
public class harmonii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("deger giriniz :");

        int n = sc.nextInt();
        double sonuc=0;
        for (int i=1; i<=n; i++ ){
            sonuc+= (1.0/i);
        }
        System.out.println("sonucunuz : " + sonuc  );

    }
}