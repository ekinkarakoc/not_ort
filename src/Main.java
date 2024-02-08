import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik değerini giriniz :");

        mat = scan.nextInt();

        System.out.println("Fizik değerini giriniz :");

        fizik = scan.nextInt();
        System.out.println("Kimya değerini giriniz :");

        kimya = scan.nextInt();
        System.out.println("Turkce değerini giriniz :");

        turkce = scan.nextInt();
        System.out.println("Tarih değerini giriniz :");

        tarih = scan.nextInt();
        System.out.println("Muzik değerini giriniz :");

        muzik = scan.nextInt();

        double toplam = (mat+fizik+kimya+tarih+turkce+muzik);

        double sonuc = toplam / 6;

        System.out.println(sonuc);

    }
}