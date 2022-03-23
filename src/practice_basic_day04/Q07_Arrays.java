package practice_basic_day04;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] mat=  {{1,2,3}, {2,3,1} , {5,-5,5} , {2,1,3}} ;

        System.out.println("mat.length = " + mat.length); // satır sayısıymış
        System.out.println("mat[0].length = " + mat[0].length);// 0.satırdaki sütun sayısını verdi
        System.out.println("mat[1].length = " + mat[1].length);// 1.satırdaki sütun sayısını verdi
        System.out.println("mat[2].length = " + mat[2].length);// 2.satırdaki sütun sayısını verdi.
        System.out.println("mat[3].length = " + mat[3].length);// 2.satırdaki sütun sayısını verdi.

        int min=mat[0][0]; // ilk eleman yani 1

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length ; j++)
            {
                if (mat[i][j] < min)
                    min=mat[i][j];
            }
        }

        System.out.println("min = " + min);
    }


}
