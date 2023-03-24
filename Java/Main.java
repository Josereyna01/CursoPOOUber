public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123");
        car.license  = "AMQ123";
        car.driver = "Jose Reyna";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "JUA789";
        car2.driver = "Fatima Robles";
        car2.passenger = 6;
        car2.printDataCar();

    }
}