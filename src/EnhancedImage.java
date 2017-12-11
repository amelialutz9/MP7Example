import java.util.ArrayList;
/**
 * The class to store our images with information.
 * @author amelialutz
 *
 */
public class EnhancedImage {
	/** The image url source. */
	private String source;
	/** The specific key that stores information about the item, explained in the key file. */
	private String key;
	/** The color of the item. */
	private String color;
	/** The style of the item, for example: t-shirt, dress shirt, long pants, shorts, etc. */
	private String style;
	/** This finds recommendations. */
	private ArrayList<String> match = new ArrayList<String>();
	/** Array of Colors to simplify code. */
	private String[] colors = {"B","E","R","G","C","Y"};
	
	/**
	 * Creates an image with a key that specifies it from other items.
	 * @param gender if the article of clothing is for men or women
	 * @param atmosphere if the article is formal or informal
	 * @param section if the article is for your upper half or lower half
	 * @param style determines if the article is shorts, pants, t-shirts, long sleeved, etc.
	 * @param color the color of the article of clothing
	 * @param src the image url to display the image
	 */
	public EnhancedImage(final String gender, final String atmosphere, final String section,
			final String style, final String color, final String src) {
		key = gender + atmosphere + section + style + color;
		this.color = color;
		this.style = style;
		source = src;
	}
	
	/**
	 * Returns the color of the item.
	 * @return the color of the item
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Returns the key of the item.
	 * @return the key of the item
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * Returns the style of the item.
	 * @return the style of the item
	 */
	public String getStyle() {
		return style;
	}
	
	/**
	 * Returns the image source of the item
	 * @return the image source of the item
	 */
	public String getSource() {
		return source;
	}
	
	/**
	 * Returns the array of keys that match the article.
	 * @return the array of keys that match the article
	 */
	public ArrayList<String> getMatch(){
		return match;
	}
	
	/**
	 * To string method to represent the image.
	 */
	public String toString() {
		return "Source: " + source + "\nKey: " + key + "\nColor: " + color
				+ "\nStyle: " + style;
	}
	
