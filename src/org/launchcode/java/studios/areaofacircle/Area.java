package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        try {
            double radius = input.nextDouble();
            if (radius < 0) {
                System.err.println("Not a positive number");
                radius = input.nextDouble();
            }
                Double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is " + area);
        } catch (Exception error) {
            System.err.println("Nothing is here");
        }

//          Double area = Math.PI * Math.pow(radius, 2);

        }
    }



