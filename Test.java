import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Catalog c=new Catalog();
        Scanner sc=new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("1.Add Guitar\n2.Remove Guitar\n3.Search Guitar");
            System.out.print("SUBMIT YOUR CHOICE:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    Guitar g=new Guitar();
                    Guitarspecs s=new Guitarspecs();
                    System.out.println("Enter your Guitarspecs:");
                    System.out.println();
                    
                    break;
            
                default:
                    break;
            }
            
            break;
        }
    }
}
