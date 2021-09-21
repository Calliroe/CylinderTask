package com.company;

public class CylinderTask {

    public CylinderTask() {

    }

    public static String solution(double doorHeight, double doorWidth, double cylinderRadius, double cylinderHeight) {
        double diameter = cylinderRadius * 2;
        boolean check = false;
        double a = Math.pow(cylinderHeight, 2) + Math.pow(diameter, 2);
        double b = -2 * Math.pow(cylinderHeight, 2) * doorHeight;
        double c = Math.pow(cylinderHeight, 2) * (Math.pow(doorHeight, 2) - Math.pow(diameter, 2));
        if ((diameter < doorHeight) && (cylinderHeight < doorWidth) || (diameter < doorWidth)) check = true;
        else {
            double discrimimant = QuadraticEquation.discriminant(a, b, c);
            if (discrimimant >= 0) {
                double m1 = (Double) QuadraticEquation.root1(a, b, c);
                double m2 = (Double) QuadraticEquation.root2(a, b, c);
                double mMax = Math.sqrt(Math.pow(cylinderHeight, 2) / 2);
                if (m1 > 0 && m1 < mMax || m2 > 0 && m2 < mMax) {
                    double o = doorHeight - Math.max(m1, m2);
                    double k = Math.sqrt(Math.pow(diameter, 2) - Math.pow(o, 2));
                    double p = doorWidth - k;
                    double n = Math.sqrt(Math.pow(cylinderHeight, 2) - Math.pow(Math.max(m1, m2), 2));
                    if (p >= n) check = true;
                }
            }
        }
        if (check) return "Пройдёт";
        else return "Не пройдёт";
    }
}
