
/*
	ISYS 320
	Name(s): Mohammed Anohi
	Date: 11/13/2017
*/

public class P5_ScalableBox {
	static int widthOfBox = 8;
	static int heightOfBox = 10;

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}

	public static void drawBoxCap() {
		System.out.print("+");

		for (int capDashIndex = 1; capDashIndex <= widthOfBox - 2; capDashIndex++) {
			System.out.print("-");
		}

		System.out.println("+");
	}

	public static void drawBoxInsides() {
		for (int insideRowIndex = 1; insideRowIndex <= heightOfBox - 2; insideRowIndex++) {
			drawBoxInsideLine();
		}
	}

	public static void drawBoxInsideLine() {
		System.out.print("|");

		for (int insideRowIndex = 1; insideRowIndex <= widthOfBox - 2; insideRowIndex++) {
			System.out.print(".");
		}

		System.out.println("|");
	}

}
