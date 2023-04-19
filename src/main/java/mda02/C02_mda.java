package mda02;

public class C02_mda {
    public static void main(String[] args) {
        /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */

        int sayilar[][]={{57,8,37},{99,88,11},{32,34,15,12},{2,3}};
        elementYazdir(sayilar);

    }

    public static void elementYazdir(int[][] sayilar) {
        for (int[] a:sayilar
        ) {
            for (int w:a
            ) {
                System.out.print(w+" ");
            }
            System.out.println("\n"+"----------------------------");
        }
    }
}