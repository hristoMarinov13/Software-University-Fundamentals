package ObjectsAndClasses;

public class Vehicle {
    private String type ;
    private String model;
    private String colour ;
    private int horsePower ;

    public Vehicle(String type, String model, String colour, int horsePower) {
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + " \n" +
                "Model: " + this.model + "\n" +
                "Color: " + this.colour + "\n" +
                "Horsepower: " + this.horsePower + "\n";
    }
}
