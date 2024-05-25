public class CMP202 {
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 23;
        height = 172;
        name = "Abdul";
        name.length();
        password = "Yusufhamid123";
        if (password.contains("123") || password.contains("User")) {
            System.out.println("Password is not strong");
        }
    }    
}
