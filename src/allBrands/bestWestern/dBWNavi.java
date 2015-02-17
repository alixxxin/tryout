/**
 * 
 */
package allBrands.bestWestern;

import interf.dataReq.dataNavi;
import allBrands.noBrand.dNBNavi;

/**
 * @author xin.lian
 *
 */
public class dBWNavi extends dNBNavi implements dataNavi{

	public String theme;
	public dBWNavi(String theme) {
		super(theme);
		this.theme = theme;
	}

}
