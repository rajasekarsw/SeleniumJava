package Listeners;

import Base.BaseClass;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends BaseClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        extentTest=extentReports.createTest(result.getMethod().getMethodName());
        extentTest.log(Status.PASS,result.getMethod().getMethodName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest=extentReports.createTest(result.getMethod().getMethodName());
        extentTest.log(Status.FAIL, result.getThrowable());

    }

    @Override
    public void onTestSkipped(ITestResult result) {

        extentTest=extentReports.createTest(result.getMethod().getMethodName());
        extentTest.log(Status.SKIP, result.getMethod().getMethodName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
