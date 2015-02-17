/**
 * 
 */
package allBrands.ramada;

import allBrands.noBrand.dNBBookingWidget;
import interf.dataReq.dataBookingWidget;

/**
 * @author xin.lian
 *
 */
public class dRBookingWidget extends dNBBookingWidget implements dataBookingWidget {

	/**
	 * 
	 */
	public String theme;
	public dRBookingWidget(String theme) {
		super(theme);
		this.theme = theme;
	}

}