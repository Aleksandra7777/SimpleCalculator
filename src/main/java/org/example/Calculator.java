package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Podaj zmienną 1:");
        double x = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj zmienną 2:");
        double y = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("(+) Dodawanie / (-) Odejmowanie / (*) Mnożenie / (/) Dzielenie");
        String wybor = scanner.nextLine();

        if(wybor.equals("+")) {
            System.out.println(x + y);
        } else if (wybor.equals("-")) {
            System.out.println(x-y);
        } else if (wybor.equals("*")) {
            System.out.println(x*y);
        } else if (wybor.equals("/")){
            System.out.println(x/y);
        }
    }
}
