/******************************************************************************
 *  Purpose:	Monthly Paument
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/


package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		
		//System.out.println("Enter principal loan amount P");
		//double principal=Utility.inputInteger();
		//System.out.println("Enter interest R");
		//double rateOfInterest=Utility.inputInteger();
		//System.out.println("Enter Years Y");
		//double year=Utility.inputInteger();
		double principal=Double.parseDouble(args[0]);
		double rateOfInterest=Double.parseDouble(args[1]);
		double year=Double.parseDouble(args[2]);
		Utility.calculation(principal,rateOfInterest,year);

	}

}
