package com.vtalent.bhavani;
import java.lang.RuntimeException;

public class LoanNotEligible extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8627595778857656118L;

	LoanNotEligible(String msg) {
		//super(msg);
		try {

			Exception e = new Exception(msg);
			System.out.println("here" + e.getMessage());
			
		} catch (Exception e) {
			
			
		}

	}
	}

