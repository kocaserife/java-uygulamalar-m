import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, Password;
        int remain = 3, balance = 1500, select, add, subtract;
        do {
            System.out.print("Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            Password = input.nextLine();

            if (userName.equals("şerife") && Password.equals("dev123")) {
                System.out.println("Bankaya hoşgeldin");

                do {
                    System.out.println("1-Para yatırma \n" + "2-Para çekme\n"
                            + "3-Bakiye sorgulama\n" + "4-Çıkış\n");
                    System.out.print("Yapacağınız işlemi seçiniz :");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Kaç para yatıracaksınız:");
                            add = input.nextInt();
                            balance += add;
                            break;
                        case 2:
                            System.out.print("Kaç para çekeceksiniz :");
                            subtract = input.nextInt();
                            if (balance > subtract) {

                                balance -= subtract;

                            } else {
                                System.out.println("Bakiye yetersiz");
                            }
                            break;
                        case 3:

                            System.out.println("Bakiyeniz:" + balance);
                            break;
                        case 4:
                            System.out.println("Hadi görüşürüz...");
                            remain = 0;
                            break;

                    }
                } while (select != 4);

            } else {
                System.out.println("hatalı işlem " + --remain);
                if (remain == 0) {
                    System.out.println("Hesabın bloke oldu..");
                }
            }

        } while (remain > 0);
    }
}