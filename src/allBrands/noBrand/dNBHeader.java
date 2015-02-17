/**
 * 
 */
package allBrands.noBrand;

import interf.dataReq.dataHeader;

/**
 * @author xin.lian
 *
 */
public class dNBHeader implements dataHeader{

	public String theme;
	public dNBHeader(String theme) {
		this.theme = theme;
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHeader#hotelLogoAlign()
	 */
	@Override
	public String[] hotelLogoAndHotelNameAlign() { //locate based on the class=left
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String[] {"left","float"};
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
	 * @see interf.dataReq.dataHeader#hotelName()
	 */
	@Override
	public String [] hotelNameClass() {
		// TODO Auto-generated method stub
		return new String[] {"hotel-name","class"};
	}


	/* (non-Javadoc)
	 * @see interf.dataReq.dataHeader#hotelNameSize()
	 */
	@Override
	public String[] hotelNameSize() {
		// TODO Auto-generated method stub
		return new String[] {"14px","font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHeader#hotelNameBold()
	 */
	@Override
	public String[] hotelNameBold() {
		// TODO Auto-generated method stub
		// 700 is bold
		return new String[] {"700","font-weight"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHeader#hotelNameColor()
	 */
	@Override
	public String[] hotelNameColor() {
		// TODO Auto-generated method stub
		return new String[] {"#333333","color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHeader#phoneNumAlign()
	 */
	@Override
	public String[] phoneNumAlign() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String[] {"right","text-align"};
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
	 * @see interf.dataReq.dataHeader#phoneNumSize()
	 */
	@Override
	public String[] phoneNumSize() {
		// TODO Auto-generated method stub
		return new String[] {"16px","font-size"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHeader#phoneNumColor()
	 */
	@Override
	public String[] phoneNumColor() {
		// TODO Auto-generated method stub
		return new String[] {"#333333","color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHeader#socialAlign()
	 */
	@Override
	public String[] socialAlign() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String[] {"right","text-align"};
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
	 * @see interf.dataReq.dataHeader#headerBG()
	 */
	@Override
	public String[] headerBG() {
		// TODO Auto-generated method stub
		return new String[] {"#ffffff","background-color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataHeader#dimHeight()
	 */
	@Override
	public String[] dimHeight() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String[] {"151","height"};
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
	 * @see interf.dataReq.dataHeader#dimWidth()
	 */
	@Override
	public String[] dimWidth() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String[] {"962","width"};
		case "folio":
			return null;
		case "classic":
			return null;
		case "centerclassic":
			return null;
		}
		return null;
	}

}
