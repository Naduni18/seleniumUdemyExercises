/**
 * 
 */
package demo;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Naduni
 *
 */
public class TestCaseFile {
	public static void main(String[] args) throws IOException{
		Demo dem = new Demo();
		ArrayList<String> al = dem.getArow("Sheet2","buy");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		
	}
}
