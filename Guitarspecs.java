public class Guitarspecs {
    private String model;
    private String manufacturer;
    private enum type{
        ACOUSTIC,
        JAZZ,
        CLASSIC
    };
    private double price;
    private  int strings;
    private String color;

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getStrings() {
        return strings;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    


}
