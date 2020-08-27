/**
 *
 */
package dev.dcanevarollo;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

/**
 * @author dcanevarollo
 *
 */
public class CalcConsumerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 3)
			System.out.println("Please, provide two values and the operation");
		else {
			Calculator calculator = new Calculator();

			CalculatorSoap soap = calculator.getCalculatorSoap();

			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			String operation = args[2];

			String operator;
			int result;

			switch (operation) {
			case "add": {
				operator = " + ";
				result = soap.add(number1, number2);
				break;
			}

			case "sub": {
				operator = " - ";
				result = soap.subtract(number1, number2);
				break;
			}

			case "div": {
				operator = " / ";
				result = soap.divide(number1, number2);
				break;
			}

			case "mul": {
				operator = " x ";
				result = soap.multiply(number1, number2);
				break;
			}

			default:
				return;
			}

			System.out.println(number1 + operator + number2 + " = " + result);
		}
	}

}
