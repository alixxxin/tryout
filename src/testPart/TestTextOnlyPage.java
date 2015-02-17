package testPart;

import general.colorManager;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTextOnlyPage {
	
	@Test(groups = {"landing"}, priority = 1)
	public void testLandingTxtOnlyPage(){
		TestCommonParts.driver.get(TestCommonParts.website.gnavi().getATextOnlyP().getAttribute("href"));
		System.out.println(TestCommonParts.website.gnavi().getATextOnlyP().getAttribute("href"));
		System.out.println(TestCommonParts.website.gtextOnlyPage().getTexts().getText());
//		WebElement [] temp = TestCommonParts.website.gnavi().getAllNaviTabsLink();
//		TestCommonParts.driver.get(temp[temp.length-2].getAttribute("href"));
	}
	
	
	@Test(dependsOnMethods="testLandingTxtOnlyPage")
	public void testTxtOnlyPageFontsize(){
//		Assert.assertEquals(TestCommonParts.website.gtextOnlyPage().getText().getCssValue(TestCommonParts.website.getdata().dtextOnlyPage().textSize()[1]),
//				TestCommonParts.website.getdata().dtextOnlyPage().textSize()[0]);
//		Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.gtextOnlyPage().getText().getCssValue(TestCommonParts.website.getdata().dtextOnlyPage().textColor()[1])),
//				TestCommonParts.website.getdata().dtextOnlyPage().textColor()[0]);
		System.out.println(TestCommonParts.website.gtextOnlyPage().getTexts().getText());
		System.out.println(TestCommonParts.website.gtextOnlyPage().getTexts().getText());
		Assert.assertEquals(TestCommonParts.website.gtextOnlyPage().getTexts().getCssValue(TestCommonParts.website.getdata().dtextOnlyPage().textColor()[1]), "rgba(17, 17, 17, 1)");
		Assert.assertEquals(TestCommonParts.website.gtextOnlyPage().getTexts().getCssValue(TestCommonParts.website.getdata().dtextOnlyPage().textSize()[1]),
				"13px");
	}
}
