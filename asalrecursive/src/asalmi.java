import java.util.Scanner;

public class asalmi {


    static void isprimenumber() {

    }
    static boolean checkPrime(int number,int index){
        if(number<=2){
            return number == 2;
        }
        if(number % index==0){
            return false;
        }
        if(index*index>number){
            return true;
        }
        return checkPrime(number,index+1);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Enter Number: ");
            int number=input.nextInt();
            if(checkPrime(number,2)){
                System.out.println(" Asal ");
            }else{
                System.out.println(" Asal değil");
            }
        }
    }
}