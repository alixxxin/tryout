/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getLocation;

/**
 * @author xin.lian
 *
 */
public class gshowcaseLocation implements getLocation {

	public WebDriver driver;
	public gshowcaseLocation(WebDriver driver) {
		this.driver = driver;
	
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getLocation#locationAddress()
	 */
	@Override
	public WebElement locationAddress() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[@class='location']/div[2]", " address in location");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getLocation#locationHotelName()
	 */
	@Override
	public WebElement locationHotelName() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[@class='location']/div", " Hotel Name in location");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getLocation#locationEmail()
	 */
	@Override
	public WebElement locationEmail() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[contains(@class, 'contact-row contact-email')]", " email in location");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getLocation#locationViewer()
	 */
	@Override
	public WebElement locationViewer() {//location no viewer
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[@class='map-container']", " the Map");
	}

}
