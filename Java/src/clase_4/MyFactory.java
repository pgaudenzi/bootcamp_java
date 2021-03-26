package clase_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MyFactory {

    public static Object getInstance (String objName) throws Exception {
        String propertiesFile = "MyFactory.properties";
        String instanceName = getPropertyValue(objName, propertiesFile);

        return Class.forName(instanceName).newInstance();
    }

    public static String getPropertyValue (String propertyName, String propertiesFile) {
        Properties p;
        String property = "";
        try {
            FileReader reader = new FileReader(propertiesFile);
            p = new Properties();
            p.load(reader);
            property = p.getProperty(propertyName);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return property;
    }
}
