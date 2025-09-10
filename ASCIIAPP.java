package ASCIIAPP;

import java.util.Scanner;
public class ASCIIAPP {

	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// create random integer
		int number;
		number = ((int) (Math.random()*256));
		
		// display integer, binary, hexadecimal, and ascii
		System.out.println("Integer:" + number);
		String Numberb = Integer.toBinaryString(number);
		System.out.println("Binary:" + Numberb);
		String Numberh=Integer.toHexString(number);
		System.out.println("Hexadecimal:" + Numberh.toUpperCase());
		char NumberA=(char)number;
		System.out.println("ASCII:" + NumberA);
		
	}

}
