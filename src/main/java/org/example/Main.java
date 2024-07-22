package org.example;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Main {
    public static void main(String[] args) {

     /* System.out.println(hasTeen(10,8,8));
        System.out.println(shouldWakeUp(true,9));
        System.out.println(isCatPlaying(false,35));
        System.out.println( area(-5.0));
        System.out.println(shouldWakeUp(true,-1));*/


    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock<0 || clock>23) return false;

        return isBarking && ((clock < 8) || clock > 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
 return (firstAge>=13 && firstAge<=19)|| (secondAge>=13 && secondAge<=19) || ( thirdAge>=13 && thirdAge<=19);

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return (isSummer && (temp >= 35 && temp <= 45)) || (!isSummer && (temp >= 25 && temp <= 35));
    }

    public static double area(double width, double height) {
        if(width<0 || height<0) return -1;

       return width*height;
    }

    public static double area(double radius) {
       if(radius<0) return -1;
       return radius*radius*Math.PI;
    }
}
