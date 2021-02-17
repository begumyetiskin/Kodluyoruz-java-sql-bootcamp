import java.util.Scanner;

public class soru1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int ilkDeger = sayi;
        int kalan, deger = 0;

        for (int i = 0; i < String.valueOf(ilkDeger).length(); i++) {
            kalan = sayi % 10;
            deger = deger * 10 + kalan;
            sayi = sayi / 10;
        }

        if (deger == ilkDeger) {
            System.out.println(deger + " Palindrom Sayıdır.");
        } else {
            System.out.println(deger + " Palindrom Sayı Değildir.");
        }

    }
}