/**
 * 
 */
package allBrands.noBrand;

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
public class noBrandHotel implements dataWebsite{

	public String theme;
	public noBrandHotel(String theme) {
		this.theme = theme;
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dheader()
	 */
	@Override
	public dataHeader dheader() {
		// TODO Auto-generated method stub
		return new dNBHeader(theme);
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dfooter()
	 */
	@Override
	public dataFooter dfooter() {
		// TODO Auto-generated method stub
		return new dNBFooter(theme);
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dnavi()
	 */
	@Override
	public dataNavi dnavi() {
		// TODO Auto-generated method stub
		return new dNBNavi(theme);
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dbookingwidget()
	 */
	@Override
	public dataBookingWidget dbookingwidget() {
		// TODO Auto-generated method stub
		return new dNBBookingWidget(theme);
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dhome()
	 */
	@Override
	public dataHome dhome() {
		// TODO Auto-generated method stub
		return new dNBHome();
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dphotos()
	 */
	@Override
	public dataPhotos dphotos() {
		// TODO Auto-generated method stub
		return new dNBPhotos();
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#doffers()
	 */
	@Override
	public dataOffers doffers() {
		// TODO Auto-generated method stub
		return new dNBOffers();
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dsuites()
	 */
	@Override
	public dataSuites dsuites() {
		// TODO Auto-generated method stub
		return new dNBSuites();
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dlocation()
	 */
	@Override
	public dataLocation dlocation() {
		// TODO Auto-generated method stub
		return new dNBLocation();
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dreviews()
	 */
	@Override
	public dataReviews dreviews() {
		// TODO Auto-generated method stub
		return new dNBReviews();
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dtextOnlyPage()
	 */
	@Override
	public dataTextOnlyPage dtextOnlyPage() {
		// TODO Auto-generated method stub
		return new dNBTextOnlyPage();
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dBtnBG()
	 */
	@Override
	public String[] dBtnBG() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dBtnBGHover()
	 */
	@Override
	public String[] dBtnBGHover() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dBtnTextSize()
	 */
	@Override
	public String[] dBtnTextSize() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dBtnTextColor()
	 */
	@Override
	public String[] dBtnTextColor() {
		// TODO Auto-generated method stub
		return new String [] {"#575757", "background-image"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataWebsite#dBtnTextAlign()
	 */
	@Override
	public String[] dBtnTextAlign() {
		// TODO Auto-generated method stub
		return null;
	}

}
