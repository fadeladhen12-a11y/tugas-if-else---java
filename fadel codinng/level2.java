import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("B");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("C");
        } else if (nilai >= 50 && nilai < 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        input.close();
    }
}
