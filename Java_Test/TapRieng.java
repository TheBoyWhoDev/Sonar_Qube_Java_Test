import java.util.*;

public class TapRieng {
    public static Scanner in = new Scanner(System.in);

    public static void testcase() {
        List<String> s1 = Arrays.asList(in.nextLine().split(" "));
        List<String> s2 = Arrays.asList(in.nextLine().split(" "));
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String x : s1) {
            set.add(x);
        }
        for (String x : s2) {
            if (set.contains(x)) {
                set.remove(x);
            }
        }
        List<String> s3 = new ArrayList<>(set);
        Collections.sort(s3);
        for (String x : s3) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            testcase();
        }
    }
}