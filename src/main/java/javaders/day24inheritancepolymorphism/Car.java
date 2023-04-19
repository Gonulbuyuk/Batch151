package day24inheritancepolymorphism;
/*
    1) Inheritance'da object olustururken constructor'lar yukaridan(Parent)
       asagiya(Child) dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
      Isterseniz gorunur sekilde de yazabilirsiniz
    4)super() sizi parent class'daki constructor'a tasir.
    5)this() sizi ayni class icindeki constructor'lar arasinda gezdirir.
    6)"this" icinde bulundugunuz class'daki variable'lari cagirmaya yarar.
      "super" parent class'daki variable'lari cagirmaya yarar


 */
public class Car {

    public void move(){
        System.out.println("Cars move...");
    }

    public void getbreak(){
        System.out.println("Cars break...");
    }

    public void engine(){
        System.out.println("Cars have engine ...");
    }


    public String model = "Car";
    int price = 0;

    public Car(){
        System.out.println("Car constructor 1");
    }
    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }

}