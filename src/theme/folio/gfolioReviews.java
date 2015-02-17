/**
 * 
 */
package theme.folio;

import interf.eleGetter.getReviews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Lianxin
 *
 */
public class gfolioReviews implements getReviews{

	public WebDriver driver;
	public gfolioReviews(WebDriver driver) {
		this.driver = driver;
	}
	@Override
	public WebElement getTripAdvisorLogo() {
		// TODO Auto-generated method stub
		return null;
	}


}
