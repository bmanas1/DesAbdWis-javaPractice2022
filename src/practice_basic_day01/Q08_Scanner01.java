package practice_basic_day01;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println(sum);

        //dort islem sonucunu yazdiriniz.
        System.out.println("Toplam: " + (number1+number2));
        System.out.println("Fark: " + (number1-number2));
        System.out.println("Carpim: " +(number1*number2));
        System.out.println("Bolum: " + (number1/number2));

        scanner.close();
    }


}
