/**
 * 
 */
package theme.folio;

import interf.eleGetter.getSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Lianxin
 *
 */
public class gfolioSuites implements getSuites{

	public WebDriver driver;
	public gfolioSuites(WebDriver driver) {
		this.driver = driver;
	}
	@Override
	public WebElement getGroupStoryTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getRoomName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getMoreInfoArrow() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WebElement getTabBarUnderline() {
		// TODO Auto-generated method stub
		return null;
	}

}
