/**
 * 
 */
package allBrands.courtyardByMarriott;

import java.util.ArrayList;
import java.util.HashMap;

import allBrands.noBrand.dNBFooter;
import interf.dataReq.dataFooter;

/**
 * @author xin.lian
 *
 */
public class dMFooter extends dNBFooter implements dataFooter {

	public String theme;
	public dMFooter(String theme) {
		super(theme);
		this.theme = theme;
	}
	
}