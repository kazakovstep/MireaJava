package lab13.box3;
import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Adress(String addressString) {
        setAddressFieldsWithComma(addressString);
        setAddressFieldsWithAnyDelimiter(addressString);
    }

    private void setAddressFieldsWithComma(String addressString) {
        String[] addressParts = addressString.split(",");
        if (addressParts.length >= 1) {
            country = addressParts[0].trim();
        }
        if (addressParts.length >= 2) {
            region = addressParts[1].trim();
        }
        if (addressParts.length >= 3) {
            city = addressParts[2].trim();
        }
        if (addressParts.length >= 4) {
            street = addressParts[3].trim();
        }
        if (addressParts.length >= 5) {
            house = addressParts[4].trim();
        }
        if (addressParts.length >= 6) {
            building = addressParts[5].trim();
        }
        if (addressParts.length >= 7) {
            apartment = addressParts[6].trim();
        }
    }

    private void setAddressFieldsWithAnyDelimiter(String addressString) {
        StringTokenizer tokenizer = new StringTokenizer(addressString, ",.;");
        if (tokenizer.hasMoreTokens()) {
            if (country == null) {
                country = tokenizer.nextToken().trim();
            }
        }
        if (tokenizer.hasMoreTokens()) {
            if (region == null) {
                region = tokenizer.nextToken().trim();
            }
        }
        if (tokenizer.hasMoreTokens()) {
            if (city == null) {
                city = tokenizer.nextToken().trim();
            }
        }
        if (tokenizer.hasMoreTokens()) {
            if (street == null) {
                street = tokenizer.nextToken().trim();
            }
        }
        if (tokenizer.hasMoreTokens()) {
            if (house == null) {
                house = tokenizer.nextToken().trim();
            }
        }
        if (tokenizer.hasMoreTokens()) {
            if (building == null) {
                building = tokenizer.nextToken().trim();
            }
        }
        if (tokenizer.hasMoreTokens()) {
            if (apartment == null) {
                apartment = tokenizer.nextToken().trim();
            }
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
