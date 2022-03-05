package practice_basic_day02;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        char FinalGrade = 'C';
        String Group = "";

        Group = (FinalGrade == 'A') ? "Gayet Basarili"
                : (FinalGrade == 'B') ? "Basarili"
                : (FinalGrade == 'C') ? "Ha gayret"
                : "Digerleri..";

        System.out.println(Group);

        if (FinalGrade == 'A') {
            Group = "Gayet Basarili";
        } else if (FinalGrade == 'B') {
            Group = "Basarili";
        } else if (FinalGrade == 'C') {
            Group = "Ha gayret";
        } else {
            Group = "Digerleri..";
        }

    }
}
