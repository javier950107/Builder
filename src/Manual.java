public class Manual {
    private int seats;
    private String color;
    private String engine;

    public Manual(int seats, String color, String engine){
        this.setSeats(seats);
        this.setColor(color);
        this.setEngine(engine);
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
