import java.util.Arrays;

public class PrediksiOutput {
    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5};
        int[] awal = data.clone();

        for (int i = 0; i < data.length; i++) {
            data[i] = awal[i] + awal[data.length - 1 - i];
        }

        System.out.println(Arrays.toString(data));
    }
}