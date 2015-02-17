/**
 * 
 */
package allBrands.comfortInn;

import java.util.ArrayList;
import java.util.HashMap;

import allBrands.noBrand.dNBFooter;
import interf.dataReq.dataFooter;

/**
 * @author xin.lian
 *
 */
public class dCIFooter extends dNBFooter implements dataFooter {

	public String theme;
	public dCIFooter(String theme) {
		super(theme);
		this.theme = theme;
	}
	
}