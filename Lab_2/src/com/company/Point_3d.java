package com.company;

import java.lang.Math;

import static java.lang.Math.*;

public class Point_3d {

    private double x;
    private double y;
    private double z;

    public Point_3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point_3d() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }

    public boolean comparison(Point_3d point) {
        return point.getX() == this.getX() && point.getY() == this.getY() && point.getZ() == this.getZ();
    }

    public double distanceTo(Point_3d point) {
       return (double)round(100 * sqrt(pow(point.getX() - this.getX(), 2)
        + pow(point.getY() - this.getY(), 2)
        + pow(point.getZ() - this.getZ(), 2)))/100;
    }
}
