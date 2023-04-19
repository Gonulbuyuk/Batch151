package javaders.day07stringmanipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {
        // ******************** replaceAll() ****************\\
       /*
        replaceAll() Bir grup datatyi degistirmek icin kullanilir
                     Bir Grup Data= Regular Expression (Regex) kullanilir


         En Cok Kullanilan Regexler:
1) Tum Rakamlar ==> [0-9]
2) Tum Kucuk Harfler ==> [a-z]
3) Tum Buyuk Harfler ==> [A-Z]
4) Tum Harfler ==> [a-zA-Z]
5) Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
6) Tum Sesli Harfler ==> [aeiouAEIOU]
7) Tum Noktalama Isaretleri ==> \\p{Punct}

   ^===> den farklı ; İ , haricinde

   1) Tum Rakamlar ==> [^0-9]
2) Tum Kucuk Harfler ==> [^a-z]
3) Tum Buyuk Harfler ==> [^A-Z]
4) Tum Harfler ==> [^a-zA-Z]
5) Tum Harfler ve Rakamlar ==> [^a-zA-Z0-9]
6) Tum Sesli Harfler ==> [^aeiouAEIOU]
7) Tum Noktalama Isaretleri ==> \\p{Punct}*****ornek üzerinde gostericem


        */
        String s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir...";
        // Ex : s String'indeki tum rakamlari "*" ceviriniz
        String s1= s.replaceAll("[0-9]","*");
        System.out.println("s1 = " + s1);



        //// Ex : s String'indeki tum harfleri ve tum rakamlari "@" ceviriniz
        String s2= s.replaceAll("[a-zA-Z0-9]","@");
        System.out.println("s2 = " + s2);
        //s2 = @@@@@@ @@@@@ @@@ @@ @@@@@@@ @@_@@@@@@@@@ @@@@@@@@ $ @@@@@@@ @@@@ @@@@@@@@@@@...

        // Ex : s String'indeki tum spaceler disindaki karakterleri "+" ceviriniz





    }//main
}//class