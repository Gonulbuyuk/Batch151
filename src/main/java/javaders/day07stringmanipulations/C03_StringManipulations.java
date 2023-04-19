package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {

        /*
Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
        v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu    i) En az 8 karakterden olussun\n" +
                "                ii)Password space icermesin\n" +
                "                iii)En az 1 tane buyuk harf olsun\n" +
                "                iv) En az 1 tane kucuk harf olsun\n" +
                "                v) En az 1 tane sembol olsun\n" +
                "                vi) En az 1 tanede rakam olsun \nuygun olarak giriniz ");
        String pwd = input.nextLine();
        // i) En az 8 karakterden olussun
        //boolean first =pwd.length()>=8;
        boolean first =pwd.length()>7;

        // ii)Password space icermesin
        boolean second=!pwd.contains(" ");
        // iii)En az 1 tane buyuk harf olsun
        // iv) En az 1 tane kucuk harf olsun
        // v) En az 1 tane sembol olsun
       // vi) En az 1 tanede rakam olsun
    }//main
}//class
