import java.util.Scanner;

public class Class_Point {
    public static class Point {
        private Double x;
        private Double y;

        public Point() {
            this.x = 0.0;
            this.y = 0.0;
        }

        public Point(Double x, Double y) {
            this.x = x;
            this.y = y;
        }

        public Point(Point p) {
            this.x = p.x;
            this.y = p.y;
        }

        public Double getX() {
            return this.x;
        }

        public Double getY() {
            return this.y;
        }

        public Double distance(Point secondP) {
            return Math.sqrt((this.x - secondP.x) * (this.x - secondP.x) + (this.y - secondP.y) * (this.y - secondP.y));
        }

        public static Double distance(Point a, Point b) {
            return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            double d = in.nextDouble();
            Point x = new Point(a, b);
            Point y = new Point(c, d);
            System.out.printf("%.4f\n", Point.distance(x, y));
        }
    }
}