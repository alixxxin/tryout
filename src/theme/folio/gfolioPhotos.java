/**
 * 
 */
package theme.folio;

import interf.eleGetter.getPhotos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Lianxin
 *
 */
public class gfolioPhotos implements getPhotos{

	public WebDriver driver;
	public gfolioPhotos(WebDriver driver) {
		this.driver = driver;
	}
	@Override
	public WebElement getPhotosViewer() {
		// TODO Auto-generated method stub
		return null;
	}

}
