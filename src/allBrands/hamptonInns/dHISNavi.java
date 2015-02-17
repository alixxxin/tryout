/**
 * 
 */
package allBrands.hamptonInns;

import interf.dataReq.dataNavi;
import allBrands.noBrand.dNBNavi;

/**
 * @author xin.lian
 *
 */
public class dHISNavi extends dNBNavi implements dataNavi{

	public String theme;
	public dHISNavi(String theme) {
		super(theme);
		this.theme = theme;
	}

}
