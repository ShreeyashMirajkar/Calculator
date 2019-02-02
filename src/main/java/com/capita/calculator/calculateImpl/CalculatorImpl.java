package com.capita.calculator.calculateImpl;

import com.capita.calculator.calculate.Calculate;

public class CalculatorImpl implements Calculate{

	String result;

	public String calculate(String expression) {

		char[] charArray =  expression.toCharArray();

		if(charArray.toString().matches("+-*/()[0-9]")) { 

			for (char element: charArray) {

				
			}
		}
		else {
			result="INVALID EXPRESSION";			
		}
		return result;		

	}

}
