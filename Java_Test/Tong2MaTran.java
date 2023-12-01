import java.util.Scanner;

public class Tong2MaTran {
    public static class MaTran {
        private int[][] m;
        private int kt;

        public MaTran(int n) {
            this.m = new int[n][n];
            this.kt = n;
        }

        public void input(Scanner in) {
            for (int i = 0; i < this.kt; i++) {
                for (int j = 0; j < this.kt; j++) {
                    this.m[i][j] = in.nextInt();
                }
            }
        }

        public int getKT() {
            return this.kt;
        }

        public MaTran tong(int[][] k) {
            MaTran sum = new MaTran(this.kt);
            for (int i = 0; i < this.kt; i++) {
                for (int j = 0; j < this.kt; j++) {
                    sum.m[i][j] = this.m[i][j] + k[i][j];
                }
            }
            return sum;
        }

        public int[][] getMatran() {
            return this.m;
        }

        public void out() {
            for (int i = 0; i < this.kt; i++) {
                for (int j = 0; j < this.kt; j++) {
                    System.out.print(this.m[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap kich thuoc
        int n = sc.nextInt();
        MaTran m = new MaTran(n);
        // nhap ma tran a
        m.input(sc);
        MaTran b = new MaTran(m.getKT());
        // nhap ma tran b
        b.input(sc);
        MaTran t = m.tong(b.getMatran());
        // viet ra ma tran tong
        t.out();
    }
}   