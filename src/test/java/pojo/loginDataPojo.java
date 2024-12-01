package pojo;

public class loginDataPojo {
    private String username;
    private String password;

    public loginDataPojo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "loginDataPojo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
