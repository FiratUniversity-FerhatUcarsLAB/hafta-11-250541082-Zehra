public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

/* === ANALİZ VE ÇIKTI (Exercise 4.5 Sorular) ===

1. Programın Tam Çıktısı (Output):
   (Satır sonlarına ve boşluklara dikkat edilmiştir)
   -------------------------------------------------
   just for
   any not more 
   It's breakfast 
   !
   -------------------------------------------------

2. Stack Diyagramı (zoop metodu İKİNCİ kez çağrıldığında):
   Not: İkinci zoop çağrısı, clink metodunun içinden yapılır.
   
   | STACK (Yığın) | DEĞİŞKENLER                                |
   |---------------|--------------------------------------------|
   | main          | bizz: 5, buzz: 2                           |
   | clink         | fork: 4  (2 * buzz sonucu)                 |
   | zoop          | fred: "breakfast ", bob: 4                 |
   |---------------|--------------------------------------------|
   
   Açıklama: 
   - main metodu clink(4) çağırır.
   - clink metodu "It's " yazdırır ve zoop("breakfast ", 4) çağırır.
   - Bu noktada zoop aktiftir. bob (4) değişkeni 5'e eşit olmadığı için
     if bloğuna girmez, else bloğuna girer ve "!" yazdırır.
*/
