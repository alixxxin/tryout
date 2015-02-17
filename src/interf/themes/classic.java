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
public class classic implements getWebsite{

	public dataWebsite dataguy;
	public String url;
	public classic(WebDriver driver, String url, String hotelType) {
		this.url = url;
		switch(hotelType){
		case "bestWestern":
			dataguy = new bestWesternHotel("classic");
			break;
		case "comfortInn":
			dataguy = new comfortInnHotel("classic");
			break;
		case "courtyardByMarriott":
			dataguy = new courtyardByMarriottHotel("classic");
			break;
		case "hamptonInns":
			dataguy = new hamptonInnsHotel("classic");
			break;
		case "holidayInn":
			dataguy = new holidayInnHotel("classic");
			break;
		case "holidayInnExpress":
			dataguy = new holidayInnExpressHotel("classic");
			break;
		case "ramada":
			dataguy = new ramadaHotel("classic");
			break;
		case "staybridge":
			dataguy = new staybridgeHotel("classic");
			break;
		default:
			dataguy = new noBrandHotel("classic");
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
