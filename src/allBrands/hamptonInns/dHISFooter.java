/**
 * 
 */
package allBrands.hamptonInns;

import java.util.ArrayList;
import java.util.HashMap;

import allBrands.noBrand.dNBFooter;
import interf.dataReq.dataFooter;

/**
 * @author xin.lian
 *
 */
public class dHISFooter extends dNBFooter implements dataFooter {

	public String theme;
	public dHISFooter(String theme) {
		super(theme);
		this.theme = theme;
	}
	
}