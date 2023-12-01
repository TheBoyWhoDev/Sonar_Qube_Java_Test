import java.util.Scanner;

public class ChuanHoaHoTen {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String arr[] = in.nextLine().trim().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 || i == arr.length - 1) {
                    System.out.print(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase());
                }
                else {
                    System.out.print(arr[i].toLowerCase());
                }
                if (i != arr.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}