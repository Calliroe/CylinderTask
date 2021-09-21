package com.company;

public class QuadraticEquation {

    public QuadraticEquation() {
    }

    public static double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static Object root1(double a, double b, double c) {
        double d = discriminant(a, b, c);
        if (d >= 0) return (-b - Math.sqrt(d)) / (2 * a);
        else return null;
    }

    public static Object root2(double a, double b, double c) {
        double d = discriminant(a, b, c);
        if (d >= 0) return (-b + Math.sqrt(d)) / (2 * a);
        else return null;
    }

    public static void printRoots(double a, double b, double c) {
        double d = discriminant(a, b, c);
        if (d < 0) {
            System.out.println("Корней нет");
        } else {
            if (d == 0) {
                double x = (Double) QuadraticEquation.root1(a, b, c);
                System.out.println("x = " + x);
            } else {
                double x1 = (Double) QuadraticEquation.root1(a, b, c);
                double x2 = (Double) QuadraticEquation.root2(a, b, c);
                System.out.println("x1 = " + x1 + "; x2 = " + x2);
            }
        }
    }

}


