package com.company.soru1;

public class BasicCalculator implements Calculator {


    @Override
    public void toplama(double sayi1, double sayi2) {
        System.out.println("Toplam: " + (sayi1 + sayi2));
    }

    @Override
    public void cikarma(double sayi1, double sayi2) {
        System.out.println("Fark: " + (sayi1 - sayi2));
    }

    @Override
    public void carpma(double sayi1, double sayi2) {
        System.out.println("Çarpım: " + (sayi1 * sayi2));
    }

    @Override
    public void bolme(double sayi1, double sayi2) {
        System.out.println("Bölüm: " + (sayi1 / sayi2));
    }
}
