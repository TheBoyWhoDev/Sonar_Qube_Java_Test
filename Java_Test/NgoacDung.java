import java.util.*;

public class NgoacDung {
    public static Scanner in = new Scanner(System.in);

    public static void testcase() {
        String s = in.next();
        List<Character> c = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                c.add(s.charAt(i));
            } else {
                if (s.charAt(i) == ')' && c.get(c.size() - 1) == '(') {
                    c.remove(c.size() - 1);
                }
                if (s.charAt(i) == ']' && c.get(c.size() - 1) == '[') {
                    c.remove(c.size() - 1);
                }
                if (s.charAt(i) == '}' && c.get(c.size() - 1) == '{') {
                    c.remove(c.size() - 1);
                }
            }
        }
        if (c.isEmpty()) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            testcase();
        }
    }
}