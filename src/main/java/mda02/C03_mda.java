package mda02;

public class C03_mda {
    public static void main(String[] args) {
        /*
        soru 3) Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */
        int sayilar[][]={{57,8,37},{99,88,11},{32,34,15,12},{2,3,5,1}};
        int sum=0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (i==j){
                    sum+=sayilar[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}

