package practice_basic_day02;

import java.util.Scanner;

public class Q03_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        String day = "Friday";

        switch (day) {
            case "Monday":
            case "Tuesday":
                System.out.println("Java class");
                break;

            case "Wednesday":
            case "Saturday":
                System.out.println("SQL");
                break;

            case "Friday":
            case "Thursday":
                System.out.println("Selenium");
                break;

            default:
                System.out.println("Day off");

        }

        /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen harflerden birini seciniz : \nA \nB \nC");
        char secenek = scan.next().toUpperCase().charAt(0);

        switch(secenek) {
            case 'A' :
                System.out.println("Java is easy");
                break;
            case 'B' :
                System.out.println("Java is fun");
                break;
            case 'C' :
                System.out.println("I need to study :)");
                break;
            default :
                System.out.println("Gecerli bir secim yapiniz");
        }


        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        System.out.print("Sayi =");
        int sayi= scan.nextInt();

        int onlarBasamgi= (sayi/10) %10;

        switch (onlarBasamgi)
        {
            case 0 : System.out.println("sifirr");
            break;
            case 1 : System.out.println("bir"); break;
            case 2 : System.out.println("iki"); break;
            case 3 : System.out.println("uc"); break;
            case 4 : System.out.println("dort"); break;
            case 5 : System.out.println("bes"); break;
            case 6 : System.out.println("alti"); break;
            case 7 : System.out.println("yedi"); break;
            case 8 : System.out.println("sekiz"); break;
            case 9 : System.out.println("dokuz"); break;
        }

        scan.close();
    }
}
