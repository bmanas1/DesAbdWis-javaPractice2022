package practice_basic_day03;

import java.util.Scanner;

public class Q09_ForLoop04 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler: a,e,i,o,u

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

  */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("kelime giriniz :");
        String kelime = scan.next();

        String sesliHarfler = "aeiou"; //inglizce karakterleri aldim sadece, karisiklik olmasin diye..

            for (int i = 0; i < sesliHarfler.length(); i++) {
                if (sesliHarfler.contains(kelime.substring(0,1))) {  //sesli harfler girilen kelimenin ilk karakterini iceriyor mu?
                                                                     //kullanici kelime girse bile ilk karaktere baksin..
                    System.out.println("sesli harf");
                    break; //sesli harfi bulunca aramaya devam etmesin, donguyu kirsin..
                } else {
                    System.out.println("sessiz harf");
                    break;
                }
            }

    }
}
