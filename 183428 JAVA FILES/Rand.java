import java.util.*;

public class Rand {
 
public static void main(String[] args) {
    

Random rand = new Random();

int x;
double y;

x = rand.nextInt(10); // 0-9 might be guessed
y = rand.nextDouble(); // guesses between 0 and 1.0 

System.out.println("x = " + x);
System.out.println("y = " + y);
    }
}