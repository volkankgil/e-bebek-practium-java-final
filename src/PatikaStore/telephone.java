package PatikaStore;

import java.util.*;

public class telephone extends productFeature {

    public static HashSet<Integer> telephoneID =new HashSet<>();

    int telephoneIdcontrolNumber =0;

    public static LinkedHashMap<Integer, telephone> addTelephone =new LinkedHashMap<>();

    Scanner input=new Scanner(System.in);
    int telephoneMemory;
    double screenSize;
    int batteryPower;
    int RAM ;
    String telephoneColour;

    public telephone(String Marka�smi, int Markaid, int �r�nid, String �r�nad�, int �r�nbirimfiyat, int �r�nindirimoran�, int �r�nstokmiktar�, int telephoneMemory, double screenSize, int batteryPower, int RAM, String telephoneColour){
        super(Marka�smi,Markaid,�r�nid,�r�nad�,�r�nbirimfiyat,�r�nindirimoran�,�r�nstokmiktar�);
        this.telephoneMemory = telephoneMemory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.RAM=RAM;
        this.telephoneColour = telephoneColour;
    }

    public telephone(){
        // bo� telephone constructor'�n� store da olu�turdu�umuz telephone nesnesi i�in yaz�yoruz. storeda olu�turdu�umuz nesne ile menu metodunu �a��r�yoruz.
    }
    public void menu(){
        System.out.println("1 - Mobile Phone List " + "\n" +
                "2 - Add Mobile Phone " + "\n" +
                "3 - Erase Mobile Phone " + "\n" +
                "4 - Filter Mobile Phone By Id ");

        int number=input.nextInt();

        switch (number){
            case 1:
                show();
                break;
            case 2:
                addProduct();
                break;
            case 3:
                delete();
                break;
            case 4:
                search();
                break;
        }
    }
    public void control(int �dNumber){
        while (telephoneID.contains(�dNumber)){
            System.out.println("There is a product in this id! Please enter another id number.");
            �dNumber =input.nextInt();
        }
        telephoneID.add(�dNumber);
    }
    @Override
    public void addProduct() {
        System.out.println("Enter Telephone Id:");
        productId =input.nextInt();
        control(productId);

        System.out.println("Enter Telephone Name");
        productName =input.nextLine();
        productName =input.nextLine();

        System.out.println("Enter Telephone Unit Price:");
        productUn�tPrice =input.nextInt();

        System.out.println("Enter Telephone Brand:");
        for (brand b: showBrandlist) {
            System.out.print(b.getBrandName()  +  "  ");
        }
        setBrandName(input.nextLine());
        setBrandName(input.nextLine());

        System.out.println("Enter Telephone Stock:");
        productStockQuantity =input.nextInt();

        System.out.println("Enter Telephone Discount Ratio:");
        productDiscountRatio =input.nextInt();

        System.out.println("Enter Telephone RAM:");
        RAM=input.nextInt();

        System.out.println("Enter Telephone Screen Size:");
        screenSize =input.nextDouble();

        System.out.println("Enter Telephone Memory:");
        telephoneMemory =input.nextInt();

        System.out.println("Enter Telephone Battery Power:");
        batteryPower =input.nextInt();

        System.out.println("Enter Telephone Colour:");
        telephoneColour = input.nextLine();
        telephoneColour = input.nextLine();

        telephoneIdcontrolNumber = productId;   // �r�n id'ye e�itledi�imizde , has setteki value de�erlerine atama yap�yor.

        addTelephone.put(telephoneIdcontrolNumber,new telephone(getBrandName(), getBrandId(), productId, productName, productUn�tPrice, productDiscountRatio, productStockQuantity, telephoneMemory, screenSize,RAM, batteryPower, telephoneColour));
    }

    @Override
    public void delete() {
        System.out.println("Enter the product id of which phone you will delete.");
        int number=input.nextInt();
        addTelephone.remove(number);
        telephoneID.remove(number);
    }

    public void show(){

        System.out.println("Telephone List");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|Product ID    | Product Name  | Product Price  | Brand    | Stock Quantity | Discount Ratio | RAM  | Screen Size | Memory | Battery Power | Telephone Colour ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for(telephone tel: addTelephone.values()){
            System.out.printf("| %-10s | %-9s | %-14s | %-8s | %-14s | %-14s | %-4s | %-11s | %-7s | %-12s | %-8s \n",
                    +tel.getProductId(),
                    tel.getProductName(),
                    tel.getProductUn�tPrice(),
                    tel.getBrandName(),
                    tel.getProductStockQuantity(),
                    tel.getProductDiscountRatio(),
                    tel.getRAM(),
                    tel.getScreenSize(),
                    tel.getTelephoneMemory(),
                    tel.getBatteryPower(),
                    tel.getTelephoneColour());
        }
    }
    @Override
    public void search() {
        System.out.println("Please Enter the Id which you want searching.");

        int �dselect=input.nextInt();

        if(telephoneID.contains(�dselect)){
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("|Product ID    | Product Name           | Product Price          | Brand         | Stock Quantity        | Discount Ratio      | RAM    | Screen Size      | Memory   | Battery Power |  Telephone Colour |");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | \n",

                    +addTelephone.get(�dselect).getProductId(),
                    addTelephone.get(�dselect).getProductName(),
                    addTelephone.get(�dselect).getProductUn�tPrice(),
                    addTelephone.get(�dselect).getBrandName(),
                    addTelephone.get(�dselect).getProductStockQuantity(),
                    addTelephone.get(�dselect).getProductDiscountRatio(),
                    addTelephone.get(�dselect).getRAM(),
                    addTelephone.get(�dselect).getScreenSize(),
                    addTelephone.get(�dselect).getTelephoneMemory(),
                    addTelephone.get(�dselect).getBatteryPower(),
                    addTelephone.get(�dselect).getTelephoneColour());
        }else {
            System.out.println("There is no product registered in this Id.");
        }
    }
    public int getTelephoneMemory() {
        return telephoneMemory;
    }
    public void setTelephoneMemory(int telephoneMemory) {
        this.telephoneMemory = telephoneMemory;
    }
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getTelephoneColour() {
        return telephoneColour;
    }

    public void setTelephoneColour(String telephoneColour) {
        this.telephoneColour = telephoneColour;
    }
}
