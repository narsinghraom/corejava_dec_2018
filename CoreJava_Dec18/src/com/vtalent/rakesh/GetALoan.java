package com.vtalent.rakesh;

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
