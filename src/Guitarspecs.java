public class Guitarspecs {
    private String model;
    private String manufacturer; 
    private String topwood;
    private String bottomwood;

    public Guitarspecs(String manufacturer, String model, String topwood, String bottomwood){
        this.model=model;
        this.manufacturer=manufacturer;
        this.topwood=topwood;
        this.bottomwood=bottomwood;
    } 

    public String getManufacturer() {return manufacturer;}
    public String getModel(){return model;}
    public String getBottomwood() {return bottomwood;}
    public String getTopwood(){return topwood;}

    public boolean matches(Guitarspecs user_input){
        if(this.model.equals(user_input.model)){
            return true;
        }

        if(this.bottomwood.equals(user_input.bottomwood)){
            return true;
        }

        if(this.model.equals(user_input.model)){
            return true;
        }

        if(this.topwood.equals(user_input.topwood)){
            return true;
        }

        return false;
    }

}
