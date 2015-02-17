/**
 * 
 */
package interf.themes;

import org.openqa.selenium.WebDriver;

import allBrands.bestWestern.bestWesternHotel;
import allBrands.comfortInn.comfortInnHotel;
import allBrands.courtyardByMarriott.courtyardByMarriottHotel;
import allBrands.hamptonInns.hamptonInnsHotel;
import allBrands.holidayInn.holidayInnHotel;
import allBrands.holidayInnExpress.holidayInnExpressHotel;
import allBrands.noBrand.noBrandHotel;
import allBrands.ramada.ramadaHotel;
import allBrands.staybridge.staybridgeHotel;
import general.beg;
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
public class folio implements getWebsite{

	public dataWebsite dataguy;
	public String url;
	public WebDriver driver;
	public folio(WebDriver driver, String url, String hotelType) {
		this.url = url;
		this.driver = driver;
		switch(hotelType){
		case "bestWestern":
			dataguy = new bestWesternHotel("folio");
			break;
		case "comfortInn":
			dataguy = new comfortInnHotel("folio");
			break;
		case "courtyardByMarriott":
			dataguy = new courtyardByMarriottHotel("folio");
			break;
		case "hamptonInns":
			dataguy = new hamptonInnsHotel("folio");
			break;
		case "holidayInn":
			dataguy = new holidayInnHotel("folio");
			break;
		case "holidayInnExpress":
			dataguy = new holidayInnExpressHotel("folio");
			break;
		case "ramada":
			dataguy = new ramadaHotel("folio");
			break;
		case "staybridge":
			dataguy = new staybridgeHotel("folio");
			break;
		default:
			dataguy = new noBrandHotel("folio");
		}
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gheader()
	 */
	@Override
	public getHeader gheader() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gfooter()
	 */
	@Override
	public getFooter gfooter() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gnavi()
	 */
	@Override
	public getNavi gnavi() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gbookingwidget()
	 */
	@Override
	public getBookingWidget gbookingwidget() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#ghome()
	 */
	@Override
	public getHome ghome() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gphotos()
	 */
	@Override
	public getPhotos gphotos() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#goffers()
	 */
	@Override
	public getOffers goffers() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gsuites()
	 */
	@Override
	public getSuites gsuites() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#glocation()
	 */
	@Override
	public getLocation glocation() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#greviews()
	 */
	@Override
	public getReviews greviews() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see interf.eleGetter.getWebsite#gtextOnlyPage()
	 */
	@Override
	public getTextOnlyPage gtextOnlyPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public dataWebsite getdata(){
		return this.dataguy;
	}
}
