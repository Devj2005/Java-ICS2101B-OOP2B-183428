import java.util.*;

public class WhileHello { //Class name should be same to file name
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WhileHello obj = new WhileHello();
        obj.showHello(scan); // calling showHello and passing Scanner
    }

    void showHello(Scanner scan) { // moved outside main, and accept Scanner as a parameter
        String ch;
        System.out.println("For hello type H or to stop type anything else: ");
        ch = scan.nextLine(); // read next line
        while ("H".equalsIgnoreCase(ch)) {
            System.out.println("Hello World!");
            ch = scan.nextLine(); // read next line
        }


    }
}
