
package Total_test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.drivers;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed: " + result.getName());
        System.out.println("Failure Reason: " + result.getThrowable());

        // Get the current WebDriver
        WebDriver driver = drivers.getDriver();

        if (driver == null) {
            System.out.println("Screenshot failed: Driver is null");
            return;
        }

        // Create timestamp for screenshot name
        String timestamp = new SimpleDateFormat(
                "yyyyMMdd_HHmmss").format(new Date());

        String fileName = result.getName() + "_" + timestamp + ".png";

        // Screenshot folder
        String folderPath = "screenshots";

        try {
            // Create folder if it does not exist
            Files.createDirectories(Paths.get(folderPath));

            // Capture screenshot
            File source = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            // Save screenshot
            File destination = new File(folderPath, "failure.png");

            Files.copy(source.toPath(), destination.toPath());

            System.out.println(
                    "Screenshot saved: " + destination.getAbsolutePath());

        } catch (IOException | org.openqa.selenium.WebDriverException e) {
            System.out.println("Unable to capture screenshot: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }
}
