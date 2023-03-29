public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Jose Reyna","AND123" ));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("JUA789", new Account("Fatima Robles", "ANDA876"));
        car2.passenger = 6;
        car2.printDataCar();

    }
}