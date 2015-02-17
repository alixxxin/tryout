/**
 * 
 */
package allBrands.hamptonInns;

import allBrands.noBrand.dNBBookingWidget;
import interf.dataReq.dataBookingWidget;

/**
 * @author xin.lian
 *
 */
public class dHISBookingWidget extends dNBBookingWidget implements dataBookingWidget {

	/**
	 * 
	 */
	public String theme;
	public dHISBookingWidget(String theme) {
		super(theme);
		this.theme = theme;
	}

}