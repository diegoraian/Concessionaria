package dao;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadFileProperty {

	public ReadFileProperty(String fileName, String[] fileProperties) {
		readProperties( fileName, fileProperties);
	}
	public Map<?,?> readProperties(String fileName, String[] fileProperties) {
		
		Map<String,String> map = new HashMap<String,String>();
		try{
			Properties prop = new Properties(); 
			InputStream stream = getClass().getClassLoader().getResourceAsStream(fileName);
			
			if(stream != null){
				prop.load(stream);
			}else{
				throw new FileNotFoundException("The file" + fileName + "wasnt found");
			}
			
			for (String property : fileProperties) {
				map.put(property, prop.getProperty(property));
			}
		}catch(Exception ae){
			
		}
		return null;
	}
}
