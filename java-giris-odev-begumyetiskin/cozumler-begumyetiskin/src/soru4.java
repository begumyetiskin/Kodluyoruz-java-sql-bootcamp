import java.util.Random;

public class soru4 {

    public static void main(String args[]) {
        Random r = new Random();
        int[] dizi1 = new int[3 + (int) (Math.random() * 5)];
        int[] dizi2 = new int[3 + (int) (Math.random() * 5)];
        int[] dizi3 = new int[3 + (int) (Math.random() * 5)];
        int[] dizi4 = new int[3 + (int) (Math.random() * 5)];
        int enb, enk;
        dizi1 = sayiUret(100, dizi1);
        dizi2 = sayiUret(100, dizi2);
        dizi3 = sayiUret(100, dizi3);
        dizi4 = sayiUret(100, dizi4);
        diziYazdir(dizi1);
        diziYazdir(dizi2);
        diziYazdir(dizi3);
        diziYazdir(dizi4);
        minMaxBul(dizi1);
        minMaxBul(dizi2);
        minMaxBul(dizi3);
        minMaxBul(dizi4);
    }

    static int[] sayiUret(int sayi, int[] dizi) {
        Random r = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(sayi);
        }
        return dizi;
    }

    static void diziYazdir(int[] dizi) {
        for (int i : dizi) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------");
    }

    static void minMaxBul(int[] dizi) {
        int enb = dizi[0];
        int enk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enb) {
                enb = dizi[i];
            }
            if (dizi[i] < enk) {
                enk = dizi[i];
            }
        }
        System.out.println("En büyük sayı: " + enb + " En küçük sayı: " + enk);

    }
}