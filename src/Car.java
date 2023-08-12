public class Car {
    private int seats;
    private String color;
    private String engine;

    public Car(int _seats, String _color, String _engine){
        this.setSeats(_seats);
        this.setColor(_color);
        this.setEngine(_engine);
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
}
