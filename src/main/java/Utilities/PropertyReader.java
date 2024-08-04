package Utilities;

import java.io.*;
import java.util.Properties;

public class PropertyReader {

    public Properties properties;
    public String path;

    public PropertyReader(String path) {
        this.path = path;
        this.properties = new Properties();
    }

    public Properties setProperties() {
        try {
            InputStream inputStream = PropertyReader.class.getResourceAsStream("/" + path + ".properties");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public String getProperty(String value) {
        String key = System.getProperty(value);
        if (key == null || key.isBlank() || key.isEmpty() || key.equalsIgnoreCase("NA")) {
            key = setProperties().getProperty(value);
        }
        return key;
    }

    public static void main(String[] args) {
        PropertyReader reader = new PropertyReader("webElements/loginPageElements");
        System.out.println(reader.getProperty("firstName"));
    }
}
