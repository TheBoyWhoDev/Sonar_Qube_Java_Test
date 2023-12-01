import java.util.Scanner;

public class CatDoi {
    public static void testcase() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9') {
                System.out.println("INVALID");
                check = false;
            }
        }

        String s1 = "";

        if (check == true) {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '0':
                        s1 += "0";
                        break;
                    case '1':
                        s1 += "1";
                        break;
                    case '8':
                        s1 += "0";
                        ;
                        break;
                    case '9':
                        s1 += "0";
                        break;
                }
            }
            long l = Long.parseLong(s1.substring(s1.indexOf("1")));
            System.out.println(l);
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            CatDoi.testcase();
        }
    }
}