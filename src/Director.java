public class Director {

    public void constructManualCar(Builder builder){
        builder.setColor("Red");
        builder.setEngine("Electric");
        builder.setSeats(2);
    }

    public void constructNormalCar(Builder builder){
        builder.setColor("Blue");
        builder.setSeats(4);
        builder.setEngine("Gas");
    }
}
