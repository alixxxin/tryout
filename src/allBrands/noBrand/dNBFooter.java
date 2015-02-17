/**
 * 
 */
package allBrands.noBrand;

import java.util.ArrayList;
import java.util.HashMap;

import interf.dataReq.dataFooter;

/**
 * @author xin.lian
 *
 */
public class dNBFooter implements dataFooter{

	public String theme;
	public dNBFooter(String theme) {
		this.theme = theme;
	}

	@Override
	public String[] footerBGColor() {
		// TODO Auto-generated method stub
		return new String [] {"#333333", "background-color"};
	}

	@Override
	public String[] footerBGHeight() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String [] {"169", "height"};
		case "folio":
			return null;
		case "classic":
			return null;
		case "centerclassic":
			return null;
		}
		return null;
	}

	@Override
	public String[] footerBGWidth() {
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

	@Override
	public String[] addressSectionAlign() {
		// TODO Auto-generated method stub
		switch(theme){
		case "showcase":
			return new String [] {"left", "float"};
		case "folio":
			return null;
		case "classic":
			return null;
		case "centerclassic":
			return null;
		}
		return null;
	}

	@Override
	public String[] addressSize() {
		// TODO Auto-generated method stub
		return new String [] {"12px", "font-size"};
	}

	@Override
	public String[] addressColor() {
		// TODO Auto-generated method stub
		return  new String [] {"#9D9D9D", "color"};
	}

	@Override
	public String[] mapTxtSize() {
		// TODO Auto-generated method stub
		return  new String [] {"12px", "font-size"};
	}

	@Override
	public String[] mapTxtBold() {
		// TODO Auto-generated method stub
		// 700 is bold, 400 is normal
		return new String [] {"700", "font-weight"};
	}

	@Override
	public String[] mapTxtColor() {
		// TODO Auto-generated method stub
		return  new String [] {"#fff", "color"};
	}

	@Override
	public String[] naviTxtAlign() {
		// TODO Auto-generated method stub
		return new String [] {"left", "text-align"}; //locating onto the policy
	}

	@Override
	public String[] naviTxtSize() {
		// TODO Auto-generated method stub
		return new String [] {"12px", "font-size"}; 
	}

	@Override
	public String[] naviTxtBold() {
		// TODO Auto-generated method stub
		// 700 is bold, 400 is normal
		return new String [] {"700", "font-weight"};//no idea how to get this cssvalue
	}

	@Override
	public String[] naviTxtColor() {
		// TODO Auto-generated method stub
		return new String [] {"#ffffff", "color"};//locating onto the policies only.
	}

	@Override
	public String[] powerByVizllyAlign() {
		// TODO Auto-generated method stub
		return new String [] {"0px", "right"};//locating the vmfPower link
	}

	@Override
	public String[] powerByVizllyTxtColor() {
		// TODO Auto-generated method stub
		return new String [] {"#ffffff", "color"};
	}

	@Override
	public HashMap<String, ArrayList<String>> badges() {
		// TODO Auto-generated method stub
		return null;
		// HashMap<String, ArrayList<String>> ret = new HashMap<>();
		// ArrayList<String> temp = new ArrayList<>();
		// temp.add("wyndham", "qita");
		// ret.put("src", temp);
	}

}
