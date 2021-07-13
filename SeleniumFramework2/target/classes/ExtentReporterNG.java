/**
 * 
 */
package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/**
 * @author Naduni
 *
 */
public class ExtentReporterNG {
	 static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		String path_ = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter report_ = new ExtentSparkReporter(path_);
		report_.config().setReportName("web automation results");
		report_.config().setDocumentTitle("test results");
		
		extent = new ExtentReports();
		extent.attachReporter(report_);
		extent.setSystemInfo("Tester", "Naduni");
		return extent;
	}
}
