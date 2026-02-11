import java.util.Scanner;

public class Test {
    public static void main(String args[]){
       

        //GuitarSpecs specs = new GuitarSpecs(manufacturer, model, topWood, bottomWood, price);
        //catalog.addGuitar(serialNumber, specs);   -> CAN DO THIS !! NO WORRIES :) 
        Guitarspecs specs1= new Guitarspecs("M102", "Yamaha",Guitarspecs.Type.ACOUSTIC, 14, "blue");
        Guitar g1= new Guitar("G101", 12999,specs1);
        Catalog c=new Catalog();
        Scanner sc=new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("1.Add Guitar (CuD)\n2.Remove Guitar (CuD)\n3.Search Guitar\n4.Show Guitars");
            System.out.print("SUBMIT YOUR CHOICE:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    c.LoadGuitar(g1);
                    System.out.println("Guitar added");
                    break;
                    
                case 3:
                    System.out.println("Search: ");
                    break;

                case 4:
                    c.showGuitarList();
                    break;
            
                default:
                    break;
            }

            
            
        }

        
    }
}
