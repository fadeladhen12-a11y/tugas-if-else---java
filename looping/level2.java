package looping;

import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }

        System.out.println("Sum of even numbers = " + total);

        input.close();
    }
}