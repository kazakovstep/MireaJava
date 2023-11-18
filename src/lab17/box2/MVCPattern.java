package lab17.box2;

public class MVCPattern {
    public static void main(String[] args) {
        Worker model = DataBase();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.updaitView();

        System.out.println("-----------------------");

        controller.setWorkerHours(35);
        controller.updaitView();
    }

    static public Worker DataBase(){
        Worker worker = new Worker();
        worker.setName("Stepan");
        worker.setId("i09327As");
        worker.setHours(0);
        return worker;
    }
}
