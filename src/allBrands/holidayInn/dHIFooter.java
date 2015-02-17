/**
 * 
 */
package allBrands.holidayInn;

import java.util.ArrayList;
import java.util.HashMap;

import allBrands.noBrand.dNBFooter;
import interf.dataReq.dataFooter;

/**
 * @author xin.lian
 *
 */
public class dHIFooter extends dNBFooter implements dataFooter {

	public String theme;
	public dHIFooter(String theme) {
		super(theme);
		this.theme = theme;
	}
	
}