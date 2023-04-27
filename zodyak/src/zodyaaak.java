import java.util.Scanner;
public class zodyaaak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int kalan;
int dog;
int a=12;
        System.out.println("Doğum yılınızı giriniz : ");
        dog = input.nextInt();


        kalan= dog % a;
        System.out.println("12 ye bölümünden kalan :" + kalan);

if(kalan==0){
    System.out.println("Maymun");

}else if (kalan==1){
            System.out.println("horoz");
        }else if(kalan==3){
            System.out.println("köpek");
        }
else if(kalan==4){
    System.out.println("domuz");
}else if(kalan==5){
    System.out.println("fare");
}


}
}