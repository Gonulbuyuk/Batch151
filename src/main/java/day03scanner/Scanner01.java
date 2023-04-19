package day03scanner;

//Java'nin util kutuphanesinden scanner class import edildi demektir
import java.util.Scanner;


public class Scanner01 {


    public static void main (String[] args){
        //1. adım : Scanner Class 'tan bir obje olustur
        Scanner input = new Scanner(System.in);

        //obje ismini input yaptik cunku kullanicidan alinan datayi benim kodlarimin icine koyacak

        //2.adim Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");
        //3.adim  Uygun method'u kullanarak kullanicinin verdigi datayi memory'e yerlestiriniz
        byte age =input.nextByte();
        System.out.println(age);

    }
}
