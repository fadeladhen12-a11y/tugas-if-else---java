public class MembalikUkuranArray {
    public static void main(String[] args) {

        int[] angka = {2, 4, 6, 8, 10, 12};

        for (int i = 0; i < angka.length / 2; i++) {

            int temp = angka[i];

            angka[i] = angka[angka.length - 1 - i];

            angka[angka.length - 1 - i] = temp;
        }

        System.out.println("Array setelah dibalik:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
