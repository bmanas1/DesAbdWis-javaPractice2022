package practice_basic_day02;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {
    //NestedIf ile
        int num = 9; // bu satirdan farkli degerler verilebilir
        String result = ""; //baslangicta benim sonuc um belli degil, o yuzden hicnirsey olarak atama yapabilirim..
        if(num >=0 && num <= 9) {

            if(num == 9)  //eger num 9 ise
                result="nine";  //benim sonucum nine olsun , bu sekilde atama ile de yazilabilir.. yazdirma en asagida..
            else if(num ==8)
                result ="eight";
            else if(num == 7)
                result ="seven";
            else if(num == 6)
                result = "six";
            else if(num == 5)
                result = "five";
            else if(num == 4)
                result = "four";
            else if(num == 3)
                result = "three";
            else if(num == 2 )
                result = "two";
            else if(num == 1)
                result = "one";
            else
                result = "Zero";
        } else { //0-9 arasindaki degerler disinda degerler girilirse
            result = "Invalid"; //sonucum invalid olsun
        }

        System.out.println("result = " + result);  // bu sekilde sonuc dinamik olarak yazdirilabilir

    //Ternary ile
        int n = 4;

        String result2 = n==9? "nine" :n==8? "eight"
                :n==7? "seven" :n==6? "six"
                :n==5? "five"  :n==4? "four"
                :n==3? "three" :n==2? "two"
                :n==1? "one" :n==0? "zero" :"Invalid";

        System.out.println(result2);


    }
}
