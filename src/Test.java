import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        loadInventoryFromFile(
            "C:\\Users\\B_ASHISH\\eclipse-workspace\\GuitarShop\\src\\Instruments.txt",
            inventory
        );

        System.out.println("\nInventory Loaded Successfully\n");

        /* ----------- SEARCH EXAMPLE ----------- */

        Map<String,Object> searchProps = new HashMap<>();

        searchProps.put("instrumentType","FIDDLE");
        searchProps.put("brand","Yamaha");

        InstrumentSpec searchSpec = new InstrumentSpec(searchProps);

        List<Instrument> results = inventory.search(searchSpec);

        for(Instrument instrument : results){

            System.out.println("Instrument Found:");
            System.out.println("Serial Number: " + instrument.getSerialNumber());
            System.out.println("Price: " + instrument.getPrice());

            for(String key : instrument.getSpec().getProperties().keySet()){
                System.out.println(
                    key + " : " +
                    instrument.getSpec().getProperty(key)
                );
            }

            System.out.println("----------------------------");
        }
    }


    /* ----------- FILE LOADER ----------- */

    private static void loadInventoryFromFile(String fileName, Inventory inventory){

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){

            String line;

            while((line = br.readLine()) != null){

                line = line.trim();

                if(line.isEmpty()) continue;


                /* -------- MANDOLIN -------- */

                if(line.equals("MANDOLIN")){

                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();

                    while(true){

                        String serial = br.readLine();

                        if(serial == null || serial.trim().isEmpty())
                            break;

                        double price = Double.parseDouble(br.readLine().trim());
                        String brand = br.readLine().trim();
                        String model = br.readLine().trim();
                        String topWood = br.readLine().trim();
                        String backWood = br.readLine().trim();
                        String type = br.readLine().trim();
                        String style = br.readLine().trim();

                        Map<String,Object> props = new HashMap<>();

                        props.put("instrumentType","MANDOLIN");
                        props.put("brand",brand);
                        props.put("modelNumber",model);
                        props.put("topWood",topWood);
                        props.put("backWood",backWood);
                        props.put("type",type);
                        props.put("style",style);

                        inventory.addInstrument(serial,price,new InstrumentSpec(props));

                        System.out.println("Added: " + serial);

                        br.readLine();
                    }
                }


                /* -------- GUITAR -------- */

                if(line.equals("GUITAR")){

                    while(true){

                        String serial = br.readLine();

                        if(serial == null || serial.trim().isEmpty())
                            break;

                        double price = Double.parseDouble(br.readLine().trim());
                        String brand = br.readLine().trim();
                        String model = br.readLine().trim();
                        String topWood = br.readLine().trim();
                        String backWood = br.readLine().trim();
                        String type = br.readLine().trim();
                        int strings = Integer.parseInt(br.readLine().trim());

                        Map<String,Object> props = new HashMap<>();

                        props.put("instrumentType","GUITAR");
                        props.put("brand",brand);
                        props.put("modelNumber",model);
                        props.put("topWood",topWood);
                        props.put("backWood",backWood);
                        props.put("type",type);
                        props.put("numStrings",strings);

                        inventory.addInstrument(serial,price,new InstrumentSpec(props));

                        System.out.println("Added: " + serial);

                        br.readLine();
                    }
                }


                /* -------- BANJO -------- */

                if(line.startsWith("serialNumber: BNJ")){

                    String serial = line.split(":")[1].trim();
                    double price = Double.parseDouble(br.readLine().split(":")[1].trim());
                    String brand = br.readLine().split(":")[1].trim();
                    String model = br.readLine().split(":")[1].trim();
                    String backWood = br.readLine().split(":")[1].trim();
                    String resonator = br.readLine().split(":")[1].trim();
                    int strings = Integer.parseInt(br.readLine().split(":")[1].trim());
                    String drum = br.readLine().split(":")[1].trim();

                    Map<String,Object> props = new HashMap<>();

                    props.put("instrumentType","BANJO");
                    props.put("brand",brand);
                    props.put("modelNumber",model);
                    props.put("backWood",backWood);
                    props.put("resonatorType",resonator);
                    props.put("numStrings",strings);
                    props.put("drumHeadMaterial",drum);

                    inventory.addInstrument(serial,price,new InstrumentSpec(props));

                    System.out.println("Added: " + serial);
                }


                /* -------- DOBRO -------- */

                if(line.startsWith("serialNumber: DBR")){

                    String serial = line.split(":")[1].trim();
                    double price = Double.parseDouble(br.readLine().split(":")[1].trim());
                    String brand = br.readLine().split(":")[1].trim();
                    String model = br.readLine().split(":")[1].trim();
                    String topWood = br.readLine().split(":")[1].trim();
                    String backWood = br.readLine().split(":")[1].trim();
                    String resonator = br.readLine().split(":")[1].trim();
                    int strings = Integer.parseInt(br.readLine().split(":")[1].trim());
                    String drum = br.readLine().split(":")[1].trim();

                    Map<String,Object> props = new HashMap<>();

                    props.put("instrumentType","DOBRO");
                    props.put("brand",brand);
                    props.put("modelNumber",model);
                    props.put("topWood",topWood);
                    props.put("backWood",backWood);
                    props.put("resonatorType",resonator);
                    props.put("numStrings",strings);
                    props.put("drumHeadMaterial",drum);

                    inventory.addInstrument(serial,price,new InstrumentSpec(props));

                    System.out.println("Added: " + serial);
                }


                /* -------- FIDDLE -------- */

                if(line.startsWith("serialNumber: FDL")){

                    String serial = line.split(":")[1].trim();
                    double price = Double.parseDouble(br.readLine().split(":")[1].trim());
                    String brand = br.readLine().split(":")[1].trim();
                    String model = br.readLine().split(":")[1].trim();
                    String topWood = br.readLine().split(":")[1].trim();
                    String backWood = br.readLine().split(":")[1].trim();
                    int strings = Integer.parseInt(br.readLine().split(":")[1].trim());
                    boolean electric = Boolean.parseBoolean(br.readLine().split(":")[1].trim());

                    Map<String,Object> props = new HashMap<>();

                    props.put("instrumentType","FIDDLE");
                    props.put("brand",brand);
                    props.put("modelNumber",model);
                    props.put("topWood",topWood);
                    props.put("backWood",backWood);
                    props.put("numStrings",strings);
                    props.put("isElectric",electric);

                    inventory.addInstrument(serial,price,new InstrumentSpec(props));

                    System.out.println("Added: " + serial);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}