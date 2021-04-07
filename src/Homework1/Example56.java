package Homework1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example56{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of the brick: a(height),b(length),c(width) :");
        System.out.print("a = ");
        int aheight = Integer.parseInt(br.readLine());
        System.out.print("b = ");
        int blength = Integer.parseInt(br.readLine());
        System.out.print("c = ");
        int cwidth = Integer.parseInt(br.readLine());

        System.out.println("Enter the hole value: x(length), y(width) :");
        System.out.print("x = ");
        int xlength = Integer.parseInt(br.readLine());
        System.out.print("y = ");
        int ywidth = Integer.parseInt(br.readLine());

        if (blength<xlength && cwidth<ywidth)
        {
            System.out.println("The brick will fit into the hole");

        }
        else if (blength<xlength && cwidth>ywidth && cwidth<xlength && blength<ywidth)
        {
            System.out.println("The brick will fit into the hole if it is turned 90 degrees (b||y)");

        }
        else if (blength>xlength && cwidth<ywidth && cwidth<xlength && blength<ywidth)
        {
            System.out.println("The brick will fit into the hole if it is turned 90 degrees (c||x)");

        }
        else if (blength<xlength && cwidth>ywidth && aheight<ywidth)
        {
            System.out.println("The brick will fit into the hole if you put a rib а||y)");

        }
        else if (blength>xlength && cwidth<ywidth && aheight<xlength)
        {
            System.out.println("The brick will fit into the hole if you put a rib а||x)");

        }
        else {
            System.out.println("The brick will not fit into the hole");
        }

    }
}
