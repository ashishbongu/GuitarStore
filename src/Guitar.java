public class Guitar {
    private String guitarId;
    private double price;
    Guitarspecs specs;

    public Guitar(String guitarId, double price, Guitarspecs specs){
        this.guitarId=guitarId;
        this.price=price;
        this.specs=specs;
    }

    public String getGuitarId() { return guitarId;}
    public double getPrice() {return price;}
    public Guitarspecs getSpecs() {return specs;}
    
}
