package practice_basic_day02;

import java.util.Scanner;

public class Q05_StringManipulation01 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfker ile yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and last name");
        String firstname = scan.nextLine(),
                lastname = scan.nextLine();  //multiple declarations
        String fullname = firstname.concat(" "+lastname).toUpperCase();

         String name ="Techproeducation".concat(String.valueOf(12));   // concat(String.valueOf(12) yerine concat(12); olmaz
        // in concat method you can only give String variable or String value

        System.out.println("your full name is: "+fullname);


        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz


        String string1 = "01234";
        String string2 = "56789";

        String contactWithMethod = string1.concat(string2);
        String concatWithPlus = string1 + string2;

        System.out.println("contactWithMethod = " + contactWithMethod);
        System.out.println("concatWithPlus = " + concatWithPlus);
    }
}
