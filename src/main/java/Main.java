import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int[] weights = new int[line];
        for (int i = 0; i < line; i++) {
            weights[i] = scanner.nextInt();
        }
        Arrays.sort(weights);
        System.out.print(weights[0] + " " + weights[line - 1]);
    }
}
