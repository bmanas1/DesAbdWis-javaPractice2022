package practice_free2;

public class Q06 {
    /*
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * ortalamadan buyuk olanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */

    public static void main(String[] args) {
        int input[] = {1, 2, 3, 4, 5, 6, 7};

        double toplam = 0;

        for (int each : input) {
            toplam += each;
        }

        double ort = toplam / input.length;
        System.out.println("ort = " + ort);

        for (int each : input) {
            if (each > ort) System.out.println("ortalamadan buyuk olanlar :" + each);
        }
    }

}
