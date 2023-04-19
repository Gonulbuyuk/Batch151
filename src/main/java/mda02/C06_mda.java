package mda02;

import java.util.Arrays;

public class C06_mda {
    public static void main(String[] args) {
        /*
        soru 6) bir multi-dimensional array olusturun ve
        outer indexlerin inner indexlerini tek tek kontrol edip
        en buyuk degerlerini yazdırın
         */
        int sayilar[][]={{57,8,37},{99,88,11},{32,34,15,12},{2,3,5,1}};
        for (int i = 0; i < sayilar.length; i++) {
            Arrays.sort(sayilar[i]);
            System.out.println(sayilar[i][sayilar[i].length-1]);
        }
        System.out.println(Arrays.deepToString(sayilar));
    }
}