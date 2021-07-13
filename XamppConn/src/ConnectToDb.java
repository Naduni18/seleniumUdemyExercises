/**
 * 
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * @author Naduni
 *
 */
public class ConnectToDb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = null;
	            conn = DriverManager.getConnection("jdbc:mysql://localhost/naduni","naduni", "Redberry*7");
	            System.out.print("Database is connected !");
	            conn.close();
	        }
	        catch(Exception e) {
	            System.out.print("Do not connect to DB - Error:"+e);
	        }
	}

}
