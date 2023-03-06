//Package Shipment

import java.util.Arrays;
import java.util.Scanner;

public class JahagirdarVinitA4 {
    //5 private double variables
    private double length;
    private double width;
    private double height;
    private double weight;
    private double dimWeight;


    //constructor
    public JahagirdarVinitA4(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;

        //Making sure that user input is a number and not more than one number
        String s = "false";
        while(s == "false"){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the weight of the package: ");
                weight = Double.parseDouble(sc.nextLine());
                s = "true";
                if (String.valueOf(weight).contains(" ")){
                    System.out.println("Weight should be a number.");
                }
            }
            catch(Exception e){
                System.out.println("Weight should be a number.");
            }
        }
    }

    //getter functions
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public double getDimWeight(){
        return dimWeight;
    }

    //setter functions
    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setDimWeight(double dimWeight){
        this.dimWeight = dimWeight;
    }

    //rearranging dimensions to make length maximum and height minimum
    public void rearrangeDim(){
        double[] dimensions = {this.length, this.width, this.height};
        Arrays.sort(dimensions);
        this.length = dimensions[2];
        this.width = dimensions[1];
        this.height = dimensions[0];
    }

    //Calculating dimensional weight
    public void calDimWeight(){
        double dimWeight = (this.length * this.width * this.height)/166;
        this.dimWeight = Math.ceil(dimWeight);
    }

    //Calculating shipping price
    public double calPrice(){
        double price;
        if (getDimWeight() > getWeight()){
            price = (10.0 + (getDimWeight() - 1) * 1.1);
        }
        else{
            price = (10.0 + (getWeight() - 1) * 1.1);
        }
        return price;
    }

    //Validating the length of the package
    public boolean validateLength(){
        this.rearrangeDim();
        if (this.length>= 78){
            return false;
        }
        return true;
    }

    //Printing...
    public void printInfo(){

        if(validateLength()){
            this.calDimWeight();
            System.out.println("The package is acceptable.");
            System.out.println("Estimated shipping prices is: "+ calPrice());
        }
        else{
            System.out.println("The package is not acceptable.");
        }
    }

    //The main function!
    public static void main(String args[]){
        JahagirdarVinitA4 package1 = new JahagirdarVinitA4(7, 9, 15);
        package1.printInfo();
        JahagirdarVinitA4 package2 = new JahagirdarVinitA4(15, 25, 9);
        package2.printInfo();
        JahagirdarVinitA4 package3 = new JahagirdarVinitA4(58, 68, 78);
        package3.printInfo();

        System.out.println("\nProgram Completed\n");
    }
}
