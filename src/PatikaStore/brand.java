package PatikaStore;

import java.util.TreeSet;

public class brand {
    String brandName;
    int brandId;

    public brand(String brandName, int brandId){
        this.brandName = brandName;
        this.brandId = brandId;
    }

    public brand(){
    }

    public static TreeSet<brand> showBrandlist = new TreeSet<>(new orderbybrand());

    static { // static kod bloklarý içine attýðýmýz için hafýzaya attý. nesne üretmeye gerek yok.
        showBrandlist.add(new brand("Casper", 1));
        showBrandlist.add(new brand("Samsung", 2));
        showBrandlist.add(new brand("Lenova", 3));
        showBrandlist.add(new brand("Xiaomi", 4));
        showBrandlist.add(new brand("Apple", 5));
        showBrandlist.add(new brand("Asus", 6));
        showBrandlist.add(new brand("Huwaie", 7));
        showBrandlist.add(new brand("HP", 8));
        showBrandlist.add(new brand("Monster", 9));
    }

    public void showBrands() {
        System.out.println("OUR BRANDS : ");
        System.out.println("---------");
        for (brand a : showBrandlist) {
            System.out.println(a.getBrandName());
        }
    }
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
}
