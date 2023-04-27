import java.util.Scanner;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        // Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız

        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu  : ");
        n=input.nextInt();
        int  a =1;
        int [] number=new int[n];
        for (int i=0; i<number.length; i++){
            System.out.print( a +". Elemani : ");
            a+=1;
            number[i]=input.nextInt();
        }
        Arrays.sort(number);
        System.out.println("Siralama : "+Arrays.toString(number));
    }
}
