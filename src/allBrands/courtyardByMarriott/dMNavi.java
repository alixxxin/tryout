/**
 * 
 */
package allBrands.courtyardByMarriott;

import interf.dataReq.dataNavi;
import allBrands.noBrand.dNBNavi;

/**
 * @author xin.lian
 *
 */
public class dMNavi extends dNBNavi implements dataNavi{

	public String theme;
	public dMNavi(String theme) {
		super(theme);
		this.theme = theme;
	}

}
