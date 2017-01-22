package week3;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * Created by a on 22.01.17.
 */
public class WeatherMin {
    public static void main(String[] args) {
        testColdestHourInFile();
    }
    public static void coldestHourInFile(CSVParser parser) {
//    public static CSVRecord coldestHourInFile(CSVParser parser) {
        for (CSVRecord record : parser) {
            String colCountry = record.get("TimeEST");
//            String colCountry = record.get("TimeEST");
            System.out.println(colCountry);
        }
    }

    public static void testColdestHourInFile() {
        FileResource fr = new FileResource("./src/week3/nc_weather/2015/weather-2015-01-01.csv");
//        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        coldestHourInFile(parser);
    }
}