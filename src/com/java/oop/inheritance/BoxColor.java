package com.java.oop.inheritance;

// Consider this as an example of Hierarchical Inheritance 
// Since BoxPrice also extends BoxWeight & BoxColor also does the same.
public class BoxColor extends BoxWeight {

//	logic goes here..
	
}

/*
 * Hybrid Inheritance???
 * -> It's a combo of single & multiple inheritance. Since, Java doesn't support 
 * multiple inheritance it doesn't support hybrid inheritance too.
 * 
 * Also public class BoxColor extends BoxColor{...} BoxColor extending itself is called
 * cyclic inheritance which is not possible in java.
 */