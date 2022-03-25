package practice_basic_day04;

public class Q04_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;
        tpMethod(arr, istenenToplam);

    }

    private static void tpMethod(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length; i++) { //arr kontrol
            for (int j = i+1 ; j < arr.length; j++) { //2. sayi aliyoruz  burada j=0 olursa consolde tersini de yazar, j=i olursa da ayni ciktiyi verir
                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " ve " + arr[j] + " toplami :" + istenenToplam);
                }
            }
        }

    }

}
			/*
			* j=i+1 ve j=i olursa
			5 and 4 sum is 9
			7 and 2 sum is 9
			-6 and 15 sum is 9
			8 and 1 sum is 9

			* j=0 olursa tersini de verir
			5 ve 4 toplami :9
            7 ve 2 toplami :9
            -6 ve 15 toplami :9
            4 ve 5 toplami :9
            2 ve 7 toplami :9
            15 ve -6 toplami :9
            8 ve 1 toplami :9
            1 ve 8 toplami :9
			 */