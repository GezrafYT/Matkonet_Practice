package MatkonetPractice.OOP;

public class Flashlight {


    private String model;
    private double price;

    public Flashlight(String model, double price)
    {
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
