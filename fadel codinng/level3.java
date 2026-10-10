import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai:");
        double nilai = input.nextDouble();

        System.out.print("Kehadiran (%): ");
        double hadir = input.nextDouble();

        if (nilai >= 60 && hadir >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        input.close();

    }
}