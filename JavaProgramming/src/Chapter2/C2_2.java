/**
 * Program to display area/volume to the console
 *
 * @author Daniel Anderson
 */
package Chapter2;

import java.util.Scanner;

public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }

}
