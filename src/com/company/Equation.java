package com.company;

public class Equation {

    double a;
    double b;
    double c;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double dis() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    void decision() {
        double d = this.dis();
        if (d < 0) {
            System.out.println("Корней нет");
        } else {
            if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("x1 = " + x1 + "; x2 = " + x2);
            }
        }
    }

}


