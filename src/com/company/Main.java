package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the first catheter:");
        Scanner in = new Scanner(System.in);
        double cat1 = in.nextDouble();
        System.out.print("Enter the hypotenuse:");
        double hypo = in.nextDouble();
        double cat2 = Math.sqrt(Math.pow(hypo, 2) - Math.pow(cat1, 2) );
        System.out.println("The second catheter = " + cat2);
    }
}
