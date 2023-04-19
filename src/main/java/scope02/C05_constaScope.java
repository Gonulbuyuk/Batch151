package scope02;


public class C05_constaScope {
    int a=1;
    int b=2;
    int c=3;
    C05_constaScope(int a){
        System.out.println(a);
        System.out.println(this.a=a);
    }
    C05_constaScope(int a,int b){
        System.out.println(a+b);
        System.out.println(c);
    }
    C05_constaScope(int a,int b,int c){
        System.out.println(a+b+c);//21
        System.out.println(this.a+this.b+this.c);//6
    }


    public static void main(String[] args) {
        C05_constaScope obje1=new C05_constaScope(5,6,10);


    }
}