package com.company;

public class CylinderTask {
    double doorHeight;
    double doorWidth;
    double cylinderRadius;
    double cylinderHeight;

    public CylinderTask(double doorHeight, double doorWidth, double cylinderRadius, double cylinderHeight) {
        this.doorHeight = Math.max(doorHeight, doorWidth);
        this.doorWidth = Math.min(doorHeight, doorWidth);
        this.cylinderRadius = cylinderRadius;
        this.cylinderHeight = cylinderHeight;
    }

    void decision() {
        double diameter = cylinderRadius * 2;
        boolean check = false;
        if ((diameter < doorHeight) && (cylinderHeight < doorWidth) || (diameter < doorWidth)) check = true;
        else {
            Equation equation = new Equation(Math.pow(cylinderHeight, 2) + Math.pow(diameter, 2), -2 * Math.pow(cylinderHeight, 2) * doorHeight, Math.pow(cylinderHeight, 2) * (Math.pow(doorHeight, 2) - Math.pow(diameter, 2)));
            double discrimimant = equation.dis();
            if (discrimimant >= 0) {
                double m1 = (2 * doorHeight * Math.pow(cylinderHeight, 2) + Math.sqrt(discrimimant)) / (2 * (Math.pow(diameter, 2) + Math.pow(cylinderHeight, 2)));
                double m2 = (2 * doorHeight * Math.pow(cylinderHeight, 2) - Math.sqrt(discrimimant)) / (2 * (Math.pow(diameter, 2) + Math.pow(cylinderHeight, 2)));
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
        if (check) System.out.println("Пройдёт");
        else System.out.println("Не пройдёт");
    }
}
