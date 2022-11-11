package PatikaStore;

import java.util.*;

public class telefon extends ürünözellikleri{

    public static HashSet<Integer>telefonID=new HashSet<>();

    int telefonidcontrolnumber =0;

    public static LinkedHashMap<Integer,telefon>telefonekle=new LinkedHashMap<>();

    Scanner input=new Scanner(System.in);
    int telefonunhafýzasý;    //(128 GB, 64 GB)

    double EkranBoyutu; //(6.1 Inc)

    int PilGücü; //(4000)

    int RAM ;   //(6 MB)

    String Renk;   //(Siyah,Kýrmýzý,Mavi

    public telefon(String MarkaÝsmi, int Markaid, int ürünid, String ürünadý, int ürünbirimfiyat, int ürünindirimoraný, int ürünstokmiktarý, int telefonunhafýzasý, double EkranBoyutu, int PilGücü, int RAM, String renk){
        super(MarkaÝsmi,Markaid,ürünid,ürünadý,ürünbirimfiyat,ürünindirimoraný,ürünstokmiktarý);
        this.telefonunhafýzasý=telefonunhafýzasý;
        this.EkranBoyutu=EkranBoyutu;
        this.PilGücü=PilGücü;
        this.RAM=RAM;
        this.Renk=renk;
    }

    public telefon(){
        // boþ telefon constructor'ýný store da oluþturduðumuz telefon nesnesi için yazýyoruz. storeda oluþturduðumuz nesne ile menu metodunu çaðýrýyoruz.
    }

    public void menu(){
        System.out.println("1 - Cep telefonalarý listele" + "\n" +
                "2 - Cep telefonu ekle" + "\n" +
                "3 - Cep telefonu sil" + "\n" +
                "4 - Cep telefonu ID ye göre filtreleme");

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

    public void control(int sayý){
        while (telefonID.contains(sayý)){
            System.out.println("Bu ürün kayýtlý baþka id giriniz.");
            sayý=input.nextInt();
        }
        telefonID.add(sayý);
    }
    @Override
    public void addProduct() {
        System.out.println("Ürün id'si giriniz:");
        ürünid=input.nextInt();
        control(ürünid);

        System.out.println("Ürün adý");
        ürünadý=input.nextLine();
        ürünadý=input.nextLine();

        System.out.println("Ürün fiyatý:");
        ürünbirimfiyat=input.nextInt();

        System.out.println("Ürün Markasý:");
        for (brand b:markalistele) {
            System.out.print(b.getMarkaÝsmi()  +  "  ");
        }
        setMarkaÝsmi(input.nextLine());
        setMarkaÝsmi(input.nextLine());

        System.out.println("Ürün Stoðu:");
        ürünstokmiktarý=input.nextInt();

        System.out.println("indirim Oraný:");
        ürünindirimoraný=input.nextInt();

        System.out.println("RAM:");
        RAM=input.nextInt();

        System.out.println("Ekran Boyutu:");
        EkranBoyutu=input.nextDouble();

        System.out.println("Telefon Hafýza:");
        telefonunhafýzasý=input.nextInt();

        System.out.println("Pil gücü:");
        PilGücü=input.nextInt();

        System.out.println("Renk:");
        Renk= input.nextLine();
        Renk= input.nextLine();

        telefonidcontrolnumber=ürünid;   // ürün id'ye eþitlediðimizde , hassetteki value deðerlerine atama yapýyor.

        telefonekle.put(telefonidcontrolnumber,new telefon(getMarkaÝsmi(),getMarkaid(),ürünid,ürünadý,ürünbirimfiyat,ürünindirimoraný,ürünstokmiktarý,telefonunhafýzasý,EkranBoyutu,RAM,PilGücü,Renk));
    }

    @Override
    public void delete() {
        System.out.println("Hangi ürünü silecekseniz numarasýný giriniz:");
        int number=input.nextInt();
        telefonekle.remove(number);
        telefonID.remove(number);
    }

    public void show(){

        System.out.println("Notebook listesi");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID    | Ürün Adý           | Fiyatý          | Markasý         | Stoðu        | Ýndirim Oraný      | RAM    | Ekran Boyutu      | Hafýzasý   | Pil Gücü |  Renk  |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for(telefon tel:telefonekle.values()){
            System.out.printf("| %-2s | %-22s | %-12s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-6s | %-10s \n",
                    +tel.getÜrünid(),
                    tel.getÜrünadý(),
                    tel.getÜrünbirimfiyat(),
                    tel.getMarkaÝsmi(),
                    tel.getÜrünstokmiktarý(),
                    tel.getÜrünindirimoraný(),
                    tel.getRAM(),
                    tel.getEkranBoyutu(),
                    tel.getTelefonunhafýzasý(),
                    tel.getPilGücü(),
                    tel.getRenk());
        }
    }
    @Override
    public void search() {
        System.out.println("Arayacaðýnýz ID giriniz.");
        int ýdselect=input.nextInt();

        if(telefonID.contains(ýdselect)){
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Ad?                  | Fiyat?          | Markas?         | Sto?u        | ?ndirim Oran?      | RAM    | Ekran Boyutu      | Haf?zas?   | Pil Kapasitesi  | Renk           | Kamera    |");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | \n",

                    +telefonekle.get(ýdselect).getÜrünid(),
                    telefonekle.get(ýdselect).getÜrünadý(),
                    telefonekle.get(ýdselect).getÜrünbirimfiyat(),
                    telefonekle.get(ýdselect).getMarkaÝsmi(),
                    telefonekle.get(ýdselect).getÜrünstokmiktarý(),
                    telefonekle.get(ýdselect).getÜrünindirimoraný(),
                    telefonekle.get(ýdselect).getRAM(),
                    telefonekle.get(ýdselect).getEkranBoyutu(),
                    telefonekle.get(ýdselect).getTelefonunhafýzasý(),
                    telefonekle.get(ýdselect).getPilGücü(),
                    telefonekle.get(ýdselect).getRenk());
        }else {
            System.out.println("böyle bir id yoktur.");
        }
    }
    public int getTelefonunhafýzasý() {
        return telefonunhafýzasý;
    }

    public void setTelefonunhafýzasý(int telefonunhafýzasý) {
        this.telefonunhafýzasý = telefonunhafýzasý;
    }

    public double getEkranBoyutu() {
        return EkranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        EkranBoyutu = ekranBoyutu;
    }

    public int getPilGücü() {
        return PilGücü;
    }

    public void setPilGücü(int pilGücü) {
        PilGücü = pilGücü;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String renk) {
        Renk = renk;
    }


}
