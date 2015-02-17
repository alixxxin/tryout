/**
 * 
 */
package interf.eleGetter;

import org.openqa.selenium.WebElement;


/**
 * @author Lianxin
 *
 */
public interface getOffers {

	// If doesn't exist, return null
	public WebElement [] getGroupStoryTitle();
	public WebElement  getTabBarUnderline();
	public WebElement [] getOfferName();
	public WebElement [] getOfferDetail();
	
}
