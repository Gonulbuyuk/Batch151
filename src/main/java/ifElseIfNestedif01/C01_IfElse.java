package ifElseIfNestedif01;
import java.util.Scanner;


public class C01_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sabah derslerine katilabiliyorsaniz true katilamiyor iseniz false girinizi");
        boolean dt=scan.nextBoolean();
        System.out.println("aksam derslerine katilabiliyorsaniz true katilamiyor iseniz false girinizi");
        boolean nt=scan.nextBoolean();


        // if (dt||nt){
        //     System.out.println("derslerden birine ya da ikisinede katilabilirim");
        // }else {
        //     System.out.println("derslere katilamiyorum");
        // }


        if (dt&&nt){
            System.out.println("ikisinede katilabilirim");
        } else if (nt) {
            System.out.println("aksam derslerine katilabilirim");
        } else if (dt) {
            System.out.println("sabah derslerine katilabilirim");
        }else System.out.println("ikisinede katilamam");


    }
}