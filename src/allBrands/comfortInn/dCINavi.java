/**
 * 
 */
package allBrands.comfortInn;

import interf.dataReq.dataNavi;
import allBrands.noBrand.dNBNavi;

/**
 * @author xin.lian
 *
 */
public class dCINavi extends dNBNavi implements dataNavi{

	public String theme;
	public dCINavi(String theme) {
		super(theme);
		this.theme = theme;
	}

}
