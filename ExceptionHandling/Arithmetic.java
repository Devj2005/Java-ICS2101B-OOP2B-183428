import java.io.*;

class Arithmetic{
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;
        int ans = 0;
        try {
            ans = num1/num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }finally{
            System.out.println("Execution has been completed.");
        }
        System.out.println("The answer is: " + ans);
    }
}