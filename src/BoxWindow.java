
public class BoxWindow {
	// Define a class integer variable size
	static int size = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Call methods to draw the figure - The figure is subdivided into two parts
		// i.e. Line and Bars
		drawLine();
		drawBars();
		drawLine();
		drawBars();
		drawLine();
	}

	public static void drawLine() {
		System.out.print("+");

		// The loop prints = as per size
		for (int i = 1; i <= size; i++) {
			System.out.print("=");
		}
		System.out.print("+");

		// The loop prints = as per size
		for (int i = 1; i <= size; i++) {
			System.out.print("=");
		}
		System.out.println("+");
	}

	public static void drawBars() {
		System.out.print("|");

		// The loop prints blanks as per size
		for (int i = 1; i <= size; i++) {
			System.out.print(" ");
		}
		System.out.print("|");
		// The loop prints blanks as per size
		for (int i = 1; i <= size; i++) {
			System.out.print(" ");
		}
		System.out.println("|");
	}

}
