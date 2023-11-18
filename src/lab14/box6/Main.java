package lab14.box6;

public class Main {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        String email = "user@example.com";
        if (email.matches(regex)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
