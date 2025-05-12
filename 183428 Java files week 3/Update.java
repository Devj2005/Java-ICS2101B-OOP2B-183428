// Update operation, implements DataSource (e.g., updating a grade)
public class Update implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been Updated Successfully! Final changes made");
    }
}