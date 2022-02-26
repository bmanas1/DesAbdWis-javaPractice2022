package practice_basic_day01;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {
        int not = 99;
        boolean A = not >= 90 && not <= 100;
        boolean B = not >= 80 && not <= 89;
        boolean C = not >= 70 && not <= 79;
        boolean D = not >= 60 && not <= 69;
        boolean gecerliNot = not >=0 &&  not <= 100;


        if(gecerliNot)	{
            if(A) {   //  100 >= grade >= 90
                System.out.println("You made A");
            }
            else if(B) {  //  90> grade >= 80
                System.out.println("You made B");
            }
            else if(C) { //  80> grade >= 70
                System.out.println("You made C");
            }
            else if(D) {  //  70> grade >= 60
                System.out.println("You made D");
            }
            else{  // 0 =< grade < 60
                System.out.println("You made F");
            }

        }else  { // grade <0 || grade > 100
            System.out.println("gecersiz not");

        }

    }
}
