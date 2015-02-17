/**
 * 
 */
package theme.folio;

import general.beg;
import interf.eleGetter.getBookingWidget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Lianxin
 *
 */
public class gfolioBookingWidget implements getBookingWidget{

	public WebDriver driver;
	public gfolioBookingWidget(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public WebElement getCheckRatesBtn() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[@class='booking-widget']/div/form/div[2]/input", "Cannot find Check Rate Btn");
	}
	@Override
	public WebElement getCheckInArrow() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getCheckOutArrow() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getAdultDropDown() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getChildrenDropDown() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getRooms() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getDimension() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getBookingWidgetSection() {
		// TODO Auto-generated method stub
		return null;
	}

}
