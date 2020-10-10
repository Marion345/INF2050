import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public final class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String csvFile = "C:\\Users\\yanic\\OneDrive\\Bureau\\inf2050\\lab\\Lab\\INF2050\\MARY11229004\\src\\main\\java\\Resource.csv";

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("Country [date= " + line[0] + ", Heure= " + line[1] + " , Parc=" + line[2] + " , arrondissement=" + line[3] + " , description=" + line[4] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}