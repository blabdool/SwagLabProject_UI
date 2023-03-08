package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public Properties prop;

    File file = new File("src/main/resources/configuration.properties");

      FileInputStream fis = new FileInputStream(file);

    public PropertyReader() throws IOException {
        prop = new Properties();
        prop.load(fis);
    }

    public String getSwagLabUrl(){
        return prop.getProperty("SwagLabUrl");
    }
    public String getUsername(){
        return prop.getProperty("username");
    }
    public String getPassword(){
        return prop.getProperty("password");
    }
    public String getFirstName(){
        return prop.getProperty("firstname");
    }
    public String getLastName(){
        return prop.getProperty("lastname");
    }
    public String getPostCode(){
        return prop.getProperty("postcode");
    }


}
