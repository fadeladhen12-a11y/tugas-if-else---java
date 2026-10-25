public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {

        int[] nilai = {80, 75, 90, 65, 85};

        // Menampilkan semua nilai
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilai[i]);
        }

        // Nilai pada indeks ke-2
        System.out.println("Nilai indeks ke-2 = " + nilai[2]);
    }
}

