package CalculatorAppMaven.CalculatorAppMaven;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService {

	public static void main(String[] args) {

	}

	@Override
	public void operate(int x, int y) {
		System.out.println("Sum = "+(x+y));
	}

}
