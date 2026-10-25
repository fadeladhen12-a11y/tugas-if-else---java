public class MenacariNilaiTertinggiDanRendah {
    public static void main(String[] args) {

        int[] suhu = {29, 32, 27, 35, 31, 26, 34};

        int tertinggi = suhu[0];
        int terendah = suhu[0];

        int indeksTertinggi = 0;
        int indeksTerendah = 0;

        for (int i = 1; i < suhu.length; i++) {

            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
                indeksTertinggi = i;
            }

            if (suhu[i] < terendah) {
                terendah = suhu[i];
                indeksTerendah = i;
            }
        }

        System.out.println("Suhu tertinggi = " + tertinggi);
        System.out.println("Indeks tertinggi = " + indeksTertinggi);

        System.out.println("Suhu terendah = " + terendah);
        System.out.println("Indeks terendah = " + indeksTerendah);

        System.out.println("Selisih = " + (tertinggi - terendah));
    }
}