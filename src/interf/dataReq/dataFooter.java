/**
 * 
 */
package interf.dataReq;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Lianxin
 *
 */
public interface dataFooter {

	public String [] footerBGColor();
	public String [] footerBGHeight();
	public String [] footerBGWidth();
	public String [] addressSectionAlign(); // include map
	public String [] addressSize();
	public String [] addressColor();
	public String [] mapTxtSize();
	public String [] mapTxtBold();
	public String [] mapTxtColor();
	public String [] naviTxtAlign();
	public String [] naviTxtSize();
	public String [] naviTxtBold();
	public String [] naviTxtColor();
	public String [] powerByVizllyAlign();
	// BW means black and white
	public String [] powerByVizllyTxtColor();
	public HashMap<String, ArrayList<String>> badges();
	
}
