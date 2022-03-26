package practice_free2;

import java.util.Scanner;

public class Q01 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir string giriniz :");
        String input = scan.nextLine();

        System.out.print("Lutfen bir sayi giriniz :");
        int sayi = scan.nextInt();

        ilkSonHarfBirlestir(input, sayi);
        System.out.println(ilkSonHarfBirlestir(input,sayi));
    }

    private static String ilkSonHarfBirlestir(String input, int sayi) {
        String s = input.substring(0, 1) + input.substring(input.length() - 1);

        String output = "";

        for (int i = 1; i <=sayi;i++){ //girilen sayi kadar yazdirsin istiyoruz
            output += s; //   output = output +s;
        }
        return output;
    }
}
