import java.util.Scanner;

public class SoalNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah teks: ");
        String teks = scanner.nextLine();

        periksaPanjangTeks(teks);
    }

    private static void periksaPanjangTeks(String teks) {
        int panjang = teks.length();

        if (panjang == 5) {
            System.out.println("Panjang teks tersebut adalah 5 karakter.");
        } else {
            System.out.println("Panjang teks tersebut bukan 5 karakter.");
        }
    }
}
