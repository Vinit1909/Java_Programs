//Anagrams and Palindromes

import java.util.Arrays;
import java.util.Scanner;

public class JahagirdarVinitA3 {
    //main function - body of the required program inputs and outputs
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("str1 = " );
        String str1 = sc.nextLine();
        System.out.print("str2 = " );
        String str2 = sc.nextLine();
        System.out.print("str3 = " );
        String str3 = sc.nextLine();


        // printing the required statements for anagram
        if(isAnagram(str1, str2)){
            System.out.println(str1 + " and "+ str2 +" are anagrams of each other.");
        }
        else{
            System.out.println(str1 + " and "+ str2 +" are not anagrams of each other.");
        }

        // printing the required statements for palindrome
        if(isPalindrome(str3)){
            System.out.println("The given string is palindrome.");
        }
        else{
            System.out.println("The given string is not palindrome.");
        }

        System.out.println("Program Completed.");
    }


    // function to check if two strings are anagrams of each other
    public static boolean isAnagram(String s1, String s2){

        s1 = Arrays.toString(stringSort(s1));  //converting the character array into String
        s2 = Arrays.toString(stringSort(s2));  
        return s1.equals(s2);
    }

    // function to check if a string is palindrome
    public static boolean isPalindrome(String s3) {
        s3= s3.replaceAll("\\s|\\p{Punct}","").toLowerCase();  // ignoring all white spaces and punctuations
        for (int i = 0; i <= s3.length() / 2; i++) {
            char start = s3.charAt(i);
            char end = s3.charAt(s3.length() - 1 - i);

            if (start != end){
                return false;
            }
        }
        return true;
    }


    // function to sort a string
    private static char[] stringSort(String s){
        s = s.replaceAll("\\s|\\p{Punct}","").toLowerCase();  // ignoring all white spaces and punctuations
        char[] temp_array = s.toCharArray();  // converting string into a character array for easy operations
        char temp;
        int i = 0;
        while(i < temp_array.length){
            int j = i + 1;
            while (j < temp_array.length){
                if (temp_array[j] < temp_array[i]){
                    temp = temp_array[i];
                    temp_array[i] = temp_array[j];
                    temp_array[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        return temp_array;
    }

}
