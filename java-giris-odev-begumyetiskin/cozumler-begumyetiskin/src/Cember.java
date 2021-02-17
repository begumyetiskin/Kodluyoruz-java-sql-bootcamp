import java.util.Scanner;

public class Cember {
    double pi = Math.PI;
    double yaricap, alan;
    String renk;

    public Cember() {
        this.renk = "Kırmızı";
        this.yaricap = 2.3;
        this.alan = 12.4;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getAlan() {
        return alan;
    }

    public void setAlan(double alan) {
        this.alan = alan;
    }

    double alanHesapla(double r) {
        return pi * yaricap * yaricap;
    }

    double yaricapHesapla(double alan){
        return alan / (2*pi);
    }

}