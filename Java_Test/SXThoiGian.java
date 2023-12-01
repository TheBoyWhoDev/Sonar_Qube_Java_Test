import java.util.*;

public class SXThoiGian {
    public static class ThoiGian implements Comparable<ThoiGian> {
        private int hour;
        private int minute;
        private int second;

        public ThoiGian() {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }

        public ThoiGian(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getHour() {
            return this.hour;
        }

        public int getMinute() {
            return this.minute;
        }

        public int getSecond() {
            return this.second;
        }

        @Override
        public int compareTo(ThoiGian thoiGian) {
            return (this.hour * 3600 + this.minute * 60 + this.second)
                    - (thoiGian.hour * 3600 + thoiGian.minute * 60 + thoiGian.second);
        }
    }

    public static Scanner in = new Scanner(System.in);

    public static void testcase() {
        List<ThoiGian> thoiGian = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= t; i++) {
            int h = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            thoiGian.add(new ThoiGian(h, m, s));
        }
        Collections.sort(thoiGian);

        for (ThoiGian x : thoiGian) {
            System.out.print(x.getHour() + " " + x.getMinute() + " " + x.getSecond());
            System.out.println();
        }
    }

    public static void main(String args[]) {
        testcase();
    }
}