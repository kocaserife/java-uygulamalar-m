import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {

        //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        // yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Basamak Sayisi:");
        n=sc.nextInt();


        for (int m=1;m<=n;m++){

            for (int x=1;x<=m;x++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*(n-m+1)-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
