package practice_free;

import java.util.Scanner;

public class Q07 {

		/*
		Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called reverseString
		  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir string giriniz :");
        String str = scanner.nextLine();
        reverseString(str);
        System.out.println("girilen string ifadenin tersi :" + reverseString(str));
    }

    private static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) { // son karakterden baslayip geriye giderek, butun karakterleri yazdirdik..
            reversed+=str.charAt(i);
        }
        return reversed; //String ifadenin tersini dondurur..

    }

}
