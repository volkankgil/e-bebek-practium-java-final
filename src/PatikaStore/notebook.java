package PatikaStore;

import java.util.Scanner;

import java.util.*;


public class notebook extends productFeature {

    Scanner input=new Scanner(System.in);
    private int notebookNumberIDcontrol = 0;
    private static HashSet<Integer> notebookID = new HashSet<>();
    public static LinkedHashMap<Integer,notebook> notebooklist = new LinkedHashMap<>();
    int Ram ;
    int Storage;
    double screenSize;

    public notebook(String brandName, int brandID, int productId, String productName, int productUnitPrice, int productDiscountRatio, int ürünstokmiktarý, int Ram, int storage, double screenSize){
        super(brandName, brandID, productId, productName, productUnitPrice, productDiscountRatio,ürünstokmiktarý);
        this.Ram=Ram;
        this.Storage = storage;
        this.screenSize = screenSize;
    }
    public notebook(){
    }
    @Override
    public void menu(){
        System.out.println("1 - Notebook List" + "\n" +
                "2 - Add Notebook" + "\n" +
                "3 - Erase Notebook" + "\n" +
                "4 - Filter Notebook by Id");
        int number = input.nextInt();

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
    public void control(int control){
        while (notebookID.contains(control)){
            System.out.println("There is a product in this id! Please enter another id number.");
            control=input.nextInt();
        }
        notebookID.add(control);
    }
    public void addProduct() {
        System.out.println("Enter Notebook Id:");
        productId =input.nextInt();
        control(productId);

        System.out.print("Enter unit Price: ");
        productUnýtPrice = input.nextInt();

        System.out.print("Enter Discount Ratio: ");
        productDiscountRatio = input.nextInt();

        System.out.print("Enter Stock Quantity: ");
        productStockQuantity = input.nextInt();

        System.out.print("Enter Product Name: ");
        productName = input.nextLine();
        productName =input.nextLine();

        System.out.print("Enter Product Brand");
        for (brand b : brand.showBrandlist) {
            System.out.print(b.getBrandName() + " ");
        }
        setBrandName(input.nextLine());

        System.out.print("Enter RAM: ");
        Ram = input.nextInt();

        System.out.print("Enter Notebook Memory: ");
        Storage = input.nextInt();

        System.out.print("Enter Screen Size: ");
        screenSize = input.nextDouble();

        notebookNumberIDcontrol = productId;

        notebooklist.put(notebookNumberIDcontrol, new notebook(getBrandName(), getBrandId(), productId, productName, productUnýtPrice, productDiscountRatio, productStockQuantity, Ram, Storage, screenSize))  ;
        show();
    }
    public void show() {
        System.out.println("Notebook List");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Product Id | Product Name  | Product Price | Brand    | Product Stock Quantity  | Product Discount Quantity  | RAM    | Screen Size  | Memory   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (notebook notebookkk : notebooklist.values()) {
            System.out.printf("| %-10s | %-13s | %-13s | %-8s | %-23s | %-26s | %-6s | %-12s | %-9s | \n",
                    +notebookkk.getProductId(),
                    notebookkk.getProductName(),
                    notebookkk.getProductUnýtPrice(),
                    notebookkk.getBrandName(),
                    notebookkk.getProductStockQuantity(),
                    notebookkk.getProductDiscountRatio(),
                    notebookkk.getRam(),
                    notebookkk.getScreenSize(),
                    notebookkk.getStorage());
        }
    }
    public void delete(){
        System.out.println("Enter the product id of which phone you will delete.");
        int number=input.nextInt();
        notebooklist.remove(number);
        notebookID.remove(number);
        show();
    }
    public void search(){
        System.out.println("Please Enter the Id which you want searching.");
        int number=input.nextInt();
        if(notebookID.contains(number)){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| Product Id | Product Name   | Product Price  | Product Brand  | Product Stock  | Product Discount  | RAM    | Screen Size  | Memory   |");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.printf("| %-10s | %-14s | %-14s | %-14s | %-14s | %-17s | %-6s | %-12s | %-8s | \n",
                    notebooklist.get(number).getProductId(),
                    notebooklist.get(number).getProductName(),
                    notebooklist.get(number).getProductUnýtPrice(),
                    notebooklist.get(number).getBrandName(),
                    notebooklist.get(number).getProductStockQuantity(),
                    notebooklist.get(number).getProductDiscountRatio(),
                    notebooklist.get(number).getRam(),
                    notebooklist.get(number).getScreenSize(),
                    notebooklist.get(number).getStorage());
        }else{
            System.out.println("There is no product registered in this Id.");
        }
    }
    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
