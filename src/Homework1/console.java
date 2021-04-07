package Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class console{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Task 1");
        System.out.println("Hello. What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live?");
        String address = br.readLine();
        System.out.println("Hello " + name);
        System.out.println("I live in " + address);

        System.out.println("Task 2");
        Scanner io = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = io.nextDouble();
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));

        System.out.println("Task 3");
        System.out.println("Enter 3 countries(units per minute): ");
        String Sc1 = br.readLine();
        String Sc2 = br.readLine();
        String Sc3 = br.readLine();
        double c1 = Double.parseDouble(Sc1);
        double c2 = Double.parseDouble(Sc2);
        double c3 = Double.parseDouble(Sc3);

        System.out.println("Enter how many minutes every country spoke: ");
        String St1 = br.readLine();
        String St2 = br.readLine();
        String St3 = br.readLine();
        double t1 = Double.parseDouble(St1);
        double t2 = Double.parseDouble(St2);
        double t3 = Double.parseDouble(St3);
        System.out.println((c1 * t1) + (c2 * t2) + (c3 * t3));

    }
}
