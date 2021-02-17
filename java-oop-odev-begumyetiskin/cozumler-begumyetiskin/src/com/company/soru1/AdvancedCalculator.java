package com.company.soru1;

public class AdvancedCalculator extends BasicCalculator implements Scientific {

    public static void main(String[] args) {
        AdvancedCalculator islem = new AdvancedCalculator();
        islem.carpma(8, 60);
        islem.bolme(7, 5);
        islem.kareHesapla(4);
        islem.kupHesapla(5);
    }

    @Override
    public void kareHesapla(double sayi) {
        System.out.println("Sayının Karesi: " + (Math.pow(sayi, 2)));
    }

    @Override
    public void kupHesapla(double sayi) {
        System.out.println("Sayının Küpü: " + (Math.pow(sayi, 3)));
    }
}
