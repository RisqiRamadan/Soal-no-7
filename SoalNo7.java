import java.util.ArrayList;
import java.util.List;

public class SoalNo7 {
    public static List<Integer> cariIndeksTeks(String[] array, int panjang) {
        List<Integer> indeks = new ArrayList<>();

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Arraynya tidak boleh kosong atau bernilai null.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].length() == panjang) {
                indeks.add(i);
            }
        }

        return indeks;
    }

    public static void main(String[] args) {
        String[] array = {"Besok", "Pasti", "akan", "menjadi", "lebih", "baik", "lagi"};
        int panjangPencarian = 5;

        try {
            List<Integer> hasilPencarian = cariIndeksTeks(array, panjangPencarian);

            if (hasilPencarian.isEmpty()) {
                System.out.println("Tidak ditemukan teks dengan panjang " + panjangPencarian + " dalam array.");
            } else {
                System.out.println("Teks dengan panjang " + panjangPencarian + " ada di Indeks: " + hasilPencarian);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
