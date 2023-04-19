package mda02;

public class C07_mda {
    public static void main(String[] args) {
         /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */
        int sayilar[][]={{8,57,37},{99,88,11},{32,34,15,12},{2,3,5,1}};
        double ort=0;
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                toplam+=sayilar[i][j];
                ort=toplam/sayilar[i].length;
            }
            System.out.println(ort);
            for (int j = 0; j <sayilar[i].length ; j++) {
                if (sayilar[i][j]>ort){
                    System.out.print(sayilar[i][j]+" ");
                }
            }
            System.out.println("\n"+"--------------------------------");
            toplam=0;
            ort=0;

        }

    }
}