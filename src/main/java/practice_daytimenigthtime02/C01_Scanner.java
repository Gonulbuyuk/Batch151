package practice_daytimenigthtime02;


import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        // INTERWIEW QUESTIONS
        // Ex : Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yaziniz

        /*

                  A     // 2 space+ ch + 2 space
                 A A    // 1 space + ch + 1 space +ch + 1 space
                A A A  //  1 ch + 1 space +1 ch + 1 space+ 1 ch
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz...");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        // Ex : Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin
        // sonuclarini ekrana yazdiran basit bir hesap makinesi kodunu yaziniz







    }//main
}//class