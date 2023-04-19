package day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).forEach(System.out::println);

        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean r1 = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}", "")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);
    }

}