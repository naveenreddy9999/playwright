package utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class EnvironmentReader {

   static Properties properties;
    static {
        try {
            properties = new Properties();
            InputStream inputStream = PropertyReader.class.getResourceAsStream("/prerequisites/prerequisites.properties");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(getProperty("AutomationType"));
    }
}
