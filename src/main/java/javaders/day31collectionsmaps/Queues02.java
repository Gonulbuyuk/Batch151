package javaders.day31collectionsmaps;

import java.util.*;

/*
Queue<String> line=new PriorityQueue<>();//Burada LinkedListed kullanmadik. Bankalar icin LinkedListed
//uygundur. Cunku once gelen once sira alir.
//PriorityQueue ise belirlenen oncelige gore sira verilirse uygundur.
//Oncelik durumu, uzunluga, ismin son harfine gore belirlenebilir. Java kendi belirledigi kurala gore dizer.
 */
public class Queues02 {
    public static void main(String[] args) {
        Queue<String> line =new PriorityQueue<>();
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);
//Deque ==> Iki uclu "Queue" demek.
        //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur
        Deque<String> d= new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");

    }
}
