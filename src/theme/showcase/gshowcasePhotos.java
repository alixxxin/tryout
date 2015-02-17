/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getPhotos;

/**
 * @author xin.lian
 *
 */
public class gshowcasePhotos implements getPhotos {

	public WebDriver driver;
	public gshowcasePhotos(	WebDriver driver) {
		this.driver = driver;
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getPhotos#getPhotosViewer()
	 */
	@Override
	public WebElement getPhotosViewer() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, "//div[@class='vfml-media-player']", " MediaViewer");
	}

}
