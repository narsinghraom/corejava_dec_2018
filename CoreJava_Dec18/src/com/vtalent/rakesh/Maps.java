package com.vtalent.rakesh;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		HashMap<Employeee, Employeee> mapRef = new HashMap<>();
		Employeee emp = new Employeee();
		Employeee emp1 = new Employeee();
		emp.setId(100);
		emp1.setName("rakesh");

		mapRef.put(emp, emp1);
		for (Map.Entry<Employeee, Employeee> mapobj : mapRef.entrySet()) {
			System.out.println(mapobj.getKey() + "" + mapobj.getValue());
		}
	}

}
