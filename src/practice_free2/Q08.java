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
        Scanner scan = new Scanner(System.in);
        //1.adim
        System.out.print("kullanmak istediginiz ismi giriniz :");

        //2.adim
        String username = scan.nextLine().trim();

        //3.adim
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("Ayse");
        databaseIsim.add("Emsal");
        databaseIsim.add("Safis");
        databaseIsim.add("Gul");
        databaseIsim.add("Nur Betul");
        databaseIsim.add("Elif");

        boolean usernameVarMi = databaseIsim.contains("username");

        //4.adim
        if (usernameVarMi) {
            System.out.println("bu kullanici ismi zaten alinmistir");
            int randomSayi = new Random().nextInt(100);
            username = username + "" + randomSayi;
            randomSayi++;
            System.out.println("yeni kullanici adi olarak kullanabilirsiniz : " + username);
        } else {
            System.out.println("bu kullanici ismini kullanabilirsinz");
            System.out.println("yeni kullanici adi " + username);
        }


    }
}
