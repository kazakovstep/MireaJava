package lab1;

public class task4 {
    public static void main(String[] args) {
        //Перебор первых 10 чисел
        for (int i = 1; i <= 10; i++) {
            //Расчет гармонического числа
            double harmonic = 1.0 / i;
            //Форматированный вывод с использованием метода printf
            System.out.printf("Число %d: %.2f ", i, harmonic);
            System.out.println();
        }
    }
}
