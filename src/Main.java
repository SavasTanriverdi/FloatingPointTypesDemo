public class Main {
    public static void main(String[] args) {

        // float veri tipi (32 bit)
        float floatValue = 5.75f; // 'f' harfi float olduğunu belirtir
        System.out.println("Float Değeri: " + floatValue);

        // double veri tipi (64 bit)
        double doubleValue = 19.99d; // 'd' harfi double olduğunu belirtir, ancak isteğe bağlıdır
        System.out.println("Double Değeri: " + doubleValue);

        // Bilimsel gösterim
        double scientificDouble = 1.2e3; // 1.2 x 10^3
        System.out.println("Bilimsel Gösterim Double Değeri: " + scientificDouble);

        // Değerlerin aritmetik işlemlerde kullanılması
        double toplam = floatValue + doubleValue;
        System.out.println("Toplam Değer: " + toplam);

        // Kayan nokta değerlerinde hassasiyet
        float floatCalculation = 0.1f + 0.2f;
        System.out.println("Float Hesaplama (0.1f + 0.2f): " + floatCalculation);

        double doubleCalculation = 0.1 + 0.2;
        System.out.println("Double Hesaplama (0.1 + 0.2): " + doubleCalculation);

        // Maksimum ve minimum değerleri gösterme
        System.out.println("Float Min Değeri: " + Float.MIN_VALUE);
        System.out.println("Float Max Değeri: " + Float.MAX_VALUE);

        System.out.println("Double Min Değeri: " + Double.MIN_VALUE);
        System.out.println("Double Max Değeri: " + Double.MAX_VALUE);
    }
}
