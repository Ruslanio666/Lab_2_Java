package com.company;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab2 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Введите значения координат первой точки x y z");
    double point1x = Double.parseDouble(br.readLine());
    double point1y = Double.parseDouble(br.readLine());
    double point1z = Double.parseDouble(br.readLine());

    System.out.println("Введите значения координат второй точки x y z");
    double point2x = Double.parseDouble(br.readLine());
    double point2y = Double.parseDouble(br.readLine());
    double point2z = Double.parseDouble(br.readLine());

    System.out.println("Введите значения координат третей точки x y z");
    double point3x = Double.parseDouble(br.readLine());
    double point3y = Double.parseDouble(br.readLine());
    double point3z = Double.parseDouble(br.readLine());


    Point_3d point_1 = new Point_3d( point1x, point1y, point1z);
    Point_3d point_2 = new Point_3d( point2x, point2y, point2z);
    Point_3d point_3 = new Point_3d( point3x, point3y, point3z);

    if (point_1.comparison(point_2) || point_1.comparison(point_3) || point_2.comparison(point_3))
        System.out.println("Тругольник не существует");
    else
        System.out.println(point_1.distanceTo(point_2));
        System.out.println( point_1.distanceTo(point_3));
        System.out.println( point_2.distanceTo(point_3));

        System.out.println("Площадь треугольника равна: " + computeArea(point_1, point_2, point_3));
    }

    public static double computeArea(Point_3d p1, Point_3d p2, Point_3d p3) {

        double p1p2 = p1.distanceTo(p2);
        double p1p3 = p1.distanceTo(p3);
        double p2p3 = p2.distanceTo(p3);

        double half_per = ((p1p2 + p1p3 + p2p3))/2.0; // Полупериметр
        return round(100*sqrt(half_per*(half_per - p1p2)*(half_per - p1p3)*(half_per - p2p3)))/100; // sqrt{p(p-a)(p-b)(p-c)} — Формула Герона
    }
}