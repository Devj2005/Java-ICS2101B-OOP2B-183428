public class Greet {
    void greet(){
        System.out.println("How you doing? ");

    }
    public static void main(String[] args) {
        (new Greet()).greet(); // create an instance of greeter and call greet method
    }
}
