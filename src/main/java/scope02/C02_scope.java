package scope02;


public class C02_scope {
    static int i;
    public static void main(String[] args) {
        int y=14;
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);


            System.out.println(y);


        }
        System.out.println(i);
        {
            System.out.println(y);
            System.out.println(i);
            int z=543;
            System.out.println(z);
        }
        C02_scope obje=new C02_scope();
        System.out.println(obje.i);


    }
}