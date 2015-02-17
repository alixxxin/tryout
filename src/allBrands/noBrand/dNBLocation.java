/**
 * 
 */
package allBrands.noBrand;

import interf.dataReq.dataLocation;

/**
 * @author xin.lian
 *
 */
public class dNBLocation implements dataLocation{

	/**
	 * 
	 */
	public dNBLocation() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataLocation#addressSize()
	 */
	@Override
	public String[] addressSize() {
		// TODO Auto-generated method stub
		return new String [] {"13px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataLocation#addressColor()
	 */
	@Override
	public String[] addressColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataLocation#hotelNameSize()
	 */
	@Override
	public String[] hotelNameSize() {
		// TODO Auto-generated method stub
		return new String [] {"13px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataLocation#hotelNameColor()
	 */
	@Override
	public String[] hotelNameColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataLocation#emailSize()
	 */
	@Override
	public String[] emailSize() {
		// TODO Auto-generated method stub
		return new String [] {"13px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataLocation#emailColor()
	 */
	@Override
	public String[] emailColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

}
