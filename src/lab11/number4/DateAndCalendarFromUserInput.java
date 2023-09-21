package lab11.number4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendarFromUserInput {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");

        // Введите год, месяц, день, часы и минуты в формате "yyyyMMddHHmm"
        System.out.print("Введите год, месяц, день, часы и минуты (например, 202209151230): ");
        String userInput = scanner.nextLine();

        try {
            // Парсинг строки в объект Date
            Date date = dateFormat.parse(userInput);

            // Вывод объекта Date
            System.out.println("Объект Date: " + date);

            // Создание объекта Calendar и установка даты и времени
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Вывод объекта Calendar
            System.out.println("Объект Calendar: " + calendar.getTime());
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге введенной строки.");
        }
    }
}
