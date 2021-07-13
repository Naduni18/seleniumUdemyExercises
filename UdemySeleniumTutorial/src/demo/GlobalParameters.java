/**
 * 
 */
package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Naduni
 *
 */
public class GlobalParameters {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String currentDirectory = System.getProperty("user.dir");
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(currentDirectory+"\\data.properties");
	     prop.load(file);
	     System.out.println(prop.getProperty("url"));
	     prop.setProperty("url", "https://www.udemy.com/course/selenium-real-time-examplesinterview-questions");
	 System.out.println(prop.getProperty("browser"));
	 System.out.println(prop.getProperty("url"));
	 FileOutputStream fileout = new FileOutputStream(currentDirectory+"\\data.properties");
	 prop.store(fileout,null);
	}

}
