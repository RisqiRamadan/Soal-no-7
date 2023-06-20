import java.util.ArrayList;
import java.util.List;

public class SoalNo8 {
    public static List<Integer> cariTeksDenganPanjang(String[] array, int panjangMinimal, int panjangMaksimal) {
        List<Integer> indeks = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String teks = array[i];
            int panjangTeks = teks.length();
            if (panjangTeks >= panjangMinimal && panjangTeks <= panjangMaksimal) {
                indeks.add(i);
            }
        }

        return indeks;
    }

    public static void main(String[] args) {
        String[] array = {"Ayo", "semangat", "ngerjain", "UASnya", "Risqi", "jangan", "sampai", "ngulang"};
        int panjangMinimal = 5;
        int panjangMaksimal = 7;

        List<Integer> hasilPencarian = cariTeksDenganPanjang(array, panjangMinimal, panjangMaksimal);
        if (hasilPencarian.isEmpty()) {
            System.out.println("Tidak ada teks yang ditemukan dalam rentang panjang yang ditentukan.");
        } else {
            System.out.println("Teks ditemukan pada indeks: " + hasilPencarian);
        }
    }
}
