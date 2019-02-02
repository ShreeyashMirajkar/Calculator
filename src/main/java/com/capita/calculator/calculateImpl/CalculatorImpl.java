package com.capita.calculator.calculateImpl;

import com.capita.calculator.calculate.Calculate;

public class CalculatorImpl implements Calculate{

	String result;
	
	public String calculate(String expression) {
		
		char[] charArray =  expression.toCharArray();
		
		if(charArray.toString().contains("")) { 
			
		}
        
		for (char element: charArray) {
			
			if(Character.toString(element).equals("+")) {
				
			}
		}
		
		
		
		return result;
	}

}
