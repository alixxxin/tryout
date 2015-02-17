/**
 * 
 */
package theme.showcase;

import general.beg;
import interf.eleGetter.getHeader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author xin.lian
 *
 */
public class gshowcaseHeader implements getHeader {

	public WebDriver driver;
	public gshowcaseHeader(WebDriver driver) {
		this.driver = driver;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getHeader#getHotelName()
	 */
	@Override
	public WebElement getHotelName() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[@class='header']/div[@ class='left']/a/div", "Cannot find sth");
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getHeader#getHotelLogo()
	 */
	@Override
	public WebElement getHotelLogo() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[@class='header']/div[@ class='left']/a/img", "Cannot find sth");
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getHeader#getPhoneNumber()
	 */
	@Override
	public WebElement getPhoneNumber() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//span[@class='header-phone']", "Cannot find sth");
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getHeader#getSocialIcons()
	 */
	@Override
	public WebElement getSocialArea() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[@class='social']", "Cannot find sth");
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getHeader#getHeaderSection()
	 */
	@Override
	public WebElement getHeaderSection() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[@class='header']", "Cannot find sth");
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getHeader#getHotelLogoAndHotelName()
	 */
	@Override
	public WebElement getHotelLogoAndHotelName() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[@class='header']/div[@class='left']", "Cannot find sth");
	}

	
	
}
