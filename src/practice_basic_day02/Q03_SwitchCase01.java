package practice_basic_day02;

public class Q03_SwitchCase01 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        String day = "Friday";

        switch (day) {
            case "Monday":
            case "Tuesday":
                System.out.println("Java class");
                break;

            case "Wednesday":
            case "Saturday":
                System.out.println("SQL");
                break;

            case "Friday":
            case "Thursday":
                System.out.println("Selenium");
                break;

            default:
                System.out.println("Day off");

        }
    }
}
