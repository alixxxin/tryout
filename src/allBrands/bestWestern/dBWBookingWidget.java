/**
 * 
 */
package allBrands.bestWestern;

import allBrands.noBrand.dNBBookingWidget;
import interf.dataReq.dataBookingWidget;

/**
 * @author xin.lian
 *
 */
public class dBWBookingWidget extends dNBBookingWidget implements dataBookingWidget {

	/**
	 * 
	 */
	public String theme;
	public dBWBookingWidget(String theme) {
		super(theme);
		this.theme = theme;
	}

}