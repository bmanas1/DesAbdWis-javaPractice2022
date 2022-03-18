package practice_basic_day03;

import java.util.Scanner;

public class Q16_DoWhileLoop02 {
    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = "";

        do {
            System.out.print("Enter a string :");
            word = scan.nextLine();
            if(word.length()<3) {
                System.out.println("It is smaller than 3");
            }
            if(word.length()%2==1 && word.length()>=3) {
                System.out.println("middle of the word :" +word.charAt(word.length()/2));
            }
            else {
                System.out.println("You entered wrong word.");
            }
        }while(!(word.length()%2==1 && word.length()>=3) );

    }


}
