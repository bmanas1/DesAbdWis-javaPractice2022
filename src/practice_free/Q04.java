package practice_free;

import java.util.Scanner;

public class Q04 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("metre ve kilometreye donusturmek uzere cm olarak sayi giriniz :");
        double santiMetre = scanner.nextDouble();
        donusturSM(santiMetre);
    }

    public static void donusturSM (double cm){
        double metre =cm/100;
        double kiloMetre = cm/100000;

        System.out.println("sizin girdiginiz "  + cm + " cm degeri :" +metre + " metredir, " +kiloMetre  + " kilometredir" );

    }
}
