import java.util.Scanner;

public class SoalNo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scan.nextInt();

        boolean isKelipatan = cekKelipatan(angka);

        if (isKelipatan) {
            System.out.println(angka + " adalah kelipatan 5.");
        } else {
            System.out.println(angka + " bukan kelipatan 5.");
        }
    }

    public static boolean cekKelipatan(int angka) {
        return angka % 5 == 0;
    }
}
