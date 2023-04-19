package javaders.ifStementsTernary;
public class C06_ternary {
    public static void main(String[] args) {
        /*
        2 tam sayınız var;
        Her iki tamsayı da pozitifse çarpma işlemi yapın
        Biri negatifse diğeri pozitif ise "çarpma nasıl yapılır bilmiyorum"
        ikiside negatif ise "çarpma nail yapılır bilmiyorum"

        */
        int sayi1=92;
        int sayi2=5;
        System.out.println(sayi1 > 0 && sayi2 > 0 ? sayi1 * sayi2 : "carpma nasil yapilir bilmiyorum");

    }
}
