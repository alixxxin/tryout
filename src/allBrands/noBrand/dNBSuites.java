/**
 * 
 */
package allBrands.noBrand;

import interf.dataReq.dataSuites;

/**
 * @author xin.lian
 *
 */
public class dNBSuites implements dataSuites{

	/**
	 * 
	 */
	public dNBSuites() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataSuites#roomGroupStoryTitleUpperCase()
	 */
	@Override
	public String[] roomGroupStoryTitleUpperCase() {
		// TODO Auto-generated method stub
		return new String [] {"uppercase", "text-tranform"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataSuites#roomGroupStoryTitleSize()
	 */
	@Override
	public String[] roomGroupStoryTitleSize() {
		// TODO Auto-generated method stub
		return new String [] {"11px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataSuites#roomGroupStoryTitleColor()
	 */
	@Override
	public String[] roomGroupStoryTitleColor() {
		// TODO Auto-generated method stub
		return new String [] {"#666666", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataSuites#roomNameSize()
	 */
	@Override
	public String[] roomNameSize() {
		// TODO Auto-generated method stub
		return new String [] {"22px", "font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataSuites#roomNameColor()
	 */
	@Override
	public String[] roomNameColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataSuites#moreInfoArrowColor()
	 */
	@Override
	public String[] moreInfoArrowColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "border-top-color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataSuites#tabUnderlineColor()
	 */
	@Override
	public String[] tabUnderlineColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "border-bottom-color"};
	}

}
