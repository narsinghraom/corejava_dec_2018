package com.vtalent.saritha;

import com.vtalent.saritha.GetALoanException;

public class GetALoan {
	public boolean validateSalary(double salary) {

		try {
			if (salary <= 25000.0) {
				throw new GetALoanException();
			}
		} catch (GetALoanException q) {

		}
		return true;

	}
}