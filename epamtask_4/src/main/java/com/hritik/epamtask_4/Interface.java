package com.hritik.epamtask_4;

import java.io.IOException;


public class Interface  {
	public static void main(String[] args) throws IOException
	{
		SimpleInterestAndCompundInterestCalculation interest_obj = new SimpleInterestAndCompundInterestCalculation();
		interest_obj.calculateInterest();
		CostOfHouse house_obj= new CostOfHouse();
		house_obj.costCalculation();
	}
}