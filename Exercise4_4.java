public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // CEVAP: Kod sorunsuz derlenir ve çalışır. Herhangi bir hata veya uyarı vermez.
        // Metodun döndürdüğü değer (42) sadece yok sayılır (kullanılmadan kaybolur).

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // CEVAP: Derleme hatası (Compiler Error) verir.
        // Açıklama: sayHello() metodu 'void'dir, yani bir değer döndürmez.
        // Java'da olmayan bir değer ile 7 sayısı toplanamaz.
        // Hata mesajı şuna benzer: "operator + cannot be applied to 'void' and 'int'"
    }
}
