package endweekexercises;
public class ArrayChallenge{

    public static void main(String[] args){
        String[] example = {"Devyan", "John", "Alice"};

        for (String name: example){
            System.out.println("MY name is" + " " + name);
        
        if (name.startsWith("D")) {
             System.out.println(name + " starts with D");
        } else {
             System.out.println(name + " does not start with D");
            }
        }
    }
}
// Output:
