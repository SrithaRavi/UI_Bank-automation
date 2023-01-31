package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class propertiesReader {

	public static String property_file_reader(String file_name, String key) {
		String file_location = "./datas/" + file_name + ".properties";
		String value = "";
		try {
			FileInputStream file = new FileInputStream(file_location);
			Properties property = new Properties();
			property.load(file);
			value = property.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

}
