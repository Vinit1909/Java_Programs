//Arrays

// Importing Scanner method for taking user input
import java.util.Scanner;
public class JahagirdarVinitA2 {
    static int[] input_array;
    public static void main(String[] args) {

        int c = 0; // variable used to set length and type of array
        boolean isInt = false; // conditional variables
        String l = "false";
        Scanner sc = new Scanner(System.in);

        //looping to set range of the input array
        while(l == "false") {
            System.out.print("\nPlease enter the length of an array: ");
            c = sc.nextInt();

            if (c > 1 && c < 11) {
                l = "true";
            }
            else {
                System.out.println("\nUsage: Enter a length between 2-10");
            }
        }

        input_array = new int[c];

        System.out.print("Please enter " + c + " elements for the array: \n");

        // looping to get only integer values
        while (!isInt) {
            Scanner ob = new Scanner(System.in);
            for (int i = 0; i < input_array.length; i++) {
                if (ob.hasNextInt()) {
                    input_array[i] = ob.nextInt();
                    isInt = true;
                }
                else {
                    isInt = false;
                    System.out.println("Usage: Input should only be integer numbers \n");
                    System.out.print("Please enter " + c + " elements for the array: ");
                    break;
                }
            }


        }

        //printing required statements using the methods in the class
        System.out.print("The input array is: ");
        printArray(input_array);

        //sorted array
        System.out.print("The sorted array is: ");
        printArray(sortArray());

        //reversed array
        System.out.print("The reversed array is: ");
        printArray(reverseArray());

        //sum of odd numbers
        System.out.println("The sum of all odd elements is: " + sumOfOdd());

        //smallest number
        System.out.println("The smallest number is: "+input_array[smallestNum()]);
        //index of smallest number
        System.out.println("The last occurrrence of the smallest number is at : index "+smallestNum());

        //largest number
        System.out.println("The largest number is: "+input_array[indexOfLargest()]);
        //index of largest number
        System.out.println("The first occurrence of the largest number is at : index "+indexOfLargest());

        System.out.print("\nProgram Completed.");

    }


    //Method for printing array
    public static void printArray(int[] Array){
        System.out.print("[");
        for(int i=0; i<Array.length; i++){
            if (i != Array.length-1) {
                System.out.print(Array[i] + ", ");
            }
            else{
                System.out.print(Array[i]);
            }
        }
        System.out.println("]");
    }

    //Method for copying the array
    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    //Method for sorting array
    public static int[] sortArray(){

        int[] sort = copyArray(input_array);
        for (int i = 0; i < sort.length; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                int tmp = 0;
                if (sort[i] > sort[j]) {
                    tmp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = tmp;
                }
            }
        }
        return sort;
    }

    //Method for reversing array
    public static int[] reverseArray(){
        int[] reverse = new int[input_array.length];
        int counter = 0;
        for (int i = input_array.length-1; i >= 0; i--) {
            reverse[counter] = input_array[i];
            counter++;
        }
        return reverse;
    }

    //Method for adding all odd numbers in the array
    public static int sumOfOdd(){
        int OddSum = 0;
        for(int i = 0; i < input_array.length; i++) {
            if(input_array[i] % 2 != 0) {
                OddSum = OddSum + input_array[i];
            }
        }
        return OddSum;
    }

    //Method for returning smallest number in the array with its index
    public static int smallestNum(){
        if (input_array.length == 0)
            return -1;
        int index = 0;
        int min = input_array[index];
        for (int i = 1; i < input_array.length; i++){
            if (input_array[i] <= min){
                min = input_array[i];
                index = i;
            }
        }
        return index;
    }

    //Method for returning largest number in the array with its index
    public static int indexOfLargest() {
        // add this
        if (input_array.length == 0)
            return -1;
        int index = 0;
        int max = input_array[index];
        for (int i = 1; i < input_array.length; i++) {
            if (input_array[i] > max) {
                max = input_array[i];
                index = i;
            }
        }
        return index;
    }

}






