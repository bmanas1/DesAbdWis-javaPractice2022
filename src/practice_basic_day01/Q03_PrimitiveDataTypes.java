package practice_basic_day01;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {

        /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        int intMax = Integer.MAX_VALUE;
        System.out.println("int Max: "  + intMax);
        int intMin = Integer.MIN_VALUE;
        System.out.println("int Min: " + intMin);

        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Byte Max: " + byteMax );
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("Byte Min: " + byteMin);
        /*
        int Max: 2147483647
        int Min: -2147483648
        Byte Max: 127
        Byte Min: -128
         */

        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim


        float laptopFiyat = 999.99f;
        double kilometre = 578.35;
        char seviye = 'A';
        boolean uygunMu = true;

        System.out.println("laptopFiyat: " + laptopFiyat); //laptopFiyat: 999.99
        System.out.println("kilometre: " + kilometre); //kilometre: 578.35
        System.out.println("seviye: " + seviye);  //seviye: A
        System.out.println("uygunMu: " + uygunMu); //uygunMu: true
    }

}
