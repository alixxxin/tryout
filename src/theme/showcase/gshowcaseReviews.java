/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getReviews;

/**
 * @author xin.lian
 *
 */
public class gshowcaseReviews implements getReviews {

	public WebDriver driver;
	public gshowcaseReviews(WebDriver driver) {
		this.driver = driver;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getReviews#getTripAdvisorLogo()
	 */
	@Override
	public WebElement getTripAdvisorLogo() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//img[contains(@src, 'tripadvisor')]", "Cannot find sth");
	}

}
