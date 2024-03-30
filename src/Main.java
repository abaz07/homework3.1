public class Main {
    public static void main(String[] args) {
        Auto car1 = new Car("car1", 4);
        Auto car2 = new Car("car2", 4);
        Auto truck1 = new Truck("truck1", 6);
        Auto truck2 = new Truck("truck2", 8);
        Auto bicycle1 = new Bicycle("bicycle1",2);
        Auto bicycle2 = new Bicycle("bicycle2",3);
        Auto[] autos = {car1, car2, truck1, truck2, bicycle1, bicycle2};
        ServiceStation station = new ServiceStation();
        for (Auto auto : autos) {
            station.check(auto);
        }
    }
    }