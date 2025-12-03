public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // PDF Gorev: a * b + c islemini gerceklestir
        return a * b + c;
    }

    public static double expSum(double x) {
        // PDF Gorev: x * e^-x + sqrt(1 - e^-x)
        // Bu ifadeyi multadd(a, b, c) formatina uyduruyoruz:
        // a = x
        // b = e^-x  (Math.exp(-x))
        // c = sqrt(1 - e^-x)
        
        double eNegX = Math.exp(-x); // e üzeri -x degerini sakla
        return multadd(x, eNegX, Math.sqrt(1.0 - eNegX));
    }

    public static void main(String[] args) {
        // 1. Basit Test
        System.out.println("multadd(1, 2, 3) sonucu: " + multadd(1.0, 2.0, 3.0));

        // 2. Trigonometri Testi: sin(pi/4) + cos(pi/4)/2
        // multadd(a, b, c) -> a*b + c
        // a = Math.cos(Math.PI / 4)
        // b = 0.5 (2'ye bolmek, 0.5 ile carpmaktir)
        // c = Math.sin(Math.PI / 4)
        double trigResult = multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 sonucu: " + trigResult);

        // 3. Logaritma Testi: log(10) + log(20)
        // a = 1.0
        // b = Math.log10(10)
        // c = Math.log10(20)
        double logResult = multadd(1.0, Math.log10(10), Math.log10(20));
        System.out.println("log(10) + log(20) sonucu: " + logResult);

        // 4. expSum Testi
        System.out.println("expSum(2) sonucu: " + expSum(2.0));
    }
}
