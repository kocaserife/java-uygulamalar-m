import java.util.Arrays;
public class dizidekiElemanlarinFrekansii {
    public static void main(String[] args) {


        //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini
        // yani frekanslarını bulan programı yazınız.
        int[] dizi = {58, 64, 64, 1, 64, 55, 2, 10, 37, 5, 32,74,74,69,58};
        int[] frekans = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
            frekans[i] = 1;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    frekans[i]++;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    dizi[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
        for (int i = 0; i < dizi.length; i++) {
            if (frekans[i] > 1) {
                if (dizi[i] != 0)
                    System.out.println(dizi[i] + " --> " + frekans[i] + " kere tekrar edildi.");
            }
        }
    }
}

