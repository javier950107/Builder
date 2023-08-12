public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        System.out.println("Building manual car");
        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructManualCar(manualBuilder);
        Manual manual = manualBuilder.getResult();

        System.out.println("Color "+manual.getColor());
        System.out.println("Num of seats "+String.valueOf(manual.getSeats()));
        System.out.println("Engine "+manual.getEngine());

        System.out.println("****************************");

        System.out.println("Building normal car");
        CarBuilder carBuilder = new CarBuilder();
        director.constructNormalCar(carBuilder);
        Car car = carBuilder.getResult();

        System.out.println("Color "+car.getColor());
        System.out.println("Num of seats "+String.valueOf(car.getSeats()));
        System.out.println("Engine "+car.getEngine());
    }
}