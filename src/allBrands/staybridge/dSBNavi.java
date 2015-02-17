/**
 * 
 */
package allBrands.staybridge;

import interf.dataReq.dataNavi;
import allBrands.noBrand.dNBNavi;

/**
 * @author xin.lian
 *
 */
public class dSBNavi extends dNBNavi implements dataNavi{

	public String theme;
	public dSBNavi(String theme) {
		super(theme);
		this.theme = theme;
	}

}
