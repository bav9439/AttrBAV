package edu.saintjoe.cs.brianc.attr;

//Adding 2 new colors for the final exam CMP 112 Bruce Anderson
public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		ColorAttr testOne, testTwo, testThree;
		Attr testFour;
		
		// We need this object for the third ColorAttr constructor
		ScreenColor newColor = new ScreenColor("green");
		
		// Test out our constructors
		
		// Number one
		testOne = new ColorAttr("ColorOne","red");
		System.out.println(testOne.toString());
		
		// Number two
		testTwo = new ColorAttr("ColorTwo");
		System.out.println(testTwo.toString());
		
		//This is creating a new color in ColorAttr 
		// Number three
		testThree = new ColorAttr("ColorThree", newColor);
		System.out.println(testThree.toString());
	
		//This is creating a new color in ColorAttr named "yellow"
		// Number four
		testFour = new Attr("ColorFour", "yellow");
		System.out.println(testFour.toString());
		
		//The output of the call toString is different because they 
		//each have different values and different names
		
		//Number five
		testFive = new ColorAttr("ColorFive", "chartreuse");
		System.out.println(testFive.toString()); 
		
		//Number six
		testSix = new ColorAttr("ColorSix", "crimson"); 
		System.out.println(testSix.toString()); 
		
	} // end main
}