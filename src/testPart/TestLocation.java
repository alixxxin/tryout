package testPart;

import general.colorManager;
import interf.eleGetter.getWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLocation {

	
	@Test(groups = {"landing"}, priority = 1)
	public void testLocationLanding(){
		TestCommonParts.driver.get(TestCommonParts.website.gnavi().getALocation().getAttribute("href"));
		System.out.println(TestCommonParts.website.gnavi().getALocation().getAttribute("href"));
//		WebElement [] temp = TestCommonParts.website.gnavi().getAllNaviTabsLink();
//		TestCommonParts.driver.get(temp[temp.length-1].getAttribute("href"));
	}
	
	@Test(dependsOnMethods = "testLocationLanding")
	public void testLocationPageHotelName(){
//		System.out.println(TestCommonParts.website.glocation().locationHotelName().getText());
		Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.glocation().locationHotelName().getCssValue(TestCommonParts.website.getdata().dlocation().hotelNameColor()[1])),
				"#111111");//TestCommonParts.website.getdata().dlocation().hotelNameColor()[0]);
		Assert.assertEquals(TestCommonParts.website.glocation().locationHotelName().getCssValue(TestCommonParts.website.getdata().dlocation().hotelNameSize()[1]),
				"14px");//TestCommonParts.website.getdata().dlocation().hotelNameSize()[0]);
	}
	
	@Test(dependsOnMethods = "testLocationLanding")
	public void testLocationPageEmail(){
		Assert.assertEquals(TestCommonParts.website.glocation().locationEmail().getCssValue(TestCommonParts.website.getdata().dlocation().emailSize()[1]),
				"13px");//TestCommonParts.website.getdata().dlocation().emailSize()[0]);
		Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.glocation().locationEmail().getCssValue(TestCommonParts.website.getdata().dlocation().emailColor()[1])),
				"#111111");//"#9D9D9D");//TestCommonParts.website.getdata().dlocation().emailColor()[0]);
	}
	
	@Test(dependsOnMethods = "testLocationLanding")
	public void testLocationPageaddress(){
//		System.out.println(TestCommonParts.website.glocation().locationAddress());
		Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.glocation().locationAddress().getCssValue(TestCommonParts.website.getdata().dlocation().addressColor()[1])),
				"#111111");//TestCommonParts.website.getdata().dlocation().addressColor()[0]);
		Assert.assertEquals(TestCommonParts.website.glocation().locationAddress().getCssValue(TestCommonParts.website.getdata().dlocation().addressSize()[1]),
				TestCommonParts.website.getdata().dlocation().addressSize()[0]);
	}
	

	
}
