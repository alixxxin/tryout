/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getBookingWidget;

/**
 * @author xin.lian
 *
 */
public class gshowcaseBookingWidget implements getBookingWidget {

	public WebDriver driver;
	public gshowcaseBookingWidget(WebDriver driver) {
		this.driver = driver;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getBookingWidget#getBookingWidgetSection()
	 */
	@Override
	public WebElement getBookingWidgetSection() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[contains(@class,'content')]/div[contains(@class, 'booking')]", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getBookingWidget#getCheckRatesBtn()
	 */
	@Override
	public WebElement getCheckRatesBtn() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//input[@value='Check Rates']", "Check rate button");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getBookingWidget#getCheckInArrow()
	 */
	@Override
	public WebElement getCheckInArrow() {
		// TODO Auto-generated method stub
		return  beg.getElement(driver, ".//div[contains(@class, 'booking-widget-in')]/a", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getBookingWidget#getCheckOutArrow()
	 */
	@Override
	public WebElement getCheckOutArrow() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[contains(@class, 'booking-widget-out')]/a", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getBookingWidget#getAdultDropDown()
	 */
	@Override
	public WebElement getAdultDropDown() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[contains(@class, 'booking-widget-adults')]/select/option[1]", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getBookingWidget#getChildrenDropDown()
	 */
	@Override
	public WebElement getChildrenDropDown() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[contains(@class, 'booking-widget-children')]/select/option[1]", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getBookingWidget#getRooms()
	 */
	@Override
	public WebElement getRooms() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[contains(@class, 'booking-widget-room')]/select/option[1]", "rooms default area");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getBookingWidget#getDimension()
	 */
	@Override
	public WebElement getDimension() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[@class='booking-widget']", "booking Widget app");
	}

}
