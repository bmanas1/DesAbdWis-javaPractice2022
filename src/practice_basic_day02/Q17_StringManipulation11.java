package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi ve soyisminizi giriniz:\nisim:");
        String isim = scan.next();
        System.out.print("soyisim:");
        String soyIsim = scan.next();

        if (isim.length() > soyIsim.length()) {

            System.out.println("isminiz soyisminizden daha uzun");

        } else if (isim.length()==soyIsim.length()) {
            System.out.println("isminiz soyisminiz ile esit uzunlukta");

        }else {

            System.out.println("soyisminiz isminizden daha uzun");
        }

        scan.close();


    }

}
