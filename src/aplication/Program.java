package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p1 = (xA + xB + xC)/2.0;
        double p2 = (yA + yB + yC)/2.0;

        double areaX = Math.sqrt(p1*(p1-xA)*(p1-xB)*(p1-xC));
        double areaY = Math.sqrt(p2*(p2-yA)*(p2-yB)*(p2-yC));

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p1);
        System.out.println("area1: " + areaX);
        System.out.println("area2: " + areaY);

        sc.close();
    }
}
