/**
 * 
 */
package theme.folio;

import interf.eleGetter.getHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Lianxin
 *
 */
public class gfolioHeader implements getHeader{

		public WebDriver driver;
		public gfolioHeader(WebDriver driver) {
			this.driver = driver;
		}
		@Override
		public WebElement getHotelName() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public WebElement getHotelLogo() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public WebElement getPhoneNumber() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public WebElement getSocialArea() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public WebElement getHeaderSection() {
			// TODO Auto-generated method stub
			return null;
		}
		/* (non-Javadoc)
		 * @see interf.eleGetter.getHeader#getHotelLogoAndHotelName()
		 */
		@Override
		public WebElement getHotelLogoAndHotelName() {
			// TODO Auto-generated method stub
			return null;
		}


}
