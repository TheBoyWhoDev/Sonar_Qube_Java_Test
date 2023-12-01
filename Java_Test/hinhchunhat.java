import java.util.Scanner;

public class hinhchunhat {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println(0);
        } else {
            System.out.println((a + b) * 2 + " " + a * b);
        }
    }
}