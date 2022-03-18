package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the value to convert meters and kilometers :");
        double sentiMeter = scan.nextDouble();

        convertSM(sentiMeter);
    }

    public static void convertSM(double num) {
        double meter = num / 100;
        double kMeter = num / 100000;
        System.out.println("Your " + num + " sentimeter " + "is equal to " + meter + " Meters " + "and "
                + kMeter + " kilometers");

    }

}