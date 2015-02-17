/**
 * 
 */
package allBrands.noBrand;

import interf.dataReq.dataOffers;

/**
 * @author xin.lian
 *
 */
public class dNBOffers implements dataOffers{

	/**
	 * 
	 */
	public dNBOffers() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataOffers#groupStoryTitleUppercase()
	 */
	@Override
	public String[] groupStoryTitleUppercase() {
		// TODO Auto-generated method stub
		return new String [] {"uppercase", "text-transform"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataOffers#groupStoryTitleSize()
	 */
	@Override
	public String[] groupStoryTitleSize() {
		// TODO Auto-generated method stub
		return new String [] {"11px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataOffers#groupStoryTitleColor()
	 */
	@Override
	public String[] groupStoryTitleColor() {
		// TODO Auto-generated method stub
		return new String [] {"666", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataOffers#tabBarUnderlineColor()
	 */
	@Override
	public String[] tabBarUnderlineColor() {
		// TODO Auto-generated method stub
		return new String [] {"#000000", "border-color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataOffers#offerNameSize()
	 */
	@Override
	public String[] offerNameSize() {
		// TODO Auto-generated method stub
		return new String [] {"22px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataOffers#offerNameColor()
	 */
	@Override
	public String[] offerNameColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataOffers#offerDetailSize()
	 */
	@Override
	public String[] offerDetailSize() {
		// TODO Auto-generated method stub
		return new String [] {"#14px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataOffers#offerDetailColor()
	 */
	@Override
	public String[] offerDetailColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

}
