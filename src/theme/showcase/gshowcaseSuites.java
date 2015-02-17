/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getSuites;

/**
 * @author xin.lian
 *
 */
public class gshowcaseSuites implements getSuites {

	public WebDriver driver;
	public gshowcaseSuites(	WebDriver driver) {
		this.driver = driver;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getSuites#getGroupStoryTitle()
	 */
	@Override
	public WebElement getGroupStoryTitle() {
		// TODO Auto-generated method stub
		try {
			return beg.getElement(driver, "//a[@class='vfml-selected']", "Cannot find sth");
		} catch (Exception e){
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getSuites#getRoomName()
	 */
	@Override
	public WebElement getRoomName() {
		// TODO Auto-generated method stub
		try {
			return beg.getElement(driver, "//h3[@class='vfml-room-title']", "Cannot find sth"); //actually get a list
		}catch(Exception e){
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getSuites#getMoreInfoArrow()
	 */
	@Override
	public WebElement getMoreInfoArrow() {
		// TODO Auto-generated method stub
		try{
			return beg.getElement(driver, "//a[@class='vfml-room-toggle-btn']/span[2]", "Cannot find sth"); //acutally get a list 
		} catch(Exception e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getSuites#getTabBarUnderline()
	 */
	@Override
	public WebElement getTabBarUnderline() {
		// TODO Auto-generated method stub
		try{
			return beg.getElement(driver, ".//a[@class='vfml-selected']", "Cannot find sth");
		} catch(Exception e) {
			return null;
		}
	}

}
