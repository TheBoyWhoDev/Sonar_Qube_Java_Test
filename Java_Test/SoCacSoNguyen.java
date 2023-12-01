import java.util.Scanner;

public class SoCacSoNguyen {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '2' || str.charAt(i) == '6') {
                count++;
            }
        }
        if (count == 2 || count == 6) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}