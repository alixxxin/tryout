/**
 * 
 */
package interf.themes;

import org.openqa.selenium.WebDriver;

import theme.showcase.gshowcaseBookingWidget;
import theme.showcase.gshowcaseFooter;
import theme.showcase.gshowcaseHeader;
import theme.showcase.gshowcaseHome;
import theme.showcase.gshowcaseLocation;
import theme.showcase.gshowcaseNavi;
import theme.showcase.gshowcaseOffers;
import theme.showcase.gshowcasePhotos;
import theme.showcase.gshowcaseReviews;
import theme.showcase.gshowcaseSuites;
import theme.showcase.gshowcaseTextOnlyPage;
import allBrands.bestWestern.bestWesternHotel;
import allBrands.comfortInn.comfortInnHotel;
import allBrands.courtyardByMarriott.courtyardByMarriottHotel;
import allBrands.hamptonInns.hamptonInnsHotel;
import allBrands.holidayInn.holidayInnHotel;
import allBrands.holidayInnExpress.holidayInnExpressHotel;
import allBrands.noBrand.noBrandHotel;
import allBrands.ramada.ramadaHotel;
import allBrands.staybridge.staybridgeHotel;
import interf.dataReq.dataWebsite;
import interf.eleGetter.getBookingWidget;
import interf.eleGetter.getFooter;
import interf.eleGetter.getHeader;
import interf.eleGetter.getHome;
import interf.eleGetter.getLocation;
import interf.eleGetter.getNavi;
import interf.eleGetter.getOffers;
import interf.eleGetter.getPhotos;
import interf.eleGetter.getReviews;
import interf.eleGetter.getSuites;
import interf.eleGetter.getTextOnlyPage;
import interf.eleGetter.getWebsite;

/**
 * @author Lianxin
 *
 */
public class showcase implements getWebsite{

	public dataWebsite dataguy;
	public String url;
	public WebDriver driver;
	public showcase(WebDriver driver, String url, String hotelType) {
		this.url = url;
		this.driver = driver;
		switch(hotelType){
		case "bestWestern":
			dataguy = new bestWesternHotel("showcase");
			break;
		case "comfortInn":
			dataguy = new comfortInnHotel("showcase");
			break;
		case "courtyardByMarriott":
			dataguy = new courtyardByMarriottHotel("showcase");
			break;
		case "hamptonInns":
			dataguy = new hamptonInnsHotel("showcase");
			break;
		case "holidayInn":
			dataguy = new holidayInnHotel("showcase");
			break;
		case "holidayInnExpress":
			dataguy = new holidayInnExpressHotel("showcase");
			break;
		case "ramada":
			dataguy = new ramadaHotel("showcase");
			break;
		case "staybridge":
			dataguy = new staybridgeHotel("showcase");
			break;
		default:
			dataguy = new noBrandHotel("showcase");
		}
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gheader()
	 */
	@Override
	public getHeader gheader() {
		// TODO Auto-generated method stub
		return new gshowcaseHeader(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gfooter()
	 */
	@Override
	public getFooter gfooter() {
		// TODO Auto-generated method stub
		return new gshowcaseFooter(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gnavi()
	 */
	@Override
	public getNavi gnavi() {
		// TODO Auto-generated method stub
		return new gshowcaseNavi(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gbookingwidget()
	 */
	@Override
	public getBookingWidget gbookingwidget() {
		// TODO Auto-generated method stub
		return new gshowcaseBookingWidget(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#ghome()
	 */
	@Override
	public getHome ghome() {
		// TODO Auto-generated method stub
		return new gshowcaseHome(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gphotos()
	 */
	@Override
	public getPhotos gphotos() {
		// TODO Auto-generated method stub
		return new gshowcasePhotos(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#goffers()
	 */
	@Override
	public getOffers goffers() {
		// TODO Auto-generated method stub
		return new gshowcaseOffers(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gsuites()
	 */
	@Override
	public getSuites gsuites() {
		// TODO Auto-generated method stub
		return new gshowcaseSuites(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#glocation()
	 */
	@Override
	public getLocation glocation() {
		// TODO Auto-generated method stub
		return new gshowcaseLocation(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#greviews()
	 */
	@Override
	public getReviews greviews() {
		// TODO Auto-generated method stub
		return new gshowcaseReviews(driver);
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gtextOnlyPage()
	 */
	@Override
	public getTextOnlyPage gtextOnlyPage() {
		// TODO Auto-generated method stub
		return new gshowcaseTextOnlyPage(driver);
	}
	
	@Override
	public dataWebsite getdata(){
		return this.dataguy;
	}

}
