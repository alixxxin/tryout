package testPart;

import interf.eleGetter.getWebsite;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReviews {

	
	
	@Test
	public void testLandingReview(){
		if(TestCommonParts.website.gnavi().getAReview() == null){
			Assert.fail("There's no review page on the website");
		} else {
			TestCommonParts.driver.get(TestCommonParts.website.gnavi().getAReview().getAttribute("href"));
//			String tripadvisor = TestCommonParts.website.getdata().dreviews().tripAdvisor()[0];
//			String fieldIwant = TestCommonParts.website.getdata().dreviews().tripAdvisor()[1];
//			String actualta = TestCommonParts.website.greviews().getTripAdvisorLogo().getAttribute(fieldIwant);
//			Assert.assertEquals(actualta, tripadvisor, "actual result -"+actualta);
			TestCommonParts.website.greviews().getTripAdvisorLogo();
		}
		
	}
	
}
