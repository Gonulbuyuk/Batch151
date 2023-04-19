package scope02;

public class C01_scope {
    //instance
    //static
    //local
    int x=8;
    static String isim="Ali";
    int y;


    public static void main(String[] args) {

        C01_scope obje=new C01_scope();
        obje.y=12;
        System.out.println(obje.x);//8
        System.out.println(isim);//ali
        System.out.println(obje.y);//12
        obje.yazdir();
        System.out.println(obje.y);//12  //15
    }

    public void yazdir(){
        //System.out.println(isim);
        //System.out.println(x);
        y=15;
        System.out.println(y);//15  //15

    }
}