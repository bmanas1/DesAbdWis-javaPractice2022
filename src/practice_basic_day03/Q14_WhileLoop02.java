package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz :");
        int sayi =scan.nextInt();

        //int count=0; kod calisiyor ama while kural baslangcc degeri gereklidir
        while(sayi>0)
        {
            if (sayi%2==1)
                System.out.println(sayi);

            sayi--;
        }
        scan.close();
    }


}
