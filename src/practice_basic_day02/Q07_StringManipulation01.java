package practice_basic_day02;

import java.util.Scanner;

public class Q07_StringManipulation01 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and last name :");
        String firstname = scan.nextLine(),
                lastname = scan.nextLine();  //multiple declarations, bu sekilde kullanim uygulanabilir
        String fullname = firstname.concat(" "+lastname).toUpperCase();

        String name ="Techproeducation".concat(String.valueOf(12));   // concat(String.valueOf(12) yerine concat(12); olmaz
        // concat method sadece String variable ya da String value ile kullanilir

        System.out.println("your full name is: "+fullname);



        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz

    }
}
