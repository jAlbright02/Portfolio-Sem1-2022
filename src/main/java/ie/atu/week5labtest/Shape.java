package ie.atu.week5labtest;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        //created first instance of rectangle
        System.out.println("Please enter the length of the rectangle");
        Scanner input = new Scanner(System.in);
        Rectangle shapeRect = new Rectangle();
        double length = input.nextDouble();
        shapeRect.setLength(length);
        System.out.println("You entered : " + shapeRect.getLength());

        System.out.println("Please enter the width of the rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("You entered : " + shapeRect.getWidth());

        //created second instance of rectangle
        Rectangle shapeRect2 = new Rectangle();
        System.out.println("Please enter the second length of the rectangle");
        double length2 = input.nextDouble();
        shapeRect2.setLength(length2);
        System.out.println("You entered : " + shapeRect2.getLength());

        System.out.println("Please enter the second width of the rectangle");
        double width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.println("You entered : " + shapeRect2.getWidth());

        Rectangle shapeRect3 = new Rectangle(45.0, 67.0);
        System.out.println("You entered for width: " + shapeRect3.getWidth());
        System.out.println("You entered for length: " + shapeRect3.getLength());

    }
}
