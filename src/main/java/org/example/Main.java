package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (isBarking) {
            return (clock >= 0 && clock < 8) || (clock >= 20 && clock <= 23);
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        int[] ages = { firstAge, secondAge, thirdAge };
        for (int age: ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double width, double height) {
        if (width >= 0 && height >= 0) {
            return width*height;
        }
        return -1;
    }

    public static double area(double radius) {
        if (radius >= 0) {
            return radius*radius*Math.PI;
        }
        return -1;
    }
}
