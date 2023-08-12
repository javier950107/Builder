public class CarBuilder implements Builder{
    private int seats;
    private String color;
    private String engine;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setEngine(String engine) {

        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public Car getResult(){
        return new Car(this.getSeats(), this.getColor(), this.getEngine());
    }
}
