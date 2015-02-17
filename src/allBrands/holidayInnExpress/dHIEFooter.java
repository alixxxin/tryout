/**
 * 
 */
package allBrands.holidayInnExpress;

import java.util.ArrayList;
import java.util.HashMap;

import allBrands.noBrand.dNBFooter;
import interf.dataReq.dataFooter;

/**
 * @author xin.lian
 *
 */
public class dHIEFooter extends dNBFooter implements dataFooter {

	public String theme;
	public dHIEFooter(String theme) {
		super(theme);
		this.theme = theme;
	}
	
}