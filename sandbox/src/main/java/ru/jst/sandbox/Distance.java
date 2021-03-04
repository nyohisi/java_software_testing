package ru.jst.sandbox;

public class Distance {

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 6;
        p1.y = 4;
        Point p2 = new Point();
        p2.x = 3;
        p2.y = 2;

        System.out.println("Расстояние между двумя точками на плоскости = " + distance(p1, p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.y - p1.x) * (p1.y - p1.x) + (p2.y - p2.x) * (p2.y - p2.x));
    }

}