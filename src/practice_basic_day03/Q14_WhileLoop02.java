package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String okunan = "";

        do {
            System.out.print("Harf giriniz: ");
            okunan = scan.next();
            System.out.println("Program calisiyor");
        } while (!okunan.equalsIgnoreCase("x"));

        System.out.println("Program bitti");

        scan.close();
    }


}
