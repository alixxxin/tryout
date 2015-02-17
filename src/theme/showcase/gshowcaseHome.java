/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getHome;

/**
 * @author xin.lian
 *
 */
public class gshowcaseHome implements getHome {

	public WebDriver driver;
	public gshowcaseHome(WebDriver driver) {
		this.driver = driver;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getHome#getBackground()
	 */
	@Override
	public WebElement getBackground() {
		// TODO Auto-generated method stub
		
		return beg.getElement(driver, "/html/body", "Cannot find body");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getHome#getBodyText()
	 */
	@Override
	public WebElement getBodyText() {
		// TODO Auto-generated method stub		
		return beg.getElement(driver, "//div[contains(@class, 'content-text')]", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getHome#getH1Text()
	 */
	@Override
	public WebElement getH1Text() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getHome#getViewer()
	 */
	@Override
	public WebElement getViewer() {//photo viewer by default on home page
		
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[contains(@class, 'vfml-gallery')]", "Cannot find sth");
	}

}
