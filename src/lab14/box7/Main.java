package lab14.box7;

public class Main {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        String password = "F032_Password";
        if (password.matches(regex)) {
            System.out.println("Password is strong");
        } else {
            System.out.println("Password is weak");
        }
    }
}
