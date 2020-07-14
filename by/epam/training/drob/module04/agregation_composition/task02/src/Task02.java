import java.util.ArrayList;
 /*Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
         менять колесо, вывести на консоль марку автомобиля.*/
public class Task02 {
    public static void main(String[] args) {
        ArrayList<Wheel> listOfWheels = new ArrayList<>();
        listOfWheels.add(new Wheel("ForwardLeft"));
        listOfWheels.add(new Wheel("ForwardRight"));
        listOfWheels.add(new Wheel("BackLeft"));
        listOfWheels.add(new Wheel("BackRight"));
        Car car = new Car("Porshe",new Engine("V8",439),listOfWheels,0);
        CarLogic carLogic = new CarLogic();
        carLogic.carMove(car);
        carLogic.refuel(car,20);
        carLogic.carMove(car);
        Wheel newWheel =new Wheel("newWheel");
        carLogic.changeWheel(car,"ForwardLeft",newWheel);
        carLogic.viewCarModel(car);
    }
}
