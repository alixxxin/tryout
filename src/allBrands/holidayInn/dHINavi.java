/**
 * 
 */
package allBrands.holidayInn;

import interf.dataReq.dataNavi;
import allBrands.noBrand.dNBNavi;

/**
 * @author xin.lian
 *
 */
public class dHINavi extends dNBNavi implements dataNavi{

	public String theme;
	public dHINavi(String theme) {
		super(theme);
		this.theme = theme;
	}

}
