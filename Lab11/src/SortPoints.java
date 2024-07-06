import java.util.Arrays;

public class SortPoints {
    public static void main(String[] args) {
        Point[] points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(Math.random() * 100, Math.random() * 100);
        }

        Arrays.sort(points);
        System.out.println("Points sorted by x-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }

        Arrays.sort(points, new CompareY());
        System.out.println("Points sorted by y-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
