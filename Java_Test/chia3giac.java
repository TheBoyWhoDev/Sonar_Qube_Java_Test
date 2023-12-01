import java.util.Scanner;

public class chia3giac {
    public static void main(String args[]) {
        int t;
        float n, h;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        while (t-- > 0) {
            n = input.nextFloat();
            h = input.nextFloat();
            for (double i = 1; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt(i / n) * h);
            }
            System.out.println();
        }
    }
}