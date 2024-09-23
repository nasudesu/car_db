public class Main {
    public static void main(String[] args) {

        CarDAO carDAO = new CarDAO();
        DriverDAO driverDAO = new DriverDAO();

        // Add sample drivers

        Driver john = new Driver("John Doe", 234234);
        Driver jane = new Driver("Jane Smith", 233434);
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        driverDAO.saveDriver(john);
        driverDAO.saveDriver(jane);
        carDAO.saveCar(car1);
        carDAO.saveCar(car2);

        // Assign drivers to cars

        car1.setDriver(john);
        car2.setDriver(jane);

        carDAO.updateCar(car1);
        carDAO.updateCar(car2);
    }
}
