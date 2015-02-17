/**
 * 
 */
package theme.showcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.beg;
import interf.eleGetter.getFooter;

/**
 * @author xin.lian
 *
 */
public class gshowcaseFooter implements getFooter {

	public WebDriver driver;
	public gshowcaseFooter(WebDriver driver) {
		this.driver = driver;
	}
	

	/* (non-Javadoc)
	 * @see interf.eleGetter.getFooter#getfooterBG()
	 */
	@Override
	public WebElement getfooterBG() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//div[@class='footer-info']", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getFooter#getaddressTxt()
	 */
	@Override
	public WebElement getaddressTxt() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//*[@class='footer-info']/div[contains(@class, 'address')]", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getFooter#getmapTxt()
	 */
	@Override
	public WebElement getmapTxt() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//a[@class='icon-map']", "Cannot find sth");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getFooter#getfooterNavitxt()
	 */
	@Override
	public WebElement[] getfooterNavitxt() {
		// TODO Auto-generated method stub
		return beg.getElementList(driver, ".//div[contains(@class, 'footer-policy')]/a", "Cannot find footer links");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getFooter#getpowerByV()
	 */
	@Override
	public WebElement getpowerByV() {
		// TODO Auto-generated method stub
		return beg.getElement(driver, ".//a[@class='leonardo']", "Cannot find poweredByV");
	}

	/* (non-Javadoc)
	 * @see interf.eleGetter.getFooter#getbrandBadge()
	 */
	@Override
	public WebElement[] getbrandBadge() {
		// TODO Auto-generated method stub
		return beg.getElementList(driver, ".//div[contains(@class, 'rewards-logos')]/a", "Cannot find sth");
	}

}
