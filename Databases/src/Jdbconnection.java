import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.ibatis.jdbc.ScriptRunner;

/**
 * 
 */

/**
 * @author Naduni
 *
 */
public class Jdbconnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean dbstatus = false;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/naduni", "naduni", "Redberry*7");
			System.out.print("Database is connected !");

			ResultSet resultSet = conn.getMetaData().getCatalogs();

			while (resultSet.next()) {

				String databaseName = resultSet.getString(1);

				if (databaseName.equalsIgnoreCase("cricketers_data")) {
					dbstatus = true;
				}
			}
			resultSet.close();
			if (dbstatus) {
				ScriptRunner sr = new ScriptRunner(conn);
				Reader reader = new BufferedReader(new FileReader("D:\\eclipse-workspace\\Databases\\script.sql"));
				sr.runScript(reader);
			}
			
			stmt = conn.createStatement();
		   // rs = stmt.executeQuery("SELECT * FROM cricketers_data");
		    
		    if (stmt.execute("SELECT * FROM cricketers_data")) {
		        rs = stmt.getResultSet();
		        while (rs.next())
		        {
		        System.out.println(rs.getString("First_Name"));
		        }
		    }
		    
            System.out.println("db is closing");
			conn.close();
		} catch (Exception e) {
			System.out.print("Do not connect to DB - Error:" + e);
		}
		// Statement query_ = conn.createStatement();
		// String qry = "SELECT*FROM EmployeeInfo";
		// ResultSet rs = query_.executeQuery(qry);
		// System.out.println(rs.toString());

	}

}
