package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("What is the name of the first person in your group?");
		String s1 = ap.nextString("What is the name of the second person in your group?");
		String s2 = ap.nextString("What is the name of the third person in your group?");
		String s3 = ap.nextString("What is the name of the fourth person in your group?");
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("Hello " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + ".");
	}
}
