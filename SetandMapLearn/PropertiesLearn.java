package SetandMapLearn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLearn {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		FileInputStream fls= new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace-new\\SampleGame\\src\\SetandMapLearn\\learn.properties"); 
		p.load(fls);
		
		System.out.println(p);
		String ss =p.getProperty("dosai");
		System.out.println(ss);
		p.setProperty("dosai", "35");
		
		FileOutputStream fil= new FileOutputStream("C:\\\\Users\\\\lenovo\\\\eclipse-workspace-new\\\\SampleGame\\\\src\\\\SetandMapLearn\\\\learn.properties");
		p.store(fil, "New Price");
		System.out.println(p);
	}

}
