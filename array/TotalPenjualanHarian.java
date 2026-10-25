 public class TotalPenjualanHarian {
    public static void main(String[] args) {

        int[] penjualan = {100000, 150000, 125000, 200000, 175000};

        int total = 0;

        for (int i = 0; i < penjualan.length; i++) {
            total = total + penjualan[i];
        }

        System.out.println("Total penjualan = Rp" + total);
        System.out.println("Jumlah elemen = " + penjualan.length);
    }
}