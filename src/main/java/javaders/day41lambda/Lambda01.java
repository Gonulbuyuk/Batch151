package javaders.day41lambda;
import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumSquareOfOdds1(nums));//436
        System.out.println(getTheSumSquareOfOdds2(nums));//436
        System.out.println(getTheSumSquareOfOdds3(nums));//436

        System.out.println(getMultiplicationOfSquareOfEvens(nums));//147456

System.out.println(getTheSumOfEvenMaxAndOddMin(nums));//15


        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEighth(nums));//15


    }

    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumSquareOfOdds1(List<Integer>nums){

        return nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);//Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki tum degerleri toplamdan alir, "u" ise stream'den alir
        //reduce() => deger sayisini azaltmak. Coklu datayi tekli dataya cevirmek istedigimizde bu method kullanilir

    }
    public static int getTheSumSquareOfOdds2(List<Integer>nums) {

        return nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(0, Math ::addExact );//Class ismi :: Method Ismi ==> Method Referance
    }

    public static int getTheSumSquareOfOdds3(List<Integer>nums) {

        return nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(Math::addExact).
                get();
    }

    //Example 2: Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens(List<Integer>nums){

        return nums.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                distinct().
                reduce(1,(t,u)->t*u);//Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki tum degerleri toplamdan alir, "u" ise stream'den alir
        //reduce() => deger sayisini azaltmak. Coklu datayi tekli dataya cevirmek istedigimizde bu method kullanilir
    }

        //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinintoplamini hesaplayan method olusturunuz.

    public static int getTheSumOfEvenMaxAndOddMin(List<Integer>nums) {

        int maxEven = nums.stream().distinct().filter(t -> t % 2 == 0).reduce((t,u)->t>u ? t : u).get();
        //reduce methodunu, etkisiz eleman kullanmadan kullanirsaniz. get() kullanın ki optional Int i normal int e cevirmis olalım.

        int minOdd = nums.stream().distinct().filter(t->t%2!=0).reduce((t, u)-> t<u ? t : u).get();

        return maxEven + minOdd;

    }
    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7'den kucuk maximum degeri ile
    // tek sayi olan elemanlarin 8'den buyuk minimum degerinin toplamini hesaplayan method olusturunuz.

    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEighth(List<Integer>nums) {

        int max = nums.stream().distinct().filter(t -> t % 2 == 0 && t<7).reduce((t,u)->t>u ? t : u).get();

        int min = nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t, u)-> t<u ? t : u).get();//t->t%2!=0 && t>8 bu yapiya Lambda Expression

        return max + min;

    }


}