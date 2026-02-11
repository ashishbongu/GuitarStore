import java.util.ArrayList;

public class Catalog{
    ArrayList<Guitar> guitarList = new ArrayList<>();

    public void LoadGuitar(Guitar g) {
        guitarList.add(g);
    }

    public void RemoveGuitar(Guitar g){
        guitarList.remove(g);
    }

    



}