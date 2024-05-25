public class Main {
    public static void main(String[] args) {
        CMP202 printUser = new CMP202();
        printUser.printUserDetails();        
        Person staff = new Person("Staff Name", "Bingham", "23424", null, 445);
        System.out.println(staff);
    }
}
