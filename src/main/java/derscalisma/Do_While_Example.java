package derscalisma;

import java.util.Scanner;

public class Do_While_Example {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi isteyiniz ve tamsayinin ilkrakamini ve sonrakamini toplayan kodu yaziniz

        Scanner scan =new Scanner(System.in);
        System.out.println("Tam sayi giriniz");

        int sayi =scan.nextInt();

        sayi=Math.abs(sayi);

        int sonRakam= sayi%10;
        int ilkRakam=sayi;

        while (ilkRakam>9){
            ilkRakam /=10;
        }
        System.out.println("ilkrakam:"+ilkRakam);
        System.out.println("Toplam:"+(ilkRakam+sonRakam));
        // Size verilen tam sayinin rakamlari toplamini ekrana yazdiran kodu yazdiriniz.

        int r = 578;

        int sum = 0;

        System.out.println(sum);

        while (r>0){

            sum = sum +r%10;

            r = r/10;
        }
        System.out.println(sum);
    }
}
