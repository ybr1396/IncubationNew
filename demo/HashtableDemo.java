package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HashtableDemo {

	public static void main(String[] args) throws IOException {
		
		Properties pr = new Properties();
		FileInputStream fis =  new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\Rough\\src\\demo\\menu.properties");
		pr.load(fis);
		
		//System.out.println(pr.getProperty("YBM"));
		
		pr.setProperty("Tranzking", "1750");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\eclipse-workspace\\Rough\\src\\demo\\menu.properties");

		pr.store(fos, "Updated Price");
		
		
	}

	
}
