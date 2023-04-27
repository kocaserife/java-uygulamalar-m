import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        boolean artikYil = false;
        int yil;

        Scanner input=new Scanner(System.in);
        System.out.print("Yil Gir:");
        yil=input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0){
                    artikYil = true;
                }else{
                    artikYil = false;
                }
            }else {
                artikYil = true;
            }
        } else{
            artikYil = false;
        }

        // artikYil Durumuna Göre Çıktı Ver.
        if (artikYil){
            System.out.println("artık yıldır");
        }else{
            System.out.println("artık yıldır değildir");
        }
    }
}