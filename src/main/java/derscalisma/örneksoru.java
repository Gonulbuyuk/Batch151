package derscalisma;

import java.util.Scanner;

public class örneksoru {
    /*

                Kullanicidan username ve password'u alin.
                Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
                Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
                Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
                Gecerli Username="admin" ve Password="pwd123" dur.
         */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 0;
        do {
            if (counter == 4) {
                System.out.println("Hesabinizi Bloke Edilmiştir.");
                break;
            }

        System.out.println("Username'i Giriniz");
        String username = input.next();

        System.out.println("Password'u Giriniz");
        String password = input.next();

        if (username.equals("resul") && password.equals("resul123")) {

            System.out.println("Hesabiniza Hosgeldiniz!");
            break;
        }
        counter++;

    }
    while(true);

    }
}
