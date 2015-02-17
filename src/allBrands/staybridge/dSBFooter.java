/**
 * 
 */
package allBrands.staybridge;

import java.util.ArrayList;
import java.util.HashMap;

import allBrands.noBrand.dNBFooter;
import interf.dataReq.dataFooter;

/**
 * @author xin.lian
 *
 */
public class dSBFooter extends dNBFooter implements dataFooter {

	public String theme;
	public dSBFooter(String theme) {
		super(theme);
		this.theme = theme;
	}
	
}