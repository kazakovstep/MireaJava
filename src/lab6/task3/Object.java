package lab6.task3;

public class Object implements Nameable{
    private String name;

    public Object(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
