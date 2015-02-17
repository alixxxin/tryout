/**
 * 
 */
package allBrands.staybridge;

import allBrands.noBrand.dNBBookingWidget;
import interf.dataReq.dataBookingWidget;

/**
 * @author xin.lian
 *
 */
public class dSBBookingWidget extends dNBBookingWidget implements dataBookingWidget {

	/**
	 * 
	 */
	public String theme;
	public dSBBookingWidget(String theme) {
		super(theme);
		this.theme = theme;
	}

}