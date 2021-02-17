import java.util.Scanner;

public class soru3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Yazı Giriniz:");
        String kelime = scanner.nextLine();
        for (int i = kelime.length(); i > 0; i--) {
            System.out.print(kelime.substring(i - 1, i));
        }

    }
}