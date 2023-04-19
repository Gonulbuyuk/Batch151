package day20arraylistdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    /*
        1) String Class kullanmak tercih edilir cunku String Class method acisindan cok zengindir.
        2) List.of () kullanarak kisayoldan List olusturabilirsiniz ama;
            i) Bu List'lerin Elemanlari degistirilemez.
            ii) Bu List'lere yeni eleman eklenemez.
            iii) Bu List'lerden eleman silinemez.
     */

    /*
    Example 1 : Kullanicini girdiği harf List' te var ise o harfi "Buldum!" a cevirin, yoksa o harfi List' e ekleyin
     */
    public static void main(String[] args) {

        List <String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter...");
        String letter = input.next().toUpperCase().substring(0,1);

        System.out.println(myList);

        if (myList.contains(letter)) {
            myList.set(myList.indexOf(letter),"Buldum");
        } else {
            myList.add(letter);
        }
        System.out.println(myList);

        List<Integer> m = List.of(12,21,34,53);
        m.add(43);
        m.remove(21);


    }
}