import java.util.Scanner;
import java.util.Arrays;
public class enbuyukengucuksayiyayakin {
    public static void main(String[] args) {

//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
// en büyük en yakın sayıyı bulan programı yazınız.

        Scanner inp=new Scanner(System.in);
        int [] list={15,12,788,1,-1,-788,2,0};
        System.out.println("Dizi : "+Arrays.toString(list));
        int number;
        System.out.print("Girilen Sayı : ");
        number=inp.nextInt();
        Arrays.sort(list);
        int min =list[0];
        int max=list[7];
        for (int i:list){
            if (i>min && i<number){
                min=i;
            }

            if (i<max && i>number){
                max=i;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
    }
}
