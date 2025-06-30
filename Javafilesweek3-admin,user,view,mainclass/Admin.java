public class Admin extends UserAuth {
    private String AuthPass; //for admin specific password

    public Admin(int _UsId, String _UsName, String _Password) {
        id = _UsId;
        name = _UsName;
        AuthPass = _Password;

}

}
