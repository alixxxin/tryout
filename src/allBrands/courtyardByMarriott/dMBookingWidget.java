/**
 * 
 */
package allBrands.courtyardByMarriott;

import allBrands.noBrand.dNBBookingWidget;
import interf.dataReq.dataBookingWidget;

/**
 * @author xin.lian
 *
 */
public class dMBookingWidget extends dNBBookingWidget implements dataBookingWidget {

	/**
	 * 
	 */
	public String theme;
	public dMBookingWidget(String theme) {
		super(theme);
		this.theme = theme;
	}

}