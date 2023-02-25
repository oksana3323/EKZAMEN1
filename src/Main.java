import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("TOYOTA", LocalDate.of(2020, 2, 20), BoduType.WAGON, 70000);
        Car car2 = new Car(" BMW", LocalDate.of(2015, 11, 25), BoduType.SOV, 600000);
        Car car3 = new Car("SUBARU", LocalDate.of(2013, 11, 20), BoduType.CROSSOVER, 677777);
        Car car4 = new Car("NISSAN", LocalDate.of(2023, 12, 5), BoduType.SEDAN, 40000);
        Car[] cars = {car1, car2, car3, car4};
        for (Car car : cars) {
            System.out.println(car);
            car.boDyTypeldentification();
            car.determinationYerOfManufacture();
        }


    }
}


