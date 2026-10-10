import java.util.Scanner;

public class level4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lama parkir (jam): ");
        int jam = input.nextInt();

        int biaya = 0;

        if (jam > 0) {
            biaya = 5000 + (jam - 1) * 3000;
        }
        
        if (biaya > 20000) {
            biaya = 20000;
        }

        System.out.println("Biaya parkir: Rp " + biaya);

        input.close();
    }
    
}
