//Surface area of Cylinder

// Rounding off numbers to two decimal places by importing DecimalFormat
import java.text.DecimalFormat;
public class JahagirdarVinitA1 {
    public static void main(String[] args)
    {
        double pi = 3.14; //defining a double pi

        //Looping to satisfy the command line arguments condition
        if (args.length == 2)
        {
            double radius = Double.parseDouble(args[0]); //parseDouble to convert string to double
            double height = Double.parseDouble(args[1]);
            DecimalFormat ro = new DecimalFormat("##.00"); //creating object 'ro' to format the decimal places
            double surface_area = 2 * pi * radius * (radius+height); //formula for calculating surface area of cylinder
            System.out.println("\nGiven radius = " + radius + " and height = " + height + ",");
            System.out.println("the cylinders surface area will be " + ro.format(surface_area) + ".");
        }
        else
        {
            System.out.println("Usage: java JahagirdarVinitA1 radius height");
        }

        System.out.println("\nProgram Completed.");
    }
}
