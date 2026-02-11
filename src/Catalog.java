import java.util.ArrayList;

public class Catalog{
    ArrayList<Guitar> guitarList = new ArrayList<>();

    public void LoadGuitar(Guitar g) {
        guitarList.add(g);
    }

    public void RemoveGuitar(Guitar g){
        guitarList.remove(g);
    }

    public void showGuitarList() {
        for(int i=0;i<guitarList.size();i++){
            Guitar g=guitarList.get(i);
            System.out.println("Guitar Specifications: "+ g.getSpecs().getColor() + " | "+ g.getSpecs().getModel()+ " | "+ g.getSpecs().getManufacturer()+ " | "+ g.getPrice()+ " | "+ g.getSpecs().getType());
        }
    }

    



}