import java.util.Random;

public class soru5 {

    public static void main(String args[]) {
        Cember cember = new Cember();
        System.out.println(cember.getRenk());
        cember.setRenk("Siyah");
        System.out.println(cember.alanHesapla(1.1));
        System.out.println(cember.yaricapHesapla(16.4));
    }
}