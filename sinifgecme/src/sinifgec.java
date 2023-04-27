import java.util.Scanner;
public class sinifgec {
    public static void main(String[] args) {
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        int mat, fizik, turkce, kimya;
        double toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = input.nextInt();
        if(mat >0 && mat<=100) {
            toplam += mat;
        } else {
            System.out.println("Geçersiz not Girdiniz");

        }

        System.out.print("Fizik notunuz :");
        fizik = input.nextInt();
        if(fizik >0 && fizik<=100) {
            toplam += fizik;
        } else {
            System.out.println("Geçersiz not Girdiniz");

        }

        System.out.print("Türkçe notunuz :");
        turkce = input.nextInt();
        if(turkce >0 && turkce<=100) {
            toplam += turkce;
        } else {
            System.out.println("Geçersiz not Girdiniz");

        }

        System.out.print("Kimya notunuz :");
        kimya = input.nextInt();
        if(kimya >0 && kimya<=100) {
            toplam += kimya;
        } else {
            System.out.println("Geçersiz not Girdiniz");
        }


        double avarage = toplam / 4;
        if (avarage <= 55) {
            System.out.println("Sınıfta Kaldınız");

        } else {
            System.out.println("Tebrikler Geçtiniz");

        }

        System.out.println("Ortalamanız :" + avarage);

        }
    }

