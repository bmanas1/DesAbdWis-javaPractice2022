package practice_free2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q08 {
    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
     */

    public static void main(String[] args) {
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("Ayse");
        databaseIsim.add("Emsal");
        databaseIsim.add("Safis");
        databaseIsim.add("Gul");
        databaseIsim.add("Nur Betul");
        databaseIsim.add("Elif");

        System.out.println("databaseIsim = " + databaseIsim);
        //databaseIsim = [Ayse, Emsal, Safis, Gul, Nur Betul, Elif]

        Scanner scan = new Scanner(System.in);
        //1.adim
        System.out.print("kullanmak istediginiz ismi giriniz :");

        //2.adim
        String username = scan.nextLine().trim();


        //3.adim
        if(databaseIsim.contains(username)) {
            System.out.println("Bu kullanici adi zaten alinmis.");
        }else {
            System.out.println("Bu kullanici adini kullanabilirsiniz");
        }

        //4. ve 5.adim
        if(databaseIsim.contains(username)) {
            int rastgeleSayi = new Random().nextInt(100);
            username = username + ""+rastgeleSayi;
            System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz : " + username);
        }else {
            System.out.println("Yeni kullanici adi : " + username);
        }


    }
}
