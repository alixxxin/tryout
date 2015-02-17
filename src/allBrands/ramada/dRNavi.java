/**
 * 
 */
package allBrands.ramada;

import interf.dataReq.dataNavi;
import allBrands.noBrand.dNBNavi;

/**
 * @author xin.lian
 *
 */
public class dRNavi extends dNBNavi implements dataNavi{

	public String theme;
	public dRNavi(String theme) {
		super(theme);
		this.theme = theme;
	}

}
