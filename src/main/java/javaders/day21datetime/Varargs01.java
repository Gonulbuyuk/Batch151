package day21datetime;

public class Varargs01 {

    public static void main(String[] args) {

        System.out.println(add(5,2,4,3));//14
        System.out.println(add(5,2));//7
        System.out.println(add(5));//5
        System.out.println(add());//0

    }
    //Toplama islemi yapan bir method olustur.
    //Asagidaki gibi farkli methodlar olusturarak is yapamayiz. Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir,her ihtimal icin method olusturmak mumkun degildir.
//
//    public int add (int a, int b){
//        return a+b;
//    }
//
//    public int add(int a, int b, int c){
//        return a+b+c;
//    }
//    public int add(int a, int b, int c, int d){
//        return a+b+c+d;
//
//    }

    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya "Varargs" denir.
    //"Varargs" arkada "Array" yapisini kullanir.

    public static int add(int... a){

        int sum = 0;

        for (int w: a){
            sum+=w;

        }
        return sum;
    }
}