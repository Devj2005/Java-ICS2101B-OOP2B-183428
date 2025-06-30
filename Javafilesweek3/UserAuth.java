
abstract class UserAuth {
    protected int id;
    protected String name;

    private DataSource myDataSource;

    // Constructor
    public void performOperation(DataSource _myDataSource) {
        // This method is used to perform operations on the data source
        this.myDataSource = _myDataSource; // It uses association to store the data source
        myDataSource.execute(); //using polymorphism to call specific method
    }


}






