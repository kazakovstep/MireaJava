package lab4.task1;

public class FavoriteSeason {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;

        System.out.println("Информация о моем любимом времени года:");
        System.out.println("Название: " + favoriteSeason);

        switch (favoriteSeason) {
            case SPRING:
                System.out.println("Я люблю весну!");
                System.out.println("Средняя температура: "+ Season.SPRING.getAverageTemperature()+"°C");
                System.out.println(Season.SPRING.getDescription());

                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                System.out.println("Средняя температура: "+ Season.SUMMER.getAverageTemperature()+"°C");
                System.out.println(Season.SUMMER.getDescription());
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                System.out.println("Средняя температура: "+ Season.AUTUMN.getAverageTemperature()+"°C");
                System.out.println(Season.AUTUMN.getDescription());
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                System.out.println("Средняя температура: "+ Season.WINTER.getAverageTemperature()+"°C");
                System.out.println(Season.WINTER.getDescription());
                break;
            default:
                break;
        }
        System.out.println();
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season.name());
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}