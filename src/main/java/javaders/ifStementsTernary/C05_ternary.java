package javaders.ifStementsTernary;
import java.util.Scanner;

public class C05_ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        String str=sayi%2==0? "sayi cifttir":"sayi tektir";
        System.out.println(str);

    }
}