package practice_free2;

public class Q07 {
    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz
     * int[] arr= {5,7,-6,4,2,15,3,8,1};
     * int istenenToplam=9;
     */
    public static void main(String[] args) {
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        toplamMethod(arr,istenenToplam);

    }

    private static void toplamMethod(int[] arr, int istenenToplam) {
        for (int i=0; i<arr.length; i++) { //outer for loop-> 1.sayi icin
            for (int j = i+1; j < arr.length; j++) { //inner for loop -> 2. sayi icin
                if(arr[i] +arr[j] ==istenenToplam){
                    System.out.println(arr[i] + " ve " + arr[j] + " toplami :" + istenenToplam);
                }
            }
        }
    }

    /*
    j = i+1
    5 ve 4 toplami :9
    7 ve 2 toplami :9
    -6 ve 15 toplami :9
    8 ve 1 toplami :9

    j=0;
    5 ve 4 toplami :9
    7 ve 2 toplami :9
    -6 ve 15 toplami :9
    4 ve 5 toplami :9
    2 ve 7 toplami :9
    15 ve -6 toplami :9
    8 ve 1 toplami :9
    1 ve 8 toplami :9

    j=i
    5 ve 4 toplami :9
    7 ve 2 toplami :9
    -6 ve 15 toplami :9
    8 ve 1 toplami :9
     */

}
