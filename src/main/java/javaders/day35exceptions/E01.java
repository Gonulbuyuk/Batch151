package javaders.day35exceptions;

public class E01 {
    public static void main(String[] args) {

        System.out.println(convertStringToInt("123")+2);
/*
valueOf(str) methodu String'i integer'a cevirir. "123" olan String'i java sayi gibi gordu ve istedigimiz
sekilde toplama islemi yapti. ValueOf nethodunu sayi formatinda olmayan bir String ile kullanirsak exception
aliriz. NumberFormatException aliriz.
 */
//"NumberFormatException" sayi formati hatasidir. Girilen String sayi formatinda degilse bu hatayi aliriz
    }
    //Bir String'i Integer'e ceviren method olusturunuz.
/*
NumberFormatException'i alinca exception'i handle etmek icin method body'si icine try ve catch yazdik.
try body'si icine return Integer.valueOf(str) yazdik. catch icine ilgili exception ismini e harfi ile yazdik.
catch body'si icine replaceAll methodu ile rakamdan farkli karakterleri sildik. kalani yine str'ye assign ettik.
Ardindan return kismini yazinca java artik hata vernmedi.
 */
    public static int convertStringToInt (String str){

        try{
            return Integer.valueOf(str);
        }catch(NumberFormatException e){//NumberFormatException valueOf() method'u non-digit character iceren bir String ile kullanildiginda atilir.
            str = str.replaceAll("[^0-9]", "");
            return Integer.valueOf(str);
        }
    }

}