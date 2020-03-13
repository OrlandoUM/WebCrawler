package webCrawler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	private static Properties prop = null;
	
	private PropertiesFile() {}
	
	public static Properties getInstance() {
		
		if(prop == null) {
			
			prop = new Properties();
			try {
				
				FileInputStream iS = new FileInputStream("C:\\Users\\orlan\\eclipse-workspace\\WebCrawler\\Cup.properties");
				
				try {
					prop.load(iS);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return prop;
		
	}
	
}