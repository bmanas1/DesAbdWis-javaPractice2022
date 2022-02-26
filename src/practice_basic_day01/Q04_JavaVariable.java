package practice_basic_day01;

public class Q04_JavaVariable {
    public static void main(String[] args) {
        // Initializing Variable
        int age = 32;
        int temp = 20;

        System.out.println(age); //32
        System.out.println(temp); //20

        System.out.println("age = " + age); //age = 32
        System.out.println("temp = " + temp); //temp = 20


        // To copy the variable's value
        int myAge = 25;
        int herAge = myAge;

        System.out.println("myAge = " + myAge); //myAge = 25
        System.out.println("herAge = " + herAge); //herAge = 25

        // you can declare multiple variables in the same line

        int year = 2022, month = 10;

        System.out.println("year = " + year); //year = 2022

        // updating a variable
        year = 2032;

        System.out.println("after update year = " + year); //after update year = 2032


        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin


        int x; // declare
        int y = 20000; // initialize
        x = 30; // initialized variable later
        y = 1; // update variable value

        System.out.println("x = " + x);  //30
        System.out.println("y = " + y);  //1
    }
}
