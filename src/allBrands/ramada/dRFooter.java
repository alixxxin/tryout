/**
 * 
 */
package allBrands.ramada;

import java.util.ArrayList;
import java.util.HashMap;

import allBrands.noBrand.dNBFooter;
import interf.dataReq.dataFooter;

/**
 * @author xin.lian
 *
 */
public class dRFooter extends dNBFooter implements dataFooter {

	public String theme;
	public dRFooter(String theme) {
		super(theme);
		this.theme = theme;
	}
	
}