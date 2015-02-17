package testPart;

import interf.eleGetter.getWebsite;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFeatureStoryPage {

	
	@Test(groups = {"landing"}, priority = 1)
	public void testFeatuerStoryLanding(){
		TestCommonParts.driver.get(TestCommonParts.website.gnavi().getAFeatureS().getAttribute("href"));;
	}
	
	@Test(dependsOnMethods = "testFeatuerStoryLanding")
	public void testViewerLoading(){
		Assert.assertTrue(TestCommonParts.website.gphotos().getPhotosViewer().isDisplayed() &&
				TestCommonParts.website.gphotos().getPhotosViewer().isEnabled());
	}
	
}
