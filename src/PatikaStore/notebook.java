package PatikaStore;

import java.util.Scanner;

import java.util.*;


public class notebook extends ürünözellikleri{

    Scanner input=new Scanner(System.in);
    private int notebookNumberIDcontrol = 0;
    private static HashSet<Integer> notebookID = new HashSet<>();
    public static LinkedHashMap<Integer,notebook> notebooklist = new LinkedHashMap<>();
    int Ram ;
    int Depolama;
    double EkranBoyutu;

    public notebook(String MarkaÝsmi, int Markaid, int ürünid, String ürünadý, int ürünbirimfiyat, int ürünindirimoraný, int ürünstokmiktarý, int Ram, int depolama, double ekranBoyutu){
        super(MarkaÝsmi,Markaid,ürünid,ürünadý,ürünbirimfiyat,ürünindirimoraný,ürünstokmiktarý);
        this.Ram=Ram;
        this.Depolama=depolama;
        this.EkranBoyutu=ekranBoyutu;
    }
    public notebook(){
    }
    @Override
    public void menu(){
        System.out.println("1 - Notebooklarý listele" + "\n" +
                "2 - Notebook ekle" + "\n" +
                "3 - Notebook sil" + "\n" +
                "4 - Notebooklarý ID ye göre filtreleme");
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
            System.out.println("bu ýd zaten kullanlýyor. tekrar ýd giriniz");
            control=input.nextInt();
        }
        notebookID.add(control);
    }
    public void addProduct() {
        System.out.println("Ürün ýd'si giriniz:");
        ürünid=input.nextInt();
        control(ürünid);

        System.out.print("Ürünün fiyatýný giriniz: ");
        ürünbirimfiyat = input.nextInt();

        System.out.print("Ürünün indirim oranýný giriniz: ");
        ürünindirimoraný = input.nextInt();

        System.out.print("Ürünün stoðunu giriniz: ");
        ürünstokmiktarý= input.nextInt();

        System.out.print("Ürünün ismini giriniz: ");
        ürünadý= input.nextLine();
        ürünadý=input.nextLine();

        System.out.print("Ürünün Markasýný seçiniz");
        for (brand b : brand.markalistele) {
            System.out.print(b.getMarkaÝsmi() + " ");
        }
        setMarkaÝsmi(input.nextLine());

        System.out.print("Ürünün ramini giriniz: ");
        Ram = input.nextInt();

        System.out.print("Ürünün depolama alan?n? giriniz: ");
        Depolama = input.nextInt();

        System.out.print("Ürünün ekran boyutunu giriniz: ");
        EkranBoyutu = input.nextDouble();

        notebookNumberIDcontrol = ürünid;

        notebooklist.put(notebookNumberIDcontrol, new notebook(getMarkaÝsmi(), getMarkaid(), ürünid, ürünadý, ürünbirimfiyat, ürünindirimoraný, ürünstokmiktarý, Ram, Depolama,EkranBoyutu))  ;
        show();
    }
    public void show() {
        System.out.println("Notebook listesi");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID    | Ürün Adý           | Fiyatý          | Markasý         | Stoðu        | Ýndirim Oraný      | RAM    | Ekran Boyutu      | Hafýzasý   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (notebook notebookkk : notebooklist.values()) {
            System.out.printf("| %-2s | %-22s | %-12s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    +notebookkk.getÜrünid(),
                    notebookkk.getÜrünadý(),
                    notebookkk.getÜrünbirimfiyat(),
                    notebookkk.getMarkaÝsmi(),
                    notebookkk.getÜrünstokmiktarý(),
                    notebookkk.getÜrünindirimoraný(),
                    notebookkk.getRam(),
                    notebookkk.getEkranBoyutu(),
                    notebookkk.getDepolama());
        }
    }

    public void delete(){
        System.out.println("Hangi ürünü silecekseniz ID'sini giriniz:");
        int number=input.nextInt();
        notebooklist.remove(number);
        notebookID.remove(number);
        show();
    }
    public void search(){
        System.out.println("Arayacaðýnýz id:");
        int number=input.nextInt();
        if(notebookID.contains(number)){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adý                  | Fiyatý          | Markasý         | Stoðu        | Ýndirim Oraný      | RAM    | Ekran Boyutu      | Hafýzasý   |");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    notebooklist.get(number).getÜrünid(),
                    notebooklist.get(number).getÜrünadý(),
                    notebooklist.get(number).getÜrünbirimfiyat(),
                    notebooklist.get(number).getMarkaÝsmi(),
                    notebooklist.get(number).getÜrünstokmiktarý(),
                    notebooklist.get(number).getÜrünindirimoraný(),
                    notebooklist.get(number).getRam(),
                    notebooklist.get(number).getEkranBoyutu(),
                    notebooklist.get(number).getDepolama());
        }else{
            System.out.println("Böyle bir ürün yoktur.");
        }
    }
    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getDepolama() {
        return Depolama;
    }

    public void setDepolama(int depolama) {
        Depolama = depolama;
    }
    public double getEkranBoyutu() {
        return EkranBoyutu;
    }
    public void setEkranBoyutu(double ekranBoyutu) {
        EkranBoyutu = ekranBoyutu;
    }
}
