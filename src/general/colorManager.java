package general;

import java.awt.Color;
import java.util.StringTokenizer;

public class colorManager {
	
	public static String colorIdenti(String rgb){
		if (rgb.indexOf('(') == 4){
			return rgbacolorHelper(rgb);
		} else if (rgb.indexOf('(') == 3){
			return rgbcolorHelper(rgb);
		} else if (rgb.contains("(")){
			return linearGradientHelper(rgb);
		} else {
			return rgb;
		}
	}
	
	public static String colorHelper(String rgb){
		/**
		 * @param: rgb - a string returned by selenium webdriver representing the colour
		 * @return: hex representative of that colour
		 */
		
		StringTokenizer st = new StringTokenizer(rgb);
		int r = Integer.parseInt(st.nextToken(",").trim());
		int g = Integer.parseInt(st.nextToken(",").trim());
		int b = Integer.parseInt(st.nextToken(",").trim());
		Color c = new Color(r, g, b);
		String hex = "#"+Integer.toHexString(c.getRGB()).substring(2);
		return hex.toUpperCase();
	}
		
	public static String rgbcolorHelper(String rgb){
		rgb = rgb.substring(4, rgb.length() - 1 );
		rgb += ", )";
		return colorHelper(rgb);
	}
	public static String rgbacolorHelper(String rgb){
		rgb = rgb.substring(5);
		return colorHelper(rgb);
	}
	
	public static String linearGradientHelper(String rgb){
		/**
		 * return value have format like
		 *  linear-gradient(rgb(229, 192, 110) 0%, rgb(195, 161, 91) 100%)
		 * want it to be 
		 * #E5C06E 0%, #C3A15B 100%
		 * Same purpose, convert to hex repres
		 */
		
		rgb = rgb.substring(rgb.indexOf('(')+1, rgb.length()-1);
		// format rgb(229, 192, 110) 0%, rgb(195, 161, 91) 100%
		
		String color1 = rgb.substring(0, rgb.indexOf(')')+1);
		rgb = rgb.substring(rgb.indexOf(')')+1);
		// format  0%, rgb(195, 161, 91) 100%]
		
		String mid = rgb.substring(0, rgb.indexOf(',')+2);
		rgb = rgb.substring(rgb.indexOf(',')+2);
		// format rgb(195, 161, 91) 100%
		
		String color2 = rgb.substring(0, rgb.indexOf(')')+1);
		String aft = rgb.substring(rgb.indexOf(')')+1);
		return rgbcolorHelper(color1) + mid + rgbcolorHelper(color2) + aft;
	}
}
