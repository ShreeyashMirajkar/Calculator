package com.capita.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.capita.calculator.calculate.Calculate;
import com.capita.calculator.calculateImpl.CalculatorImpl;

public class Calculator {

	static Calculate calculate = new CalculatorImpl();
	static ArrayList<String> solution;


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int caseNumber = input.nextInt();

		System.out.println(caseNumber);


		for (int i=0 ; i<caseNumber; i++) {

			String expression = input.next();

			String answer = calculate.calculate(expression);

			solution.add(answer);
		}

		solution.stream().forEach((a)->System.out.println(a));

	}

}
