package web.model;


public class Car {
    private String model;
    private String colour;
    private String number;

    public Car() {}

    public Car(String model, String colour, String number) {
        this.model = model;
        this.colour = colour;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return model + " " + colour + " " + number;
    }
}
