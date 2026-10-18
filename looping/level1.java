package looping;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nStart!");

        input.close();
    }
}