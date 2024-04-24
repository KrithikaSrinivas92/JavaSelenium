package data_driven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// copy file from ROM to RAM
		
				FileInputStream f = new FileInputStream("../Selenium/data.properties");
				
				//open property file
				
				Properties p = new Properties();
				
				p.setProperty("p1", "v1");
				FileOutputStream f1 = new FileOutputStream("../Selenium/data.properties");

				p.store(f1, "testdata");
				
	}

}
