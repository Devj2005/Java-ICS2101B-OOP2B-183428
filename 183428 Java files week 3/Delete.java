    // Delete operation, implements DataSource (e.g., deleting a record)
public class Delete implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been deleted.");
    }
}
