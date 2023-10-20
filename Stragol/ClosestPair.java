package Stragol;

import java.util.Arrays;

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class ClosestPair {
    public static void main(String[] args) {
        Point[] points = {
            new Point(2, 3),
            new Point(12, 30),
            new Point(40, 50),
            new Point(5, 1),
            new Point(12, 10),
            new Point(3, 4)
        };

        Arrays.sort(points, (p1, p2) -> Double.compare(p1.x, p2.x));

        double closestDistance = closestPair(points, 0, points.length - 1);
        System.out.println("Jarak terdekat antara dua titik adalah: " + closestDistance);
    }

    public static double closestPair(Point[] points, int left, int right) {
        if (right - left <= 2) {
            return bruteForceClosest(points, left, right);
        }

        int mid = (left + right) / 2;
        Point midPoint = points[mid];

        double leftMin = closestPair(points, left, mid);
        double rightMin = closestPair(points, mid + 1, right);

        double minDistance = Math.min(leftMin, rightMin);

        Point[] strip = new Point[right - left + 1];
        int stripSize = 0;
        for (int i = left; i <= right; i++) {
            if (Math.abs(points[i].x - midPoint.x) < minDistance) {
                strip[stripSize] = points[i];
                stripSize++;
            }
        }

        Arrays.sort(strip, 0, stripSize, (p1, p2) -> Double.compare(p1.y, p2.y));

        for (int i = 0; i < stripSize; i++) {
            for (int j = i + 1; j < stripSize && (strip[j].y - strip[i].y) < minDistance; j++) {
                double distance = Point.distance(strip[i], strip[j]);
                minDistance = Math.min(minDistance, distance);
            }
        }

        return minDistance;
    }

    public static double bruteForceClosest(Point[] points, int left, int right) {
        double minDistance = Double.POSITIVE_INFINITY;
        for (int i = left; i <= right; i++) {
            for (int j = i + 1; j <= right; j++) {
                double distance = Point.distance(points[i], points[j]);
                minDistance = Math.min(minDistance, distance);
            }
        }
        return minDistance;
    }
}