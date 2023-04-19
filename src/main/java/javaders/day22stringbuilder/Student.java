package javaders.day22stringbuilder;

public class Student {

    //stdName "public" oldugu icin diger class'lardan ulasilabilir
    public  String stdName ="Ali Can";

    //Access Modifier'i "default" olan ile "public" olan class member'lar ayni package
//kullanildiklarinda ayni ozellikleri ogsterirler.
//Fakat farkli package'a gectiginizde, "public" olanlara ulasilabilir, "default" olanlara
//ulasilamaz.
    int age =23;

    //Access Modifier'i "private" olan Class Member'lar sadece olusturulduklari class
//icinden gorulebilirler.
//Olusturduklari class'in disina ciltiginizda gorunmez, ulasilmaz olurlar.
    private  String healthCondition ="Cancer";


    //Access Modifier'i "protected" olan Class Member'lar ayni package icinde iken
//"public" gibi davranirlar.
//Farkli package'a gectiginizde "protected" olanlar sadece child class'lardan
//gorulerbilir.
    protected  int salary =3000;

//Note:Class'lar public ve default olabilir. Ama, private ve protected olamazlar.

}