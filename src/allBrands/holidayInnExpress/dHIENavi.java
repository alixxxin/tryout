/**
 * 
 */
package allBrands.holidayInnExpress;

import interf.dataReq.dataNavi;
import allBrands.noBrand.dNBNavi;

/**
 * @author xin.lian
 *
 */
public class dHIENavi extends dNBNavi implements dataNavi{

	public String theme;
	public dHIENavi(String theme) {
		super(theme);
		this.theme = theme;
	}

}
