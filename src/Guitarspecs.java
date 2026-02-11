public class Guitarspecs {
    private String model;
    private String manufacturer;
    public enum Type{
        ACOUSTIC,
        JAZZ,
        CLASSIC
    };  
    public Type type;
    private  int Strings;
    private String color;

    public Guitarspecs(String model, String manufacturer, Type type, int Strings, String color){
        this.model=model;
        this.manufacturer=manufacturer;
        this.type=type;
        this.Strings=Strings;
        this.color=color;
    } 

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getStrings() {
        return Strings;
    }

    public Type getType() {
        return type;
    }


    


}
