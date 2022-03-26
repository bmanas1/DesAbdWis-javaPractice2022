package practice_free2;

import java.util.Scanner;

public class Q03{
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pin ="Ayse.4562";
        int girisHakki = 3;
        System.out.println("*******Hosgeldiniz*******");
        while(true){
            System.out.print("Pin kodu giriniz :");
            String girilenPin = scan.nextLine();

            if(pin.equals(girilenPin)){
                System.out.println("Basarili giris yaptiniz");
                break;
            }else{
                System.out.println("yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("giris hakkiniz :" +girisHakki);
            }

            if(girisHakki ==0){
                System.out.println("Giris hakkiniz kalmadi... bloklandiniz..");
                break;
            }
        }

    }
}
