package practice_basic_day03;

import java.util.Scanner;

public class Q15_DoWhileLoop01 {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
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
