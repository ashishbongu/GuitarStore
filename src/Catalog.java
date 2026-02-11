import java.util.ArrayList;

public class Catalog{
    ArrayList<Guitar> guitarList = new ArrayList<>();

    public void LoadGuitar(Guitar g) {
        guitarList.add(g);
    }

    public void showGuitarList() {
        for(int i=0;i<guitarList.size();i++){
            Guitar g=guitarList.get(i);
            System.out.println("Guitar Specifications: "+ g.getGuitarId()+" : "+ g.getSpecs().getManufacturer() + " | "+ g.getSpecs().getModel()+ " | "+ g.getSpecs().getTopwood()+ " | "+ g.getPrice()+ " | "+ g.getSpecs().getBottomwood());
        }
    }

    public void SearchGuitar(Guitarspecs user_input){
        Guitar g;
        for(int i=0;i<guitarList.size();i++){
            g=guitarList.get(i);
            if(g.getSpecs().matches(user_input)){
                System.out.println(g.getGuitarId()+" : "+ g.getSpecs().getManufacturer() + " | "+ g.getSpecs().getModel()+ " | "+ g.getSpecs().getTopwood()+ " | "+ g.getPrice()+ " | "+ g.getSpecs().getBottomwood());
            }
            
            // System.out.println("Guitar Specifications: "+ g.getGuitarId()+" : "+ g.getSpecs().getManufacturer() + " | "+ g.getSpecs().getModel()+ " | "+ g.getSpecs().getTopwood()+ " | "+ g.getPrice()+ " | "+ g.getSpecs().getBottomwood());
            
        }
    }

    



}