/**
 * 
 */
package allBrands.noBrand;

import interf.dataReq.dataNavi;

/**
 * @author xin.lian
 *
 */
public class dNBNavi implements dataNavi{

	public String theme;
	public dNBNavi(String theme) {
		this.theme = theme;
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataNavi#naviColor()
	 */
	@Override
	public String[] naviColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "background-color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataNavi#naviHoverColor()
	 */
	@Override
	public String[] naviHoverColor() {
		// TODO Auto-generated method stub
		return new String [] {"#575757", "background-color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataNavi#naviWidth()
	 */
	@Override
	public String[] naviWidth() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String [] {"962", "width"};
		case "folio":
			return null;
		case "classic":
			return null;
		case "centerclassic":
			return null;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataNavi#naviHeight()
	 */
	@Override
	public String[] naviHeight() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String [] {"41", "height"};
		case "folio":
			return null;
		case "classic":
			return null;
		case "centerclassic":
			return null;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataNavi#naviTxtColor()
	 */
	@Override
	public String[] naviTxtColor() {
		// TODO Auto-generated method stub
		return new String [] {"#ffffff", "color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataNavi#naviTxtUpperCase()
	 */
	@Override
	public String[] naviTxtUpperCase() {
		// TODO Auto-generated method stub
		return new String [] {"uppercase", " text-transform"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataNavi#naviTxtSize()
	 */
	@Override
	public String[] naviTxtSize() {
		// TODO Auto-generated method stub
		return new String [] {"12px", "font-size"};
	}

}
