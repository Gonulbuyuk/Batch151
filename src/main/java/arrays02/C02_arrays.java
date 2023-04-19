package arrays02;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve
        olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
        */
        int sayilar[]={5,19,15,56,23,81,99,57};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
}