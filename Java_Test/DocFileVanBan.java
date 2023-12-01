import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class DocFileVanBan {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        while (in.hasNext()) {
            System.out.print(in.nextLine());
            System.out.print("\n");
        }
    }
}