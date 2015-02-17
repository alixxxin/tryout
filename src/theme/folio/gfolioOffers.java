/**
 * 
 */
package theme.folio;

import interf.eleGetter.getOffers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Lianxin
 *
 */
public class gfolioOffers implements getOffers{

	public WebDriver driver;
	public gfolioOffers(WebDriver driver) {
		this.driver = driver;
	}
	@Override
	public WebElement[] getGroupStoryTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getTabBarUnderline() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement[] getOfferName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement[] getOfferDetail() {
		// TODO Auto-generated method stub
		return null;
	}

}
