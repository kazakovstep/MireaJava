package lab14.box5;

public class Main {
    public static void main(String[] args) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19|20)\\d\\d)$";
        String date = "29/02/2000";
        if (date.matches(regex)) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }
    }
}
