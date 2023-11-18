package lab13.box2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFormattedName() {
        StringBuilder fullName = new StringBuilder();

        if (lastName != null) {
            fullName.append(lastName);
        }

        if (firstName != null) {
            if (!fullName.isEmpty()) {
                fullName.append(" ");
            }
            fullName.append(firstName.charAt(0)).append(".");
        }

        if (middleName != null) {
            if (!fullName.isEmpty()) {
                fullName.append(" ");
            }
            fullName.append(middleName.charAt(0)).append(".");
        }

        return fullName.toString();
    }
}
