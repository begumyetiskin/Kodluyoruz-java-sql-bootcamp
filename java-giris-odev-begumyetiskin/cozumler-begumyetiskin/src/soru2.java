import java.util.Scanner;

public class soru2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sayı Giriniz:");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 20) System.out.println("soğuk");
        else if (sicaklik >= 20 && sicaklik <= 30) System.out.println("ılık");
        else if (sicaklik >= 30) System.out.println("sıcak");
    }
}