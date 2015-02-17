/**
 * 
 */
package allBrands.holidayInnExpress;

import allBrands.noBrand.dNBBookingWidget;
import interf.dataReq.dataBookingWidget;

/**
 * @author xin.lian
 *
 */
public class dHIEBookingWidget extends dNBBookingWidget implements dataBookingWidget {

	/**
	 * 
	 */
	public String theme;
	public dHIEBookingWidget(String theme) {
		super(theme);
		this.theme = theme;
	}

}