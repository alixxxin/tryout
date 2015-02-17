/**
 * 
 */
package allBrands.noBrand;

import interf.dataReq.dataHome;

/**
 * @author xin.lian
 *
 */
public class dNBHome implements dataHome{


	public dNBHome() {

	}

	@Override
	public String[] backgroundbgImg() {
		// TODO Auto-generated method stub
		return new String [] {"url(\"images/bkg.png\")", "background-image"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHome#backgroundFont()
	 */
	@Override
	public String[] backgroundFontFamily() {
		// TODO Auto-generated method stub
		return new String [] {"\"Open Sans\",sans-serif", "font-family"};//wrong ,change later
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHome#homeBodyFontSize()
	 */
	@Override
	public String[] homeBodyFontSize() {
		// TODO Auto-generated method stub
		return new String [] {"13px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHome#homeBodyFontColor()
	 */
	@Override
	public String[] homeBodyFontColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHome#homeH1FontSize()
	 */
	@Override
	public String[] homeH1FontSize() {
		// TODO Auto-generated method stub
		return  new String [] {"24px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHome#homeH1FontColor()
	 */
	@Override
	public String[] homeH1FontColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHome#homeH1FontWight()
	 */
	@Override
	public String[] homeH1FontWight() {
		// TODO Auto-generated method stub
		return new String [] {"600", "font-weight"};
	}

}
