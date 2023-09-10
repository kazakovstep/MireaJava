package lab3;

public class task5 {
    public static void main(String[] args) {
        ////1. Создать массив объектов класса Double, используя метод valueOf():
        Double[] array = new Double[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Double.valueOf(i + 1);
        }
        ///2. Преобразовать значение типа String к типу double, используя метод parseDouble():
        String str = "3.14";
        double value = Double.parseDouble(str);
        ///3. Преобразовать объект класса Double ко всем примитивным типам:
        Double number = 3.14;

        double primitiveDouble = number.doubleValue();
        float primitiveFloat = number.floatValue();
        int primitiveInt = number.intValue();
        long primitiveLong = number.longValue();
        short primitiveShort = number.shortValue();
        byte primitiveByte = number.byteValue();
        ////4. Вывести значение объекта Double на консоль:
        Double num = 3.14;
        System.out.println(num);
        ////5. Преобразовать литерал типа double к строке:
        String d = Double.toString(3.14);
    }
}
