package javaders.ifStementsTernary;

public class C01_ifStements {
    public static void main(String[] args) {

        int sayi1=12;
        int sayi2=16;

        //< > >= <= == !=

        if (sayi1>20)
            System.out.println("buyuk olan sayi : " + sayi1);


        System.out.println("kucuk olan sayi ****: " + sayi2);


        if (sayi2>0) {
            System.out.println("buyuk olan sayi : " + sayi2);
            System.out.println("kucuk olan sayi : " + sayi1);
        }

    }
}