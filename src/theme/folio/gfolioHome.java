/**
 * 
 */
package theme.folio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import interf.eleGetter.getHome;

/**
 * @author Lianxin
 *
 */
public class gfolioHome implements getHome{

	public WebDriver driver;
	public gfolioHome(WebDriver driver) {
		this.driver = driver;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getHome#getBackground()
	 */
	@Override
	public WebElement getBackground() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getHome#getBodyText()
	 */
	@Override
	public WebElement getBodyText() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getHome#getViewer()
	 */
	@Override
	public WebElement getViewer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getH1Text() {
		// TODO Auto-generated method stub
		return null;
	}


}
