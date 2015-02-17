/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getTextOnlyPage;

/**
 * @author xin.lian
 *
 */
public class gshowcaseTextOnlyPage implements getTextOnlyPage {

	public WebDriver driver;
	public gshowcaseTextOnlyPage(WebDriver driver) {
		this.driver = driver;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getTextOnlyPage#getText()
	 */
	@Override
	public WebElement getTexts() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[@class='content-text']/p", " Text in txt only page");
	}

}
