/**
 * 
 */
package allBrands.noBrand;

import interf.dataReq.dataBookingWidget;

/**
 * @author xin.lian
 *
 */
public class dNBBookingWidget implements dataBookingWidget {

	public String theme;
	public dNBBookingWidget(String theme) {
		this.theme = theme;
	}

	@Override
	public String[] bookingWAlign() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return null;
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
	 * @see interf.dataReq.dataBookingWidget#checkRateAlign()
	 */
	@Override
	public String[] checkRateAlign() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String [] {"center", "text-align"};
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
	 * @see interf.dataReq.dataBookingWidget#checkInColor()
	 */
	@Override
	public String[] checkInColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "background-color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataBookingWidget#checkOutColor()
	 */
	@Override
	public String[] checkOutColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "background-color"};
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataBookingWidget#AdultDropDownValue()
	 */
	@Override
	public String[] AdultDropDownValue() {
		// TODO Auto-generated method stub
		return new String [] {"1", "value"}; //select option[0]
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataBookingWidget#ChildrenDropDownValue()
	 */
	@Override
	public String[] ChildrenDropDownValue() {
		// TODO Auto-generated method stub
		return new String [] {"0", "value"};//select option[0]
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataBookingWidget#RoomsValue()
	 */
	@Override
	public String[] RoomsValue() {
		return new String [] {"1", "value"};//select option[0]
	}

	/* (non-Javadoc)
	 * @see interf.dataReq.dataBookingWidget#DimWidth()
	 */
	@Override
	public String[] DimWidth() {
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
	 * @see interf.dataReq.dataBookingWidget#DimHeight()
	 */
	@Override
	public String[] DimHeight() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String [] {"66", "height"};
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
