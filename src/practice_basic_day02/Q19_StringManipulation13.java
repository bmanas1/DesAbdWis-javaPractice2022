package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in); //meaj vermeden de konsol da girdi girilir
        String kelime=scan.next();
        System.out.println(kelime.length());

        if(kelime.length()<=4) {
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char üc =kelime.charAt(2);
            char dört=kelime.charAt(3);
            System.out.println("Tersden :"+dört+üc+iki+bir);

        }else {
            System.out.println("Girdiginiz kelime uzunlugu 4 karakterden fazla");

        }
        scan.close();

    }
}
