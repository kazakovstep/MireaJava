package lab6.task6789;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> list = new ArrayList<>(Arrays.asList(
                new Book("Война и мир", 958, "А.С. Пушкин"),
                new Book("Капитанская дочка", 7420, "А.С. Пушкин")
        ));

        for(Printable el: list){
            el.print();
        }
    }
}
