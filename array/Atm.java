import java.util.Scanner; 

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int balance = 1000000;
        int[] transactions = new int[5];

        int totalMasuk = 0;
        int totalKeluar = 0;

        // Menerima 5 transaksi
        for (int i = 0; i < 5; i++) {

            System.out.println("\nTransaksi ke-" + (i + 1));
            System.out.println("1. Setor");
            System.out.println("2. Tarik");
            System.out.print("Pilih: ");

            int pilihan = input.nextInt();

            System.out.print("Jumlah uang: ");
            int jumlah = input.nextInt();

            // Setor
            if (pilihan == 1) {

                balance = balance + jumlah;

                transactions[i] = jumlah;

                totalMasuk = totalMasuk + jumlah;

                System.out.println("Setoran berhasil.");

            // Tarik
            } else if (pilihan == 2) {

                if (jumlah <= balance) {

                    balance = balance - jumlah;

                    transactions[i] = -jumlah;

                    totalKeluar = totalKeluar + jumlah;

                    System.out.println("Penarikan berhasil.");

                } else {

                    transactions[i] = 0;

                    System.out.println(
                        "Penarikan ditolak, saldo tidak cukup."
                    );
                }

            } else {

                transactions[i] = 0;

                System.out.println("Pilihan tidak valid.");
            }

            System.out.println("Saldo sekarang: Rp" + balance);
        }

        // Hasil akhir
        System.out.println("\n===== HASIL AKHIR =====");

        System.out.println("Saldo akhir: Rp" + balance);

        System.out.println(
            "Total uang masuk: Rp" + totalMasuk
        );

        System.out.println(
            "Total uang keluar: Rp" + totalKeluar
        );

        System.out.println("\nRiwayat transaksi:");

        for (int i = 0; i < 5; i++) {
            System.out.println(
                "Transaksi " + (i + 1) +
                ": " + transactions[i]
            );
        }

        input.close();
    }
}

