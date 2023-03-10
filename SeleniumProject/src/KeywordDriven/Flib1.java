package KeywordDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib1 {
	
	public String readPropertyData1(String prop1path, String key) throws IOException
	{
		FileInputStream fis1 = new FileInputStream(prop1path);
		Properties prop1 = new Properties();
		prop1.load(fis1);
		String value = prop1.getProperty(key);
		return value;
		
	}

}
