package testPart;

import general.beg;
import general.colorManager;
import interf.eleGetter.getWebsite;
import interf.themes.centerclassic;
import interf.themes.classic;
import interf.themes.folio;
import interf.themes.showcase;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCommonParts {

	public static WebDriver driver;
	public static String url;
	public static getWebsite website;
	public static String theme;
	public static String hotelType;
	
	
	@BeforeSuite
	public void veforeSuite(){
		System.setProperty("webdriver.ie.driver", "C:\\Users\\xin.lian\\Downloads\\autom\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xin.lian\\Downloads\\autom\\chromedriver.exe");
	}
	
	@Parameters({ "browserType", "url", "theme", "hotelType" })
	@BeforeTest(alwaysRun = true)
	public void beforeClass(@Optional("Firefox") String browserType, String url, String theme, String hotelType) {
		this.theme = theme;
		this.hotelType = hotelType;
		
		switch (browserType){
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
		default:
			driver = new FirefoxDriver();
		}
		TestCommonParts.url = url;
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switch(theme){
		case ("showcase") :
			website = new showcase(driver, TestCommonParts.url, hotelType);
			break;
		case ("folio"):
			website = new folio(driver, TestCommonParts.url, hotelType);
			break;
		case("classic"):
			website = new classic(driver, TestCommonParts.url, hotelType);
			break;
		case("centerclassic"):
			website = new centerclassic(driver, TestCommonParts.url, hotelType);
		}
	}
	
	
	@AfterSuite
	public void afterSuite() {
		driver.close();
		driver.quit();
	}
	
	@Test(groups = {"header", "landing"} )
	public static void testFirstLanding(){
		Assert.assertEquals(beg.handleURL(driver.getCurrentUrl()), beg.handleURL(url));
		Assert.assertEquals(website.gheader().getHotelName().getAttribute(website.getdata().dheader().hotelNameClass()[1]),
				website.getdata().dheader().hotelNameClass()[0]);
	}
	
	@Test(groups = {"header"}, dependsOnMethods = "testFirstLanding" )
	public void testBG(){
		Assert.assertEquals(
				website.ghome().getBackground().getCssValue(website.getdata().dhome().backgroundbgImg()[1]),
				"url(\"http://www.nobrand04.client.qa-next.vizlly.com/bigscreen/generic/images/bkg.png\")");
		Assert.assertEquals(website.ghome().getBodyText().getCssValue(website.getdata().dhome().backgroundFontFamily()[1]),
				website.getdata().dhome().backgroundFontFamily()[0]);
	}
		
	@Test(groups = {"header"}, dependsOnMethods = "testFirstLanding"  )
	public void testHotelName(){
		Assert.assertEquals(website.gheader().getHotelName().getAttribute(website.getdata().dheader().hotelNameClass()[1]),
				website.getdata().dheader().hotelNameClass()[0]);
		Assert.assertEquals(website.gheader().getHotelName().getCssValue(website.getdata().dheader().hotelNameSize()[1]),
				website.getdata().dheader().hotelNameSize()[0]);
		Assert.assertEquals(colorManager.colorIdenti(website.gheader().getHotelName().getCssValue(website.getdata().dheader().hotelNameColor()[1])),
				website.getdata().dheader().hotelNameColor()[0]);
		Assert.assertEquals(website.gheader().getHotelName().getCssValue(website.getdata().dheader().hotelNameBold()[1]),
				"600");//website.getdata().dheader().hotelNameBold()[0]);
		Assert.assertEquals(website.gheader().getHotelName().getCssValue(website.getdata().dheader().hotelLogoAndHotelNameAlign()[1]),
				"none");//website.getdata().dheader().hotelLogoAndHotelNameAlign()[0]);
		
	}
	
	@Test(groups = {"header"}, dependsOnMethods = "testFirstLanding"  )
	public void testPhoneNumber(){
		Assert.assertEquals(website.gheader().getPhoneNumber().getCssValue(website.getdata().dheader().phoneNumAlign()[1]),
				website.getdata().dheader().phoneNumAlign()[0]);
		Assert.assertEquals(colorManager.colorIdenti(website.gheader().getPhoneNumber().getCssValue(website.getdata().dheader().phoneNumColor()[1])),
				"#111111");//website.getdata().dheader().phoneNumColor()[0]);
		Assert.assertEquals(website.gheader().getPhoneNumber().getCssValue(website.getdata().dheader().phoneNumSize()[1]),
				website.getdata().dheader().phoneNumSize()[0]);
		
	}
	
	@Test(groups = {"header"}, dependsOnMethods = "testFirstLanding"  )
	public void testSocialIcons(){
		Assert.assertEquals(website.gheader().getSocialArea().getCssValue(website.getdata().dheader().socialAlign()[1]), website.getdata().dheader().socialAlign()[0]);
	}
	
	@Test(groups = {"header"}, dependsOnMethods = "testFirstLanding"  )
	public void testHeaderBG(){
		Assert.assertEquals(website.gheader().getHeaderSection().getCssValue(website.getdata().dheader().headerBG()[1]),
				"transparent");//website.getdata().dheader().headerBG()[0]);
	}
	
	@Test(groups = {"header"}, dependsOnMethods = "testFirstLanding"  )
	public void testHeaderDimension(){
		Assert.assertEquals(website.gheader().getHeaderSection().getSize().getHeight(),
				150, 10);//Float.parseFloat(website.getdata().dheader().dimHeight()[0]), 10);
		Assert.assertEquals(website.gheader().getHeaderSection().getSize().getWidth(),
				Float.parseFloat(website.getdata().dheader().dimWidth()[0]), 10);
		
	}
	
	@Test()
	public void testBookingWidgetDefaultValue(){
		Assert.assertEquals(website.gbookingwidget().getAdultDropDown().getText(),
				website.getdata().dbookingwidget().AdultDropDownValue()[0]);
		Assert.assertEquals(website.gbookingwidget().getChildrenDropDown().getText(), 
				website.getdata().dbookingwidget().ChildrenDropDownValue()[0]);
		Assert.assertEquals(website.gbookingwidget().getRooms().getText(), 
				website.getdata().dbookingwidget().RoomsValue()[0]);
	}
	
	@Test()
	public void testBookingWidget(){
		Assert.assertEquals(colorManager.colorIdenti(website.gbookingwidget().getCheckInArrow().getCssValue(website.getdata().dbookingwidget().checkInColor()[1])), 
				website.getdata().dbookingwidget().checkInColor()[0]);
		Assert.assertEquals(colorManager.colorIdenti(website.gbookingwidget().getCheckOutArrow().getCssValue(website.getdata().dbookingwidget().checkOutColor()[1])), 
				website.getdata().dbookingwidget().checkOutColor()[0]);
	}
	
	@Test
	public void testBookingWidgetCHeckRateAlign(){
		Assert.assertEquals(website.gbookingwidget().getCheckRatesBtn().getCssValue(website.getdata().dbookingwidget().checkRateAlign()[1]),
				website.getdata().dbookingwidget().checkRateAlign()[0]);
	}
	
	@Test(groups = {"footer"}, dependsOnMethods = "testFirstLanding" )
	public void testFooterBg(){
		Assert.assertEquals(colorManager.colorIdenti(website.gfooter().getfooterBG().getCssValue(website.getdata().dfooter().footerBGColor()[1])),
				website.getdata().dfooter().footerBGColor()[0]);
		Assert.assertEquals(website.gfooter().getfooterBG().getSize().getHeight(), 117, 10);
				//Float.parseFloat(website.getdata().dfooter().footerBGHeight()[0]), 10);
		Assert.assertEquals(website.gfooter().getfooterBG().getSize().getWidth(),
				Float.parseFloat(website.getdata().dfooter().footerBGWidth()[0]), 10);
	}
	
	@Test(groups = {"footer"}, dependsOnMethods = "testFirstLanding" )
	public void testFooterAddressTxt(){
		Assert.assertEquals(website.gfooter().getaddressTxt().getCssValue(website.getdata().dfooter().addressSectionAlign()[1]),
				website.getdata().dfooter().addressSectionAlign()[0]);
		Assert.assertEquals(colorManager.colorIdenti(website.gfooter().getaddressTxt().getCssValue(website.getdata().dfooter().addressColor()[1])),
				website.getdata().dfooter().addressColor()[0]);
		Assert.assertEquals(website.gfooter().getaddressTxt().getCssValue(website.getdata().dfooter().addressSize()[1]),
				website.getdata().dfooter().addressSize()[0]);
		
	}
	
	@Test(groups = {"footer"}, dependsOnMethods = "testFirstLanding" )
	public void testFooterMap(){
		Assert.assertEquals(website.gfooter().getmapTxt().getCssValue(website.getdata().dfooter().mapTxtBold()[1]), "400");//website.getdata().dfooter().mapTxtBold()[0]);
		Assert.assertEquals(website.gfooter().getmapTxt().getCssValue(website.getdata().dfooter().mapTxtColor()[1]),
				"rgba(255, 255, 255, 1)");//website.getdata().dfooter().mapTxtColor()[0]);
		Assert.assertEquals(website.gfooter().getmapTxt().getCssValue(website.getdata().dfooter().mapTxtSize()[1]), website.getdata().dfooter().mapTxtSize()[0]);
		
	}
	
	@Test(groups = {"footer"}, dependsOnMethods = "testFirstLanding" )
	public void testPoweredbyVizlly(){
		Assert.assertEquals(website.gfooter().getpowerByV().getCssValue(website.getdata().dfooter().powerByVizllyAlign()[1]),
				website.getdata().dfooter().powerByVizllyAlign()[0]);
		Assert.assertEquals(colorManager.colorIdenti(website.gfooter().getpowerByV().getCssValue(website.getdata().dfooter().powerByVizllyTxtColor()[1])),
				"#9D9D9D");//website.getdata().dfooter().powerByVizllyTxtColor()[0]);
	}
	
	@Test(groups = {"footer"}, dependsOnMethods = "testFirstLanding" )
	public void testFotoerBadge(){
		if (website.getdata().dfooter().badges() == null){
			Assert.assertEquals(website.getdata().dfooter().badges(), null);
		} else {
			for (WebElement el:website.gfooter().getbrandBadge()){
				boolean temp = false;
				for (String s : website.getdata().dfooter().badges().get(website.getdata().dfooter().badges().keySet().toArray()[0])){
					temp = temp || el.getAttribute((String) website.getdata().dfooter().badges().keySet().toArray()[0]).contains(s);
				}
				Assert.assertTrue(temp);
			}
		}
	}
	
	@Test(groups = {"footer"}, dependsOnMethods = "testFirstLanding" )
	public void testFooterNaviPart(){
		
	}
	
	//xin testing
	@Test
	public void xin(){
		ArrayList<String> ret = new ArrayList<String>();
//		for (WebElement el:website.gnavi().getAllNaviTabs()){
//			System.out.println(el.getAttribute("class"));
//		}
//		System.out.println("====");
		for (WebElement el:website.gnavi().getAllNaviTabsLink()){
			ret.add(el.getAttribute("href"));
		}
		for(String s: ret){
			driver.get(s);
		}
		driver.get(url);
	}
	
}
