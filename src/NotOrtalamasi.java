import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        // değişkenlerin tanımlanması
        int mat,fizik,kimya,tarih,turkce,muzik;
        // scanner sınıfının tanımlanması
        Scanner inp=new Scanner(System.in);

        // Değişken değerlerinin dışarıdan alınması
        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        int toplam=(mat+fizik+kimya+tarih+turkce+muzik);

        double ortalama=toplam/6;

        System.out.println("Ortalamanız : "+ortalama);

        String sonuc;

        sonuc = (ortalama>=60) ? "Geçti":"Kaldı";

        System.out.println("Sonuç : "+sonuc);

    }
}
