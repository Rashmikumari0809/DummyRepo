package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportGen implements ITestListener{
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports report;
	String path;
	String reportname;
	String documentTitle;
	//Theme theme;

	/*public ExtentReportGen(String Path,String Reportname,String DocumentTitle)
	{
		path=Path;
		reportname=Reportname;
		documentTitle= DocumentTitle;
		//theme=Theme;
	}*/

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());


	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed");

		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,result.getName()+"Test Case Passed 1");

		}

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,result.getName()+" Test Case Failed ");
			test.log(Status.FAIL,result.getThrowable());
		}




	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped");
		if(result.getStatus()==ITestResult.SKIP)
		{
			test=report.createTest(result.getName());
			test.log(Status.SKIP,result.getName()+"Test Case skipped ");
			test.log(Status.SKIP,result.getThrowable());
		}


	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		reporter=new ExtentHtmlReporter("./test-output1/report1.html");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("ExtenthtmlReport Test");
		reporter.config().setReportName("testing world test");
		
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Host", "Local");
		report.setSystemInfo("Tester", "Rashmi");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Driver", "Chrome");


	}

	public void onFinish(ITestContext context) {
		System.out.println("Inside Flush");
		report.flush();


	}

}
