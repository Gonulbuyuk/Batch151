package javaders.ifStementsTernary;

import java.util.Scanner;


public class C03_ifStements {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();


        //2. ve kısa yol
        boolean haftasonu=gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi");
        boolean haftaici=gunIsmi.equals("pazartesi")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma");
        if (haftasonu){
            System.out.println("haftasonu");
        }
        if (haftaici) {
            System.out.println("haftaici");
        }
        if (!(haftasonu||haftaici))
            System.out.println("yanliş deger girdiniz lutfen gecerli bir deger giriniz");

/*       1. ve uzun yol
        if (gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi"))
            System.out.println("Hafta Sonu");

        if (gunIsmi.equals("pazartesi")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma"))
            System.out.println("Hafta içi");

        if (!(gunIsmi.equals("pazar")||
                gunIsmi.equals("cumartesi")||
                gunIsmi.equals("pazartesi")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma"))) System.out.println("gecersiz deger girdiniz lutfen bir gun ismi giriniz");

 */

    }
}