package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Utility {
	
	public static Object FetchPropertyvalue(String key) throws Exception
	{
		FileInputStream fis=new FileInputStream("./Config/config.properties");
		Properties prop= new Properties();
		prop.load(fis);
		return prop.get(key);
	}

}
