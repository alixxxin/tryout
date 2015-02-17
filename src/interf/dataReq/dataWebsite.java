/**
 * 
 */
package interf.dataReq;

/**
 * @author Lianxin
 *
 */
public interface dataWebsite {

	public dataHeader dheader();
	public dataFooter dfooter();
	public dataNavi dnavi();
	public dataBookingWidget dbookingwidget();
	public dataHome dhome();
	public dataPhotos dphotos();
	public dataOffers doffers();
	public dataSuites dsuites();
	public dataLocation dlocation();
	public dataReviews dreviews();
	public dataTextOnlyPage dtextOnlyPage();
	public String [] dBtnBG();
	public String [] dBtnBGHover();
	public String [] dBtnTextSize();
	public String [] dBtnTextColor();
	public String [] dBtnTextAlign();
	
}
