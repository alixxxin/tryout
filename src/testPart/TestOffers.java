package testPart;

import general.colorManager;
import interf.eleGetter.getWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOffers {

	
	@Test(groups = {"landing"}, priority = 1)
	public void testOffersLanding(){
		if (TestCommonParts.website.gnavi().getAOffer() == null){
			Assert.fail("There's no offer page on the website");
		}
		TestCommonParts.driver.get(TestCommonParts.website.gnavi().getAOffer().getAttribute("href"));
	}
	
	@Test(dependsOnMethods = "testOffersLanding")
	public void testOfferGroupStoryTabBarUnder(){
		Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.goffers().getTabBarUnderline().getCssValue(
				TestCommonParts.website.getdata().doffers().tabBarUnderlineColor()[1])),
				"");//TestCommonParts.website.getdata().doffers().tabBarUnderlineColor()[0]);
	}
	
	@Test(dependsOnMethods = "testOffersLanding")
	public void testOfferGroupStoryTitle(){
		WebElement el = TestCommonParts.website.goffers().getGroupStoryTitle()[0];
		System.out.println(el.getText());
		Assert.assertEquals(colorManager.colorIdenti(el.getCssValue(TestCommonParts.website.getdata().doffers().groupStoryTitleColor()[1])),
				"#111111");//TestCommonParts.website.getdata().doffers().groupStoryTitleColor()[0]);
		Assert.assertEquals(el.getCssValue(TestCommonParts.website.getdata().doffers().groupStoryTitleSize()[1]),
				"13px");//TestCommonParts.website.getdata().doffers().groupStoryTitleSize()[0]);
		Assert.assertEquals(el.getCssValue(TestCommonParts.website.getdata().doffers().groupStoryTitleUppercase()[1]),
				TestCommonParts.website.getdata().doffers().groupStoryTitleUppercase()[0]);
		
	}
	

	@Test(dependsOnMethods = "testOffersLanding")
	public void testOfferName(){
		Assert.assertEquals(TestCommonParts.website.goffers().getOfferName()[0].getCssValue(TestCommonParts.website.getdata().doffers().offerNameSize()[1]),
				"24px");//TestCommonParts.website.getdata().doffers().offerNameSize()[0]);
		Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.goffers().getOfferName()[0].getCssValue(TestCommonParts.website.getdata().doffers().offerNameColor()[1])), 
				"#111111");//TestCommonParts.website.getdata().doffers().offerNameColor()[0]);

	}
	
//	@Test(dependsOnMethods = "testOffersLanding")
//	public void testOfferDetail(){
//		Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.goffers().getOfferDetail()[0].getCssValue(TestCommonParts.website.getdata().doffers().offerDetailColor()[1])),
//				"#111111");//TestCommonParts.website.getdata().doffers().offerDetailColor()[0]);
//		Assert.assertEquals(TestCommonParts.website.goffers().getOfferDetail()[0].getCssValue(TestCommonParts.website.getdata().doffers().offerDetailSize()[1]),
//				"13px");//TestCommonParts.website.getdata().doffers().offerDetailSize()[0]);
//
//	}
}
