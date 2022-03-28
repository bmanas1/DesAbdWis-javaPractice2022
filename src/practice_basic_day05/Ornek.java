package practice_basic_day05;

import java.util.Scanner;

public class Ornek {
    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */

    public static void main(String[] args) {
        String ogrenciIsim="Ali";
        String ogrenciSoyIsim="Can";
        String ogrenciTel ="123456789";

        System.out.println("isim :" +ogrenciIsim +" soyisim :" +ogrenciSoyIsim +" tel :"+ ogrenciTel);
        //isim :Ali soyisim :Can tel :123456789
        isimDegistir(ogrenciIsim,ogrenciSoyIsim,ogrenciTel); //isim :Mehmet soyisim :Bulut tel :4569871263

        //soyIsimDegistir(ogrenciSoyIsim); //ilk methodu create ederken bu satiri kullandik..
        ogrenciSoyIsim=soyIsimDegistir(ogrenciSoyIsim);
        System.out.println("isim :"+ogrenciIsim + " yeniSoyisim :" +ogrenciSoyIsim + " tel: " +ogrenciTel);
        //isim :Ali yeniSoyisim :Guzel tel: 123456789

    }

    private static String soyIsimDegistir(String ogrenciSoyIsim) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Yeni soyisiminizi giriniz :");
        String yeniSoyisim = scan.nextLine();
        return  yeniSoyisim;
    }

    public static void isimDegistir(String ogrenciIsim, String ogrenciSoyIsim, String ogrenciTel) {
        ogrenciIsim ="Mehmet";
        ogrenciSoyIsim ="Bulut";
        ogrenciTel="4569871263";

        System.out.println("isim :" +ogrenciIsim +" soyisim :" +ogrenciSoyIsim +" tel :"+ ogrenciTel);
    }



}
