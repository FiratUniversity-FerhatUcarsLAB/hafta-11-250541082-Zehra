public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/* === ANALİZ VE ÇIKTI (Exercise 4.3 Sorular) ===

1. Programın Tam Çıktısı (Output):
   (Boşluklara ve satır sonlarına dikkat edilmiştir)
   -------------------------------------------------
   No, I wug.
   You wugga wug.
   I wug.
   -------------------------------------------------

2. Stack Diyagramı Analizi (Ping ilk çağrıldığında):
   - main metodu aktiftir.
   - main, zoop'u çağırmıştır.
   - zoop, baffle'ı çağırmıştır.
   - baffle, ping'i çağırmıştır.
   - ping şu an çalışmaktadır.
   (Stack: main -> zoop -> baffle -> ping)
*/
