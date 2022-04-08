package com.Bridgelabz;
import java.util.Scanner;

public class LineComparisonProblemUC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,x2,y1,y2;

        System.out.println("Enter x1 value: ");
        x1 = sc.nextInt();
        System.out.println("Enter x2 value: ");
        x2 = sc.nextInt();
        System.out.println("Enter y1 value: ");
        y1 = sc.nextInt();
        System.out.println("Enter y2 value: ");
        y2 = sc.nextInt();

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line between points " + "(" + x1 + "," + y1 + ")," +
                "(" + x2 + "," + y2 + ") = " + length);
    }
}
