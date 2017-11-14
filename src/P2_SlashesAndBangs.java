/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date: 11/13/2017
*/

/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number| Number of backslashes at start of line| Number of bangs in a line i.e. between slashes, if any. | Number of backslashes at End of line|
Line 1  			0 					22							0
Line 2  			2					18							2
Line 3  			4					14							4
Line 4  			6					10							6
Line 5  			8					6							8
Line 6  			10					2							10


Number of backslashes at start of line
Line1 = 0
Line2 = Number of backslashes in Line1 + 2
Line4 = Number of backslashes in Line2 + 2
Line5 = Number of backslashes in Line3 + 2
Line6 = Number of backslashes in Line4 + 2
Line7 = Number of backslashes in Line5 + 2
Line8 = Number of backslashes in Line6 + 2

Number of backslashes at End of line
Line1 = 0
Line2 = Number of backslashes in Line1 + 2
Line4 = Number of backslashes in Line2 + 2
Line5 = Number of backslashes in Line3 + 2
Line6 = Number of backslashes in Line4 + 2
Line7 = Number of backslashes in Line5 + 2
Line8 = Number of backslashes in Line6 + 2

Number of bangs in a line i.e. between slashes, if any. 
Line1 = 22
Line2 = 22-(Number of backslashes at start of line2 + Number of backslashes at start of line2)
Line3 = 22-(Number of backslashes at start of line3 + Number of backslashes at start of line3)
Line4 = 22-(Number of backslashes at start of line4 + Number of backslashes at start of line4)
Line5 = 22-(Number of backslashes at start of line5 + Number of backslashes at start of line5)
Line6 = 22-(Number of backslashes at start of line6 + Number of backslashes at start of line6)




*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 For (each of 6 lines)
{
Draw Starting BackSlashes
Draw Bangs
Draw Ending Back Slashes
}

Draw Starting BackSlashes
{
if (line Number is 1) 
{
number Of Backslashes At Start = numberOfBackslashesAtStart + 2
exit the method
}
For (each i less than or equal to number of back spaces)
{
print backspace
}
Evaluate number Of Back slashes At Start = number Of Back slashes At Start + 2
}


Draw Ending BackSlashes
{
if (line Number is 1) 
{
number Of Backslashes At End = number Of Back slashes AtEnd + 2;
exit the method
}
For (each i less than of back spaces)
{
print backspace
}
Evaluate number Of Back slashes At End = number Of Back slashes At End + 2
print backspace 
go to new line of output
}

Draw Bangs
{
if (line Number is 1)
{
for (each i less than number Of Bangs In Line1)
{
print bang
}
print bang 
go to new line of output
}

else
{
for (each i less than or equal to number Of Bangs In Line1)
{
print bang
}
}
Evaluate number Of Bangs In Line1 = totalBangs-(number Of Backslashes At Start + number Of Back slashes At Start)
}
 
 
 
 */

public class P2_SlashesAndBangs {
	static int lineNumber = 1;
	static int numberOfBangsInLine1 = 22;
	static int totalBangs = 22;
	static int numberOfBackslashesAtStart = 0;
	static int numberOfBackslashesAtEnd = 0;

	public static void main(String[] args)

	{
		for (P2_SlashesAndBangs.lineNumber = 1; P2_SlashesAndBangs.lineNumber <= 6; P2_SlashesAndBangs.lineNumber++) {
			DrawStartingBackSlashes();
			DrawBangs();
			DwarEndingBackSlashes();

		}
	}

	public static void DrawStartingBackSlashes() {

		if (lineNumber == 1) {
			P2_SlashesAndBangs.numberOfBackslashesAtStart = P2_SlashesAndBangs.numberOfBackslashesAtStart + 2;
			return;
		}

		for (int i = 1; i <= P2_SlashesAndBangs.numberOfBackslashesAtStart; i++) {

			System.out.print("\\");
		}

		P2_SlashesAndBangs.numberOfBackslashesAtStart = P2_SlashesAndBangs.numberOfBackslashesAtStart + 2;
	}

	public static void DwarEndingBackSlashes() {
		if (lineNumber == 1) {
			P2_SlashesAndBangs.numberOfBackslashesAtEnd = P2_SlashesAndBangs.numberOfBackslashesAtEnd + 2;
			return;
		}

		for (int i = 1; i < P2_SlashesAndBangs.numberOfBackslashesAtEnd; i++) {

			System.out.print("\\");

		}
		P2_SlashesAndBangs.numberOfBackslashesAtEnd = P2_SlashesAndBangs.numberOfBackslashesAtEnd + 2;
		System.out.println("\\");
	}

	public static void DrawBangs() {

		if (lineNumber == 1) {
			for (int i = 1; i < P2_SlashesAndBangs.numberOfBangsInLine1; i++) {

				System.out.print("!");
			}
			System.out.println("!");
		}

		else {
			for (int i = 1; i <= P2_SlashesAndBangs.numberOfBangsInLine1; i++) {

				System.out.print("!");
			}
		}

		P2_SlashesAndBangs.numberOfBangsInLine1 = P2_SlashesAndBangs.totalBangs
				- (P2_SlashesAndBangs.numberOfBackslashesAtStart + P2_SlashesAndBangs.numberOfBackslashesAtStart);

	}
}
