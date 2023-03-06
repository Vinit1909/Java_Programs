//Calculator

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int ans = 0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the operation: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op =='/' || op == '%'){
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }

                if (op == '-'){
                    ans = num1 - num2;
                }

                if (op == '*'){
                    ans = num1 * num2;
                }

                if (op == '/'){
                    ans = num1 / num2;
                }

                if (op == '%'){
                    ans = num1 % num2;
                }

            }

            else if(op == 'x' || op == 'X'){
                System.out.print("Operation Complete");
                break;
            }

            else{
                System.out.print("Invalid Operation");
            }
            System.out.println("The result is: "+ans);
        }

    }
}
