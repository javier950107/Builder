public class ManualBuilder implements Builder{

    private int seats;
    private String color;
    private String engine;

    public int getSeats() {
        return seats;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

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

    public Manual getResult(){
        return new Manual(this.getSeats(), this.getColor(), this.getEngine());
    }
}
