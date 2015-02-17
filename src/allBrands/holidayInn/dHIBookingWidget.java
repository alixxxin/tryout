/**
 * 
 */
package allBrands.holidayInn;

import allBrands.noBrand.dNBBookingWidget;
import interf.dataReq.dataBookingWidget;

/**
 * @author xin.lian
 *
 */
public class dHIBookingWidget extends dNBBookingWidget implements dataBookingWidget {

	/**
	 * 
	 */
	public String theme;
	public dHIBookingWidget(String theme) {
		super(theme);
		this.theme = theme;
	}

}