package practice_free;

import java.util.Scanner;

public class Q06 {
     /*     Interview Question
            Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	  */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("bir tamsayi giriniz :");
         int sayi =scan.nextInt();
         System.out.println("sayi = " + sayi);
         int toplam =0;
         for (int i = 1; i <sayi;i++){
             toplam+=(i*i);  // toplam =toplam +(i*i);
         }

         System.out.println("sayilarin kareleri toplami :" + toplam);

     }
}
