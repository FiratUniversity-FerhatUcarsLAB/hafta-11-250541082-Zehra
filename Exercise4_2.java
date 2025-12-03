public class Exercise4_2 {

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { // 1
        zippo("rattle", 13); // 2
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // 6
        zippo("ping", -5); // 7
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { // 3, 8
            System.out.println(quince + " zoop"); // 9
        } else {
            System.out.println("ik"); // 4
            baffle(quince); // 5
            System.out.println("boo-wa-ha-ha"); // 10
        }
    }
}

/* === ANALİZ VE ÇIKTI (Exercise 4.2 Sorular) ===

1. baffle metodu ilk çağrıldığında 'blimp' parametresinin değeri nedir? 
   Cevap: "rattle" 
   (Çünkü zippo("rattle", 13) çağrıldığında, else bloğundan baffle(quince) çağrılır ve quince o sırada "rattle" değerindedir.)

2. Programın ürettiği tam çıktı (Output): 
   ik
   rattle
   ping zoop
   boo-wa-ha-ha

3. Adım Adım Akış Analizi:
   - Adım 1-2: Main başlar, zippo("rattle", 13) çağrılır.
   - Adım 3: flag (13) pozitif olduğu için if atlanır, else bloğuna girer.
   - Adım 4: "ik" yazdırılır.
   - Adım 5: baffle("rattle") çağrılır.
   - Adım 6: baffle içinde "rattle" yazdırılır.
   - Adım 7: baffle içinden zippo("ping", -5) çağrılır.
   - Adım 8: Yeni zippo çağrısında flag (-5) negatiftir, if bloğuna girer.
   - Adım 9: "ping zoop" yazdırılır. (Bu ikinci zippo biter, baffle'a döner, baffle biter, ilk zippo'ya döner).
   - Adım 10: İlk zippo çağrısı kaldığı yerden devam eder ve "boo-wa-ha-ha" yazdırır.
*/
