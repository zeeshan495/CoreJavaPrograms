
/******************************************************************************
 *  Purpose:	To find is it annagran or not.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class Annagram {

	public static void main(String[] args) {
		
		System.out.println("Please enter String 1");
		String string1=Utility.inputString1();
		System.out.println("Please enter String 2");
		String string2=Utility.inputString1();
		Utility.annagramFunction(string1, string2);
	}
	

}
