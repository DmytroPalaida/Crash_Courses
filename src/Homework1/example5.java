package Homework1;

import java.util.Scanner;

// float
public class example5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three float: ");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();

        if (x > -5 && x < 5 && y > -5 && y < 5 && z > -5 && z < 5){
            System.out.println("All floats belong to the range[-5,5]");
        }else {
            System.out.println("Not all floats belong to the range[-5,5]");
        }

    }

}
