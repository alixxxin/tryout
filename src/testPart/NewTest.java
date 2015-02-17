package testPart;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebElement [] temp = TestCommonParts.website.gnavi().getAllNaviTabsLink();
	  for (WebElement el:temp){
		  System.out.println(el.getAttribute("href"));
	  }
  }
}
