import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        loadInventoryFromFile("InstrumentsForPrototyping.txt", inventory);

        // Example search
        Map<String, Object> searchProperties = new HashMap<>();
        searchProperties.put("brand", "Fender");

        InstrumentSpec searchSpec = new InstrumentSpec(searchProperties);

        List<Instrument> results = inventory.search(searchSpec);

        for (Instrument instrument : results) {

            System.out.println("Found Instrument:");
            System.out.println("Serial Number: " + instrument.getSerialNumber());
            System.out.println("Price: " + instrument.getPrice());

            for (String key : instrument.getSpec().getProperties().keySet()) {
                System.out.println(key + " : " + instrument.getSpec().getProperty(key));
            }

            System.out.println("-------------------------");
        }
    }


    // TXT Loader inside Test class
    private static void loadInventoryFromFile(String fileName, Inventory inventory) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            Map<String, Object> properties = new HashMap<>();

            String serialNumber = null;
            double price = 0;

            while ((line = br.readLine()) != null) {

                line = line.trim();

                if (line.isEmpty()) continue;

                if (line.startsWith("serialNumber")) {
                    serialNumber = line.split(":")[1].trim();
                }

                else if (line.startsWith("price")) {
                    price = Double.parseDouble(line.split(":")[1].trim());
                }

                else if (line.contains(":")) {

                    String[] parts = line.split(":");

                    String key = parts[0].trim();
                    String value = parts[1].trim();

                    properties.put(key, value);
                }

                else if (!line.contains(":")) {
                    // serial numbers like GTR1002 etc
                    if (serialNumber != null) {

                        InstrumentSpec spec = new InstrumentSpec(properties);
                        inventory.addInstrument(serialNumber, price, spec);

                        properties = new HashMap<>();
                    }

                    serialNumber = line;
                }
            }

            if (serialNumber != null) {
                InstrumentSpec spec = new InstrumentSpec(properties);
                inventory.addInstrument(serialNumber, price, spec);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}