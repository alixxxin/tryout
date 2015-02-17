/**
 * 
 */
package interf.eleGetter;

import interf.dataReq.dataBookingWidget;
import interf.dataReq.dataFooter;
import interf.dataReq.dataHeader;
import interf.dataReq.dataHome;
import interf.dataReq.dataLocation;
import interf.dataReq.dataNavi;
import interf.dataReq.dataOffers;
import interf.dataReq.dataPhotos;
import interf.dataReq.dataReviews;
import interf.dataReq.dataSuites;
import interf.dataReq.dataTextOnlyPage;
import interf.dataReq.dataWebsite;

/**
 * @author Lianxin
 *
 */
public interface getWebsite {

	public getHeader gheader();
	public getFooter gfooter();
	public getNavi gnavi();
	public getBookingWidget gbookingwidget();
	public getHome ghome();
	public getPhotos gphotos();
	public getOffers goffers();
	public getSuites gsuites();
	public getLocation glocation();
	public getReviews greviews();
	public getTextOnlyPage gtextOnlyPage();
	public dataWebsite getdata();
	
}
