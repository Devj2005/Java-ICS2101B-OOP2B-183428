package RECURSION;
public class Sum {
 public static int Sum(int n) {
        if (n==1) {
            return 1;
        }else{
            return n + Sum(n - 1);
        }


}
public static void main(String[] args) {
    int n = 5; // Example input
        int result = Sum(n);
        System.out.println("The sum of numbers from 1 to " + n + " is: " + result);
}
}