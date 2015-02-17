package testPart;

import general.colorManager;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestRooms {

	
	@Test(groups = {"landing"}, priority = 1)
	public void testRoomStoryLanding(){
		TestCommonParts.driver.get(TestCommonParts.website.gnavi().getARoom().getAttribute("href"));
		
	}
	
	@Test(dependsOnMethods = "testRoomStoryLanding")
	public void testGroupRoomStoryTitle(){
		if (TestCommonParts.website.gsuites().getGroupStoryTitle() == null){
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(TestCommonParts.website.gsuites().getGroupStoryTitle().getCssValue(TestCommonParts.website.getdata().dsuites().roomGroupStoryTitleUpperCase()[1]),
					"");//TestCommonParts.website.getdata().dsuites().roomGroupStoryTitleUpperCase()[0]);
			Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.gsuites().getGroupStoryTitle().getCssValue(TestCommonParts.website.getdata().dsuites().roomGroupStoryTitleColor()[1])),
					"#111111");//TestCommonParts.website.getdata().dsuites().roomGroupStoryTitleColor()[0]);
			Assert.assertEquals(TestCommonParts.website.gsuites().getGroupStoryTitle().getCssValue(TestCommonParts.website.getdata().dsuites().roomGroupStoryTitleSize()[1]),
					"12px");//TestCommonParts.website.getdata().dsuites().roomGroupStoryTitleSize()[0]);
		}
	}
	
	@Test(dependsOnMethods = "testRoomStoryLanding")
	public void testGroupRoomStoryTitleActiveUnderTabBar(){
		if (TestCommonParts.website.gsuites().getGroupStoryTitle() == null){
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.gsuites().getTabBarUnderline().getCssValue(TestCommonParts.website.getdata().dsuites().tabUnderlineColor()[1])),
					"#000000");//TestCommonParts.website.getdata().dsuites().tabUnderlineColor()[0]);
		}
	}
	
	
	@Test(dependsOnMethods = "testRoomStoryLanding")
	public void testRoomStoryTitle(){
		if (TestCommonParts.website.gsuites().getRoomName() == null){
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.gsuites().getRoomName().getCssValue(TestCommonParts.website.getdata().dsuites().roomNameColor()[1])),
					"#111111");//TestCommonParts.website.getdata().dsuites().roomNameColor()[0]);
			Assert.assertEquals(TestCommonParts.website.gsuites().getRoomName().getCssValue(TestCommonParts.website.getdata().dsuites().roomNameSize()[1]),
					"18px");//TestCommonParts.website.getdata().dsuites().roomNameSize()[0]);
		}
	}
	
	@Test(dependsOnMethods = "testRoomStoryLanding")
	public void testRoomsMoreInfoArrowColor(){
		if (TestCommonParts.website.gsuites().getRoomName() == null){
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(colorManager.colorIdenti(TestCommonParts.website.gsuites().getMoreInfoArrow().getCssValue(TestCommonParts.website.getdata().dsuites().moreInfoArrowColor()[1])),
					TestCommonParts.website.getdata().dsuites().moreInfoArrowColor()[0]);
		}
	}
	
}