	/**
	 * Gets the keys that would match the article of clothing and assigns it to the match variable.
	 */
	public void getMatchKey() {
		if(key.contains("MFL")) { //Men's formal lower (only slacks)
			if(style.equals("P")) { //slacks
				if(color.equals("B")) {
					for(int i = 1; i < colors.length; i++) {
						match.add("MFUT" + colors[i]);
					}
				}
				if(color.equals("E")) {
					match.add("MFUTB");
					match.add("MFUTY");
				}
				if(color.equals("R")) {
					match.add("MFUTC");
					match.add("MFUTB");
					match.add("MFUTE");
				}
				if(color.equals("G")) {
					match.add("MFUTB");
					match.add("MFUTE");
				}
				if(color.equals("C")) {
					match.add("MFUTB");
					match.add("MFUTE");
					match.add("MFUTR");
				}
				if(color.equals("Y")) {
					match.add("MFUTB");
					match.add("MFUTE");
					match.add("MFUTC");
				}
			}
		}
		if(key.contains("MFU")) { //Men's formal upper (shirt and jacket)
			if(style.equals("T")) { //shirt
				if(color.equals("B")) {
					for(int i = 1; i < colors.length; i++) {
						match.add("MFLP" + colors[i]);
					}
				}
				if(color.equals("E")) {
					match.add("MFLPB");
					match.add("MFLPY");
				}
				if(color.equals("R")) {
					match.add("MFLPC");
					match.add("MFLPB");
					match.add("MFLPE");
				}
				if(color.equals("G")) {
					match.add("MFLPB");
					match.add("MFLPE");
				}
				if(color.equals("C")) {
					match.add("MFLPB");
					match.add("MFLPE");
					match.add("MFLPR");
				}
				if(color.equals("Y")) {
					match.add("MFLPB");
					match.add("MFLPE");
					match.add("MFLPC");
				}
			}
			if(style.equals("J")) { //jacket
				if(color.equals("B")) {
					for(int i = 1; i < colors.length; i++) {
						match.add("MFUT" + colors[i]);
					}
				}
				if(color.equals("E")) {
					match.add("MFUTB");
					match.add("MFUTY");
				}
				if(color.equals("R")) {
					match.add("MFUTC");
					match.add("MFUTB");
					match.add("MFUTE");
				}
				if(color.equals("G")) {
					match.add("MFUTB");
					match.add("MFUTE");
				}
				if(color.equals("C")) {
					match.add("MFUTB");
					match.add("MFUTE");
					match.add("MFUTR");
				}
				if(color.equals("Y")) {
					match.add("MFUTB");
					match.add("MFUTE");
					match.add("MFUTC");
				}
			}
		}
		if(key.contains("MIL")) { //Men's informal lower (pants and jeans)
			if(style.equals("P")) { //pants
				if(color.equals("B")) {
					for(int i = 1; i < colors.length; i++) {
						match.add("MIUT" + colors[i]);
					}
				}
				if(color.equals("E")) {
					match.add("MIUTB");
					match.add("MFUTY");
				}
				if(color.equals("R")) {
					match.add("MIUTC");
					match.add("MIUTB");
					match.add("MIUTE");
				}
				if(color.equals("G")) {
					match.add("MIUTB");
					match.add("MIUTE");
				}
				if(color.equals("C")) {
					match.add("MIUTB");
					match.add("MIUTE");
					match.add("MIUTR");
				}
				if(color.equals("Y")) {
					match.add("MIUTB");
					match.add("MIUTE");
					match.add("MIUTC");
				}
			}
			if(style.equals("H")) { //jeans
				if(color.equals("B")) {
					for(int i = 1; i < colors.length; i++) {
						match.add("MIUT" + colors[i]);
					}
				}
				if(color.equals("E")) {
					match.add("MIUTB");
					match.add("MIUTY");
				}
				if(color.equals("R")) {
					match.add("MIUTC");
					match.add("MIUTB");
					match.add("MIUTE");
				}
				if(color.equals("G")) {
					match.add("MIUTB");
					match.add("MIUTE");
				}
				if(color.equals("C")) {
					match.add("MIUTB");
					match.add("MIUTE");
					match.add("MIUTR");
				}
				if(color.equals("Y")) {
					match.add("MIUTB");
					match.add("MIUTE");
					match.add("MIUTC");
				}
			}
		}
		if(key.contains("MIU")) { //Men's informal upper (shirt, jacket, sweaters)
			if(style.equals("T")) { //shirt
				if(color.equals("B")) {
					for(int i = 1; i < colors.length; i++) {
						match.add("MILP" + colors[i]);
						match.add("MILH" + colors[i]);
					}
				}
				if(color.equals("E")) {
					match.add("MILPB");
					match.add("MILPY");
					match.add("MILHB");
					match.add("MILHY");
				}
				if(color.equals("R")) {
					match.add("MILPC");
					match.add("MILPB");
					match.add("MILPE");
					match.add("MILHC");
					match.add("MILHB");
					match.add("MILHE");
				}
				if(color.equals("G")) {
					match.add("MILPB");
					match.add("MILPE");
					match.add("MILHB");
					match.add("MILHE");
				}
				if(color.equals("C")) {
					match.add("MILPB");
					match.add("MILPE");
					match.add("MILPR");
					match.add("MILHB");
					match.add("MILHE");
					match.add("MILHR");
				}
				if(color.equals("Y")) {
					match.add("MILPB");
					match.add("MILPE");
					match.add("MILPC");
					match.add("MILHB");
					match.add("MILHE");
					match.add("MILHC");
				}
			}
			if(style.equals("J")) { //jacket
				if(color.equals("B")) {
					for(int i = 1; i < colors.length; i++) {
						match.add("MIUT" + colors[i]);
					}
				}
				if(color.equals("E")) {
					match.add("MIUTB");
					match.add("MIUTY");
				}
				if(color.equals("R")) {
					match.add("MIUTC");
					match.add("MIUTB");
					match.add("MIUTE");
				}
				if(color.equals("G")) {
					match.add("MIUTB");
					match.add("MIUTE");
				}
				if(color.equals("C")) {
					match.add("MIUTB");
					match.add("MIUTE");
					match.add("MIUTR");
				}
				if(color.equals("Y")) {
					match.add("MIUTB");
					match.add("MIUTE");
					match.add("MIUTC");
				}
			}
			if(style.equals("S")) { //jacket
				if(color.equals("B")) {
					for(int i = 1; i < colors.length; i++) {
						match.add("MIUT" + colors[i]);
					}
				}
				if(color.equals("E")) {
					match.add("MIUTB");
					match.add("MIUTY");
				}
				if(color.equals("R")) {
					match.add("MIUTC");
					match.add("MIUTB");
					match.add("MIUTE");
				}
				if(color.equals("G")) {
					match.add("MIUTB");
					match.add("MIUTE");
				}
				if(color.equals("C")) {
					match.add("MIUTB");
					match.add("MIUTE");
					match.add("MIUTR");
				}
				if(color.equals("Y")) {
					match.add("MIUTB");
					match.add("MIUTE");
					match.add("MIUTC");
				}
			}
		}
	}
}
