package looping;

import java.util.Scanner;

public class level4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        System.out.print("Output: ");

        for (int angka = 2; angka <= n; angka++) {
            boolean prima = true;

            for (int j = 2; j <= angka / j; j++) {
                if (angka % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(angka + " ");
            }
        }

        System.out.println();
        input.close();
    }
}
    

