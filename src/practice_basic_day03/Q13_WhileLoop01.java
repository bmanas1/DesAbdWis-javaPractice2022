package practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        int sayi = scan.nextInt();  //2562

        System.out.println(basamakToplama(sayi));
        basamakToplamaDoWhile(sayi); //2.cozum

        scan.close();
    }
    public static int basamakToplama(int sayi) {

        int toplam =0;
        while(sayi!=0){  //105 oldugunda once 5 sonra 1 aliyor

            toplam += sayi%10;  //2 yi aldi   6 yi aldi   5 i aldi  2 yi aldi
            sayi/=10;           //256         25          2         0 burda dongu gecersiz

        }
        return toplam;

    }

    //2.cozum do-while ile..
    public static void basamakToplamaDoWhile(int sayi){ //bu methodda her adimda toplami ve kalani yazdirdim..
                                                        // ve sonrasinda yazdirmak icin main methodda cagirdim
        int toplam =0;
        do {

            toplam += sayi % 10;
            sayi = sayi / 10;

            System.out.println("Basamaklarin Toplami = " + toplam + " \nkalan sayi " + sayi);

        }
        while (sayi > 0);
        System.out.println("Do while ile Toplam = " + toplam);

    }
}