
import java.util.Scanner;
public class kitleindeksihesaplama {
    public static void main(String[] args) {
        //Kilo (kg) / Boy(m) * Boy(m)
        double kilo;
        double boy;
        double islem;

Scanner input = new Scanner(System.in);

        kilo= input.nextDouble();
        boy =input.nextDouble();

        islem = kilo/ (boy*boy);
        System.out.println(islem);
    }
}
