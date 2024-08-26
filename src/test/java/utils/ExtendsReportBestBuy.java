package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportBestBuy {
	
	
public static ExtentReports getReport() {
		
	

		String path="C:\\Users\\HP\\eclipse-workspace\\BestBuyProject\\report\\BestBuyReport.html";
		
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("DemoWebShop Reporter");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
	}

}
