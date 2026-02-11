import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        
        Catalog c=new Catalog();
        Scanner sc=new Scanner(System.in);
        int choice;

        try {

            File file =new File("src\\guitars.txt");
            Scanner scan=new Scanner(file);

            if(scan.hasNextInt()){
                int total = scan.nextInt();
                scan.nextLine();
                
                while(total-- != 0){
                    String guitarId = scan.nextLine().trim();
                    String manufacturer = scan.nextLine().trim();
                    String model =scan.nextLine().trim();
                    String topwood = scan.nextLine().trim();
                    String bottomwood = scan.nextLine().trim();
                    double price = Double.parseDouble(scan.nextLine().trim());

                    Guitarspecs specs= new Guitarspecs(manufacturer,model,topwood,bottomwood);
                    Guitar guitar= new Guitar(guitarId,price,specs);
                    c.LoadGuitar(guitar);
                }

                scan.close();
            }
            
        } catch (Exception e) {
            System.out.println("Error: Guitars.txt file not found.");
        }
        

        while(true){
            System.out.println("WELCOME TO GUITAR STORE!!\n\n1.Search Guitar (CuD)\n2.Show Guitar");
            System.out.print("SUBMIT YOUR CHOICE:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Search: ");
                    Guitarspecs input=new Guitarspecs("Gibson", "ES-335", "Maple", "Mahogany");
                    c.SearchGuitar(input);
                    break;

                case 2:
                    c.showGuitarList();
                    System.out.println("\n\n");
                    break;
            
                default:
                    break;
            }

            
        }

        
        
    }
}
