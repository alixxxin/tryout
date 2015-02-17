/**
 * 
 */
package theme.showcase;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getNavi;

/**
 * @author xin.lian
 *
 */
public class gshowcaseNavi implements getNavi {
	public WebDriver driver;
	public gshowcaseNavi(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver(){
		return this.driver;
	}
	
	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getAllNaviTabs()
	 */
	@Override
	public WebElement[] getAllNaviTabs() {
		// TODO Auto-generated method stub
		return beg.getElementList(driver, "//ul[contains(@class, 'main-navigation')]/li", "Cannot find Tabs in Main Navi");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getAllNaviTabsLink()
	 */
	@Override
	public WebElement[] getAllNaviTabsLink() {
		// TODO Auto-generated method stub
		WebElement [] temp = getAllNaviTabs();
//		WebElement[] temp= Arrays.copyOf(tempold, tempold.length-1);
		
		
		WebElement [] ret = new WebElement [temp.length-2];
		String url = "//ul[contains(@class, 'main-navigation')]/li";
		for (int i=2; i<temp.length; i++){
			ret[i-2] = beg.getElement(driver, url+"["+i+"]/a", "Cannot find tablink");
//			System.out.println(ret[i-2].getAttribute("href"));
		}
		return ret;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getActiveTab()
	 */
	@Override
	public WebElement getActiveTab() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//ul[contains(@class, 'main-navigation')]/li[contains(@class, 'active')]/a", "Active tabs");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getNaviSection()
	 */
	@Override
	public WebElement getNaviSection() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//ul[contains(@class, 'main-navigation')]", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getARoom()
	 */
	@Override
	public WebElement getARoom() {
		// TODO Auto-generated method stub
		WebElement temp = null;
		WebElement [] thelist = this.getAllNaviTabs();
		String url = "//ul[contains(@class, 'main-navigation')]/li";
		for (int i=0; i<thelist.length; i++){
//			System.out.println(thelist[i].getAttribute("class"));
			if (thelist[i].getAttribute("class").contains("rooms")){
				temp = beg.getElement(driver, url+"["+(i+1)+"]/a", "tab link");
			}
		}
//		System.out.println(temp.getAttribute("href"));
		return temp;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getAOffer()
	 */
	@Override
	public WebElement getAOffer() {
		// TODO Auto-generated method stub
		WebElement temp = null;
		WebElement [] thelist = this.getAllNaviTabs();
		String url = "//ul[contains(@class, 'main-navigation')]/li";
		for (int i=0; i<thelist.length; i++){
			if (thelist[i].getAttribute("class").contains("offer")){
				temp = beg.getElement(driver, url+"["+(i+1)+"]/a", "tab link for offer");
				break;
			}
		}
		return temp;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getAFeatureS()
	 */
	@Override
	public WebElement getAFeatureS() {
		// TODO Auto-generated method stub
		WebElement temp = null;
		WebElement [] thelist = this.getAllNaviTabs();
		String url = "//ul[contains(@class, 'main-navigation')]/li";
		for (int i=0; i<thelist.length; i++){
			if (thelist[i].getAttribute("class").contains("feature")){
				temp = beg.getElement(driver, url+"["+(i+1)+"]/a", "tab link for feature story");
				break;
			}
			
		}
		return temp;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getATextOnlyP()
	 */
	@Override
	public WebElement getATextOnlyP() {
		// TODO Auto-generated method stub
		WebElement temp = null;
		WebElement [] thelist = this.getAllNaviTabs();
		String url = "//ul[contains(@class, 'main-navigation')]/li";
		for (int i=0; i<thelist.length; i++){
			if (thelist[i].getAttribute("class").contains("text")){
				temp = beg.getElement(driver, url+"["+(i+1)+"]/a", "tab link for offer");
				break;
			}
		}
//		System.out.println(temp.getAttribute("href"));
		return temp;
	}
		

	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getAReview()
	 */
	@Override
	public WebElement getAReview() {
		
		boolean found = false;
		WebElement temp = null;
		WebElement [] thelist = this.getAllNaviTabs();
		String url = "//ul[contains(@class, 'main-navigation')]/li";
		for (int i=0; i<thelist.length; i++){
			if (thelist[i].getAttribute("class").contains("reviews")){
				found = true;
				temp = beg.getElement(driver, url+"["+(i+1)+"]/a", "tab link for feature story");
				break;
			}
		}
//		System.out.println(temp.getAttribute("href"));
		return temp;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getNavi#getALocation()
	 */
	@Override
	public WebElement getALocation() {
		// TODO Auto-generated method stub
		WebElement temp = null;
		WebElement [] thelist = this.getAllNaviTabs();
		String url = "//ul[contains(@class, 'main-navigation')]/li";
		for (int i=0; i<thelist.length; i++){
			if (thelist[i].getAttribute("class").contains("location")){
				temp = beg.getElement(driver, url+"["+(i+1)+"]/a", " tab link for location");
				break;
			}
		}
//		System.out.println("location");
//		System.out.println(temp.getAttribute("href"));
//		System.out.println("location");
		return temp;
	}
	
	


}
