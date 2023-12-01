import java.util.Scanner;
import java.io.*;

public class LopPair {
    public static class Pair<K, V> {
        private K first;
        private V second;

        public Pair(K first, V second) {
            this.first = first;
            this.second = second;
        }

        public K getFirst() {
            return this.first;
        }

        public V getSecond() {
            return this.second;
        }

        public void setFirst(K first) {
            this.first = first;
        }

        public void setSecond(V second) {
            this.second = second;
        }

        public boolean isPrime() {
            if (first instanceof Integer && second instanceof Integer) {
                int num1 = (Integer) first;
                int num2 = (Integer) second;

                return isPrimeNumber(num1) && isPrimeNumber(num2);
            }
            return false;
        }

        private boolean isPrimeNumber(int num) {
            if (num <= 1) {
                return false;
            }
            if (num <= 3) {
                return true;
            }
            if (num % 2 == 0 || num % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            return this.first + " " + this.second;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check)
                System.out.println(-1);
        }
    }
}
