///**
// * If you want sth, you must beg for it
// */
//package general;
//
//import java.util.ArrayList;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
///**
// * @author xin.lian
// *
// */
//public class beg {
//	
//	public static WebElement getElement(WebDriver driver, String xpath, String msg) {
//		try{
//			return driver.findElement(By.xpath(xpath));
//		} catch (Exception e){
//			System.out.println("Cannot find element"+msg);
//			return null;
//		}
//	}
//	
//	public static WebElement[] getElementList(WebDriver driver, String xpath, String msg) {
//		try{
//			return (WebElement[]) driver.findElements(By.xpath(xpath)).toArray();
//		} catch (Exception e){
//			System.out.println("Cannot find element" + msg);
//			return null;
//		}
//	}
//	
//	public static String findSEO(WebDriver driver) {
//		WebElement temp = null;
//		try{
//			temp = driver.findElement(By.xpath("//meta[@name='description']"));
//		}catch(Exception e){
//			System.out.println("Cannot find SEO on this website");
//			return null;
//		}
//		return (temp.getAttribute("content"));
//	}
//	
//	public static WebElement [] getAllTabs(WebDriver driver, String xpath, String viewerPath, String theme, String msg){
//		ArrayList<WebElement> temp = new ArrayList<>();
//		WebElement [] temp2 = null;
//		try {
//			temp2 = (WebElement[]) driver.findElements(By.xpath(xpath)).toArray();
//		} catch(Exception e){
//			System.out.println("xpath provided for all tabs in Navi is wrong");
//			return null;
//		}
//		for (WebElement el: temp2){
//			temp.add(el.findElement(By.xpath(xpath+"/a")));
//		}
//		
//		return (WebElement []) temp.toArray();
//	}
//	
//	public static String handleURL(String s){
//		s = s.trim();
//		if (!s.startsWith("http://")){
//			s = "http://"+s;
//		}
//		s.replace("?nocache", "");
//		if (!s.endsWith("/")) {
//			s = s + "/";
//		}
//		return s;
//	}
//	
//	public static boolean babyUrl(String base, String babe){
//		base = handleURL(base);
//		babe = handleURL(babe);
//		return babe.startsWith(base);
//	}
//	
//}



/**
 * If you want sth, you must beg for it
 */
package general;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author xin.lian
 *
 */
public class beg {
	
	public static WebElement getElement(WebDriver driver, String xpath, String msg) {
		try{
			return driver.findElement(By.xpath(xpath));
		} catch (Exception e){
			System.out.println("Cannot find element"+msg);
			return null;
		}
	}
	
	public static WebElement [] getElementList(WebDriver driver, String xpath, String msg) {
		Object[] temp = helper(driver, xpath, "abc");
		if (temp==null) return null;
		WebElement [] ret = new WebElement[temp.length];
		
		for (int i = 0; i<temp.length; i++){
			ret[i] = (WebElement)temp[i];
		}
		return ret;
	}
		
		
	private static Object[] helper(WebDriver driver, String xpath, String msg) {
		try{
			return  driver.findElements(By.xpath(xpath)).toArray();
		} catch (Exception e){
			System.out.println("Cannot find element" + msg);
			return null;
		}
	}
	
	
	
	public static String findSEO(WebDriver driver) {
		WebElement temp = null;
		try{
			temp = driver.findElement(By.xpath("//meta[@name='description']"));
		}catch(Exception e){
			System.out.println("Cannot find SEO on this website");
			return null;
		}
		return (temp.getAttribute("content"));
	}
	
	public static WebElement [] getAllTabs(WebDriver driver, String xpath, String viewerPath, String theme, String msg){
		ArrayList<WebElement> temp = new ArrayList<WebElement>();
		WebElement [] temp2 = null;
		try {
			temp2 = (WebElement[]) driver.findElements(By.xpath(xpath)).toArray();
		} catch(Exception e){
			System.out.println("xpath provided for all tabs in Navi is wrong");
			return null;
		}
		for (WebElement el: temp2){
			temp.add(el.findElement(By.xpath(xpath+"/a")));
		}
		
		return (WebElement []) temp.toArray();
	}
	
	public static String handleURL(String s){
		s = s.trim();
		if (!s.startsWith("http://")){
			s = "http://"+s;
		}
		s.replace("?nocache", "");
		if (!s.endsWith("/")) {
			s = s + "/";
		}
		return s;
	}
	
	public static boolean babyUrl(String base, String babe){
		base = handleURL(base);
		babe = handleURL(babe);
		return babe.startsWith(base);
	}
	
}
