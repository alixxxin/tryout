/**
 * 
 */
package interf.eleGetter;

import org.openqa.selenium.WebElement;

/**
 * @author Lianxin
 *
 */
public interface getNavi {

	// get to the <a>
	public WebElement [] getAllNaviTabsLink();
	public WebElement [] getAllNaviTabs();
	public WebElement getActiveTab();
	public WebElement getNaviSection();
	
	public WebElement getARoom();
	public WebElement getAOffer();
	public WebElement getAFeatureS();
	public WebElement getATextOnlyP();
	public WebElement getAReview();
	public WebElement getALocation();
	
}
