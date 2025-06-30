

public class MainClassx extends UserAuth {	
    public static void main(String[] args) {
        // Create an Admin (like a university admin)
        Admin Admin1 = new Admin(183428, "DevyanJ", "dev@123");
        // Create a User (like a student)
        User User1 = new User(423455, "JohnOrwa");
        // Admin updates data (uses inherited performOperation with Update)
        Admin1.performOperation(new Update()); // Output: Data has been Updated Successfuly!
        // User views data (uses inherited performOperation with View)
        User1.performOperation(new View()); // Output: Some data to be displayed.
    }

} 
