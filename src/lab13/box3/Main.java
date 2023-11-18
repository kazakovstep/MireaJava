package lab13.box3;

public class Main {
    public static void main(String[] args) {
        String addressString1 = "Россия, Москва, Центральный округ, Тверская улица, 10, 1, 5";
        Adress address1 = new Adress(addressString1);
        System.out.println(address1);

        String addressString2 = "Россия; Сочи; Ленинский район; Ул. Павлика Морозова, 24, 2, 62";
        Adress address2 = new Adress(addressString2);
        System.out.println(address2);

        String addressString3 = "США. Калифорния. Лос-Анджелес. Sunset Boulevard, 123, B, 789";
        Adress address3 = new Adress(addressString3);
        System.out.println(address3);

        String addressString4 = "Германия; Берлин; Митте, Friedrichstraße, 1";
        Adress address4 = new Adress(addressString4);
        System.out.println(address4);
    }
}
