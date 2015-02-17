/**
 * 
 */
package allBrands.noBrand;

import interf.dataReq.dataTextOnlyPage;

/**
 * @author xin.lian
 *
 */
public class dNBTextOnlyPage implements dataTextOnlyPage{

	/**
	 * 
	 */
	public dNBTextOnlyPage() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataTextOnlyPage#textSize()
	 */
	@Override
	public String[] textSize() {
		// TODO Auto-generated method stub
		return new String [] {"13px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataTextOnlyPage#textColor()
	 */
	@Override
	public String[] textColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

}
