/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getOffers;

/**
 * @author xin.lian
 *
 */
public class gshowcaseOffers implements getOffers {

	public WebDriver driver;
	public gshowcaseOffers(WebDriver driver) {
		this.driver = driver;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getOffers#getGroupStoryTitle()
	 */
	@Override
	public WebElement[] getGroupStoryTitle() {
		// TODO Auto-generated method stub
		try{
			String xpath = "//ul[@class='vfml-tabbar-list']/li";
			WebElement [] temp;
			try {
				temp = beg.getElementList(driver, xpath, "Group Offers tabs");
			} catch (Exception e) { return null;}
			
			if (temp == null) return null;
			WebElement [] ret = new WebElement [temp.length];
			for (int i=1; i<temp.length; i++){
				ret[i-1] = beg.getElement(driver, xpath+"["+i+"]/a/span", "Cannot find tab bar text");
			}
			return ret;
		} catch (Exception e){
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getOffers#getTabBarUnderline()
	 */
	@Override
	public WebElement getTabBarUnderline() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//a[@class='vfml-selected']", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getOffers#getOfferName()
	 */
	@Override
	public WebElement[] getOfferName() {
		// TODO Auto-generated method stub
		return beg.getElementList(driver, "//div[@class='vfml-so-offer-details-caption']", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getOffers#getOfferDetail()
	 */
	@Override
	public WebElement[] getOfferDetail() {
		// TODO Auto-generated method stub
		return beg.getElementList(driver, "//div[@class='vfml-so-offer-details-description-long']/p", "Cannot find sth");
	}

}
