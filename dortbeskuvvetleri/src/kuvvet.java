import  java.util.Scanner;
public class kuvvet {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan
        // 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner sc = new Scanner(System.in);
        int n;
        int i,j;
        n = sc.nextInt();

         for ( j=1; j<n; j*=5 ){
             System.out.println("Bunlar beşin kuvvetleri :" + j);
         }
        for (i=1; i<n; i*=4){
            System.out.println("Bunlar dördün kuvvetleri :" + i);
        }

    }
}
