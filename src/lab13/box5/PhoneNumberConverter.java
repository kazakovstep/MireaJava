package lab13.box5;

public class PhoneNumberConverter {
    public static String convertPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            // Исходная строка в формате "+<Код страны><Номер 10 цифр>"
            char countryKod = phoneNumber.charAt(1);
            String countryCode = phoneNumber.substring(1, 4);
            String number = phoneNumber.substring(2);
            return "+" + countryKod + "-" + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
        } else if (phoneNumber.startsWith("8")) {
            // Исходная строка в формате "8<Номер 10 цифр>"
            String number = phoneNumber.substring(1);
            return "+7-" + number.substring(0, 3) + "-" + number.substring(3, 7) + "-" + number.substring(7);
        } else {
            // Некорректный формат строки
            return "Некорректный формат строки телефонного номера";
        }
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        String convertedPhoneNumber1 = convertPhoneNumber(phoneNumber1);
        String convertedPhoneNumber2 = convertPhoneNumber(phoneNumber2);
        String convertedPhoneNumber3 = convertPhoneNumber(phoneNumber3);

        System.out.println(phoneNumber1 + " -> " + convertedPhoneNumber1);
        System.out.println(phoneNumber2 + " -> " + convertedPhoneNumber2);
        System.out.println(phoneNumber3 + " -> " + convertedPhoneNumber3);
    }
}