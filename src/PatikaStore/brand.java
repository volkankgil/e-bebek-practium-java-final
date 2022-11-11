package PatikaStore;

import java.util.Scanner;
import java.util.TreeSet;

public class brand {
    String Markaİsmi;
    int Markaid;

    public brand(String Markaİsmi, int Markaid){
        this.Markaİsmi=Markaİsmi;
        this.Markaid=Markaid;
    }

    public brand(){
    }

    public static TreeSet<brand> markalistele = new TreeSet<>(new orderbybrand());

    static { // static kod blokları içine attığımız için hafızaya attı. nesne üretmeye gerek yok.
        markalistele.add(new brand("Casper", 1));
        markalistele.add(new brand("Samsung", 2));
        markalistele.add(new brand("Lenova", 3));
        markalistele.add(new brand("Xiaomi", 4));
        markalistele.add(new brand("Apple", 5));
        markalistele.add(new brand("Asus", 6));
        markalistele.add(new brand("Huwaie", 7));
        markalistele.add(new brand("HP", 8));
        markalistele.add(new brand("Monster", 9));
    }

    public void showBrands() {
        System.out.println("MARKALARIMIZ");
        System.out.println("---------");
        for (brand a : markalistele) {
            System.out.println(a.getMarkaİsmi());
        }
    }
    public String getMarkaİsmi() {
        return Markaİsmi;
    }

    public void setMarkaİsmi(String markaİsmi) {
        Markaİsmi = markaİsmi;
    }

    public int getMarkaid() {
        return Markaid;
    }

    public void setMarkaid(int markaid) {
        Markaid = markaid;
    }
}
