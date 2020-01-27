package lv.olga.repeat;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		final double TAX_RATE_20K = 0.1;
		final double TAX_RATE_30K = 0.2;
		final double TAX_RATE_40K = 0.3;
		final int SENTINEL = -1;

		int taxableIncome;
		double taxPayable;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter taxable income: $");

		taxableIncome = sc.nextInt();

		while (taxableIncome != SENTINEL) {

			if (taxableIncome >= 40000) {
				taxPayable = taxableIncome * TAX_RATE_40K;
			} else if (taxableIncome >= 30000) {
				taxPayable = taxableIncome * TAX_RATE_30K;
			} else if (taxableIncome >= 20000) {
				taxPayable = taxableIncome * TAX_RATE_20K;
			} else {
				taxPayable = 0;
			}

			System.out.println("Tax to be paid: " + taxPayable);
			
			System.out.println("Enter taxable income: $");
			taxableIncome = sc.nextInt(); //vēlreiz atļauj ierakstīt ciparu
			
		}
		System.out.println("end!");
//		sc.close();

	}

}