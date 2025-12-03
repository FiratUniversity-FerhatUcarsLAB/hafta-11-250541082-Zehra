public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
         System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
          String day = "Monday";
            String month = "July";
            int date = 22;
            int year = 2019;

            // Metotları çağırma
            printAmerican(day, date, month, year);
            printEuropean(day, date, month, year);
    }
}
