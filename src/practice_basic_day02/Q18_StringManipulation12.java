package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int bosluk = str.indexOf(' ');

        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");

        } else {
            System.out.println("bosluk vardir");

        }
        scan.close();
    }

}