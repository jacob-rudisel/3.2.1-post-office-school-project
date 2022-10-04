
public class BoxSize {
	private double length;
	private double width;
	private double thickness;
	private double weight;
	private String boxType;

	public BoxSize(double len, double wid, double thick, double weig) {
		length = len;
		width = wid;
		thickness = thick;
		weight = weig;
	}

	public String findBoxSize() {
		if (length >= 3.5 && length <= 4.25 && width >= 3.5 && width <= 6 && thickness >= .007 && thickness <= .016) {
			boxType = "regular post card";
			return boxType;
		} else if (length > 4.25 && length < 6 && width > 6 && width < 11.5 && thickness >= .007 && thickness <= .016) {
			boxType = "large post card";
			return boxType;
		} else if (length >= 3.5 && length <= 6.125 && width >= 5 && width <= 11.5 && thickness > .016 && thickness < .25) {
			boxType = "envelope";
			return boxType;
		} else if (length > 6.125 && length < 24 && width >= 11 && width <= 18 && thickness >= .25 && thickness <= .5) {
			boxType = "large envelope";
			return boxType;
		} else if (length >= 24 && ((2 * thickness + 2 * width) + length) <= 84) {
			boxType = "package";
			return boxType;
		} else if (((2 * thickness + 2 * width) + length) > 84 && ((2 * thickness + 2 * width) + length) < 130) {
			boxType = "large package";
			return boxType;
		} else {
			boxType = "unmailable";
			return boxType;
		}
	}

	public double mailingCosts(String bType) {
		if (bType == "regular post card") {
			return (Math.ceil((weight * 16)) * .2);
		} else if (bType == "large post card") {
			return (Math.ceil((weight * 16)) * .3);
		} else if (bType == "envelope") {
			return (Math.ceil((weight * 16)) * .47);
		} else if (bType == "large envelope") {
			return (Math.ceil((weight * 16)) * .56);
		} else if (bType == "package") {
			return (Math.ceil((weight * 2)) * 1.50);
		} else if (bType == "large package") {
			return (Math.ceil((weight * 2)) * 1.75);
		} else {
			return 0.0;
		}

	}
}
