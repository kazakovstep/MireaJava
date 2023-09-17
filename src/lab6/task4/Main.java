package lab6.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(
                new Object(313.23, "Машинка"),
                new Object(2313.2, "Холодильник"),
                new Object(216747.23, "Квартира")
        ));

        for (Object el: list){
            System.out.println(el.getPrice());
        }
    }
}
