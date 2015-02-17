/**
 * 
 */
package allBrands.bestWestern;

import interf.dataReq.dataFooter;
import allBrands.noBrand.dNBFooter;

/**
 * @author xin.lian
 *
 */
public class dBWFooter extends dNBFooter implements dataFooter {

	public String theme;
	public dBWFooter(String theme) {
		super(theme);
		this.theme = theme;
	}
	
}