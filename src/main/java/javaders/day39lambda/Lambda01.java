package day39lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");
        printElements(myList);//Tom Jim Clara
        System.out.println();
        printEl(myList);//Tom Jim Clara
        System.out.println();
        printElExceptStartsWithT(myList);//Jim Clara
        System.out.println();
        printElLengthLessThanFour(myList);//Tom Jim
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);//CLARA
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);//ANGELİNA CLARA JİM TOM
    }
    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1. Yol:
    public static void printElements(List<String> myList) {
        for (String w : myList) {         //==>Structured Programming
            System.out.print(w + " ");
        }
    }
    //2. Yol:
    public static void printEl(List<String> myList) {
        //Functional Programming
        myList.stream().//stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.
                forEach(t -> System.out.print(t + " "));
    }
    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList) {
        myList.stream().
                filter(t -> !t.startsWith("T")).//filter() sarta gore filtreleme
                forEach(t -> System.out.print(t + " "));
    }
    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElLengthLessThanFour(List<String> myList) {
        myList.stream().
                filter(t -> t.length() < 4).
                forEach(t -> System.out.print(t + " "));
    }
    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourWithUpper(List<String> myList) {
        myList.stream().
                filter(t -> t.length() > 4).
                map(t -> t.toUpperCase()).//map() var olan elemani degistirir
                forEach(t -> System.out.print(t + " "));
    }
    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList) {
        myList.stream().
                distinct().//distinct()tekrarli elemanlari bir kere gosterir.
                filter(t -> t.length() > 4).
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));
        //lambda'da elemanlari azaltan methodlar once kullanilir
    }
    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToUpperCaseSorted(List<String> myList) {
        myList.stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().//Alfabetik siraya gore dizer
                forEach(t -> System.out.print(t + " "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
    }
        //Note: Siralamayi bir sarta baglayacaksak sorted(Comparator.comparing()) kullanmaliyiz

    }
