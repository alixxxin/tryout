package testPart;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DotTestListener extends TestListenerAdapter {
  private int m_count = 0;
  static SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");

  @Override
  public void onTestFailure(ITestResult tr) {
    log("Failed " + tr.getName() + " for theme - " + TestCommonParts.theme + "for hotel - " + TestCommonParts.hotelType);
//    try{
//    	screenshot();
//    } catch (Exception e){}
  }
  
  
//  @Override
//  public void onTestFailure(ITestResult result)
//  {
//          Object currentClass = result.getInstance();
//          WebDriver webDriver = ((BaseTest) currentClass).getDriver();
//
//          if (webDriver != null)
//          {
//
//             File f = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
//
//             //etc.
//          }
//  }
  @Override
  public void onTestSkipped(ITestResult tr) {
    log("Skipped " + tr.getName() + " for theme - " + TestCommonParts.theme + "for hotel - " + TestCommonParts.hotelType);
  }
 
  @Override
  public void onTestSuccess(ITestResult tr) {
    log("Success " + tr.getName() + " for theme - " + TestCommonParts.theme + "for hotel - " + TestCommonParts.hotelType);
  }
 
  private void log(String string) {
	  try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("report.txt", true)))) {
		    out.println(string);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	  
    if (++m_count % 40 == 0) {
      System.out.println("");
    }
  }
  
  private void screenshot() throws AWTException, IOException{
		Calendar now = Calendar.getInstance();
        Robot robot = new Robot();
        BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(screenShot, "JPG", new File("d:\\"+formatter.format(now.getTime())+".jpg"));
        System.out.println(formatter.format(now.getTime()));
	
  }
}
