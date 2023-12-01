import java.util.Scanner;

public class gptbn {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float a, b;
        a = input.nextFloat();
        b = input.nextFloat();
        if (a == 0 && b == 0)
            System.out.print("VSN");
        else if (a == 0 && b != 0)
            System.out.print("VN");
        else
            System.out.printf("%.2f", -b / a);
        input.close();
    }
}