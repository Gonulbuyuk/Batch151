package mda02;

public class C05_mda {
    public static void main(String[] args) {
        /*
        Soru 5) Asagidaki multi dimensional array'in
        ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
        bir program yaziniz {{1,2,3}, {4,5}, {6}}
        */
        int sayilar[][]={{1,2,3}, {4,5}, {6},{12,13},{2}};
        int carpim=1;
        for (int i = 0; i < sayilar.length; i++) {
            carpim*=sayilar[i][sayilar[i].length-1];
        }
        System.out.println(carpim);
    }
}