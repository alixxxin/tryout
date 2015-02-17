/**
 * 
 */
package general;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/**
 * @author Lianxin
 *
 */
public class xmlGenerator {

	public static String [] browserType = {"firefox", "chrome", "ie"};
	public static String [] url = {"http://www.nobrand02.client.qa-next.vizlly.com/?nocache",
		"http://test1.client.qa-next.vizlly.com/?nocache&amp;template=genericbigscreen",
		"http://www.nobrand04.client.qa-next.vizlly.com/?nocache&amp;template=genericbigscreen"};
	public static String [] alltheme = {"showcase", "folio", "classic", "centerclassic"};
	public static String [] allhotelType = {"bestWestern", "comfortInn", "courtyardByMarriott",
		"hamptonInns", "holidayInn", "holidayInnExpress", "ramada", "staybridge", "noBrand"};
	
	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		HashMap<String, String[]> parameters = new HashMap<String, String[]>();
		/**
		 * { "browserType", "url", "theme", "hotelType" }
		 */
		
								
		// Begin - Modify parts
		// Note: key set size should match testname length
		String[] testname = { "TestFirefox" };
		parameters.put("browserType", new String [] {browserType[0] });
		parameters.put("url", new String [] { url[2]});
		parameters.put("theme", new String [] {alltheme[0] });
		parameters.put("hotelType", new String [] {"noBrand" });
		String [] tests = {"testPart.TestCommonParts",
				 "testPart.NewTestRooms",
				 "testPart.TestFeatureStoryPage",
				 "testPart.TestOffers",
				 "testPart.TestLocation",
				 "testPart.TestReviews",
				 "testPart.TestTextOnlyPage"};
		// End - Modify Parts
		
		PrintWriter writer = new PrintWriter("NewF.xml", "UTF-8");
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE suite SYSTEM \"http://testng.org/testng-1.0.dtd\" >");
		writer.println("<suite name=\"MultiBrowser\">");
		writer.println("\t<listeners>");
		writer.println("\t\t<listener class-name=\"testPart.DotTestListener\" />");
		writer.println("\t</listeners>");
		
		for (int i=0; i<testname.length; i++){
			writer.println("\t<test name=\"" + testname[i]+ "\">");
			//parameters here
			for (String key : parameters.keySet()){
				writer.println("\t\t<parameter name=\"" + key + "\" value=\"" + parameters.get(key)[i] + "\" />");
			}
			
			writer.println("\t\t<classes>");
			//classes here
			for (String s : tests){
				writer.println("\t\t\t<class name = \""+ s + "\" />");
			}
			writer.println("\t\t</classes>");
			
			writer.println("\t</test>");
		}
		
		writer.println("</suite>");
		writer.close();
		System.out.println("finished");
	}

}
