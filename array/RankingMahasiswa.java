import java.util.Arrays;

public class RankingMahasiswa {
    public static void main(String[] args) {

        int[] nilai = {78, 90, 65, 90, 85, 72, 95, 85};

        Arrays.sort(nilai);

        System.out.println("Nilai dari tertinggi:");

        for (int i = nilai.length - 1; i >= 0; i--) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\n\n3 nilai tertinggi:");

        int jumlah = 0;

        for (int i = nilai.length - 1; i >= 0; i--) {

            if (i == nilai.length - 1 || nilai[i] != nilai[i + 1]) {
                System.out.print(nilai[i] + " ");
                jumlah++;
            }

            if (jumlah == 3) {
                break;
            }
        }
    }
}