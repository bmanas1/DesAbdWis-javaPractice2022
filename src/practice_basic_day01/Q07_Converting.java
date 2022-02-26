package practice_basic_day01;

import java.util.Scanner;

public class Q07_Converting {
    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

    public static void main(String[] args) {
        int gallon = 1000;
        double litre = gallon * 3.785;  //1000*3.785
        String result1 = gallon +" galon degeri " + litre + " litreye esittir";

        System.out.println(result1); //1000 galon degeri 3785.0 litreye esittir


        int L = 100;
        double G = L / 3.785;  //  100/3.785
        String result2 =  L +" litre degeri "+ G +" gallona esittir";

        System.out.println( result2 ); //100 litre degeri 26.42007926023778 gallona esittir


        Scanner scan =new Scanner(System.in);
        System.out.println("fahrenayt degeri giriniz : ");

        int f=scan.nextInt();
        System.out.println("girdiginiz fahrenayt degerinin santigrad derecesi : "+(f-32)*5/9);
    }
}
