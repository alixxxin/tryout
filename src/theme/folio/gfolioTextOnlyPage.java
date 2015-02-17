/**
 * 
 */
package theme.folio;

import interf.eleGetter.getTextOnlyPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Lianxin
 *
 */
public class gfolioTextOnlyPage implements getTextOnlyPage{

	public WebDriver driver;
	public gfolioTextOnlyPage(WebDriver driver) {
		this.driver = driver;
	}
	@Override
	public WebElement getTexts() {
		// TODO Auto-generated method stub
		return null;
	}


}
