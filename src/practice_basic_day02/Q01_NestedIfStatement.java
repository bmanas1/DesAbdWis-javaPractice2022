package practice_basic_day02;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("yasinizi giriniz :");
        int age = scan.nextInt();

        if (age >= 18) {
            if (age >= 70) { // age >= 70
                System.out.println("oy kullanmaya uygun");
                System.out.println("uc kez oy kullanabilir");
            } else if (age >= 50) {  // 70>age >=50
                System.out.println("oy kullanmaya uygun");
                System.out.println("iki kez oy kullanabilir");
            } else {  // age < 50
                System.out.println("oy kullanmaya uygun");
                System.out.println("bir kez oy kullanabilir");
            }
        } else {
            System.out.println("yasiniz oy kullanmaya uygun degildir..");
        }

    }
}


