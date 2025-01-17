package propertiesFileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class PropertiesPractice {

	public static void main(String[] args) throws Exception {

		File file=new File("dbConfig.properties");
		
		//Creating file
		if(!file.exists()) {
			file.createNewFile();
		}
//		System.out.println(file.exists());
		
		Properties p=new Properties();
		
		p.setProperty("url", "www.google.com");
		p.setProperty("username", "Srihari");
		p.setProperty("password", "Srihari@123");
		
		p.setProperty("url", "www.newFile.com");
		
		p.remove("url");
		p.put("url", "www.google.com");
		FileOutputStream fos=new FileOutputStream(file);
		
		p.store(fos, "My credentials for demo application");
		
		FileInputStream fis=new FileInputStream(file);
		p.load(fis);
		
		System.out.println(fis);
		
		//only keys
		Set<String> dataKeys=p.stringPropertyNames();
		System.out.println(dataKeys);
		
		
		//only values
		Collection<Object>  valuesList=p.values();
		System.out.println(valuesList);
		
		//to get single value
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("url2","www.facebook.com"));
		
		//reading key values using iterator
			for(Object key:p.keySet()) {
				System.out.println(key+"--->>>"+p.getProperty((String) key));
			}
		
	}

}
