package com.vtalent.omprakash;

public class Employee1 {	
	private	int id;
	private String EmployeeName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.EmployeeName = employeeName;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmployeeName == null) ? 0 : EmployeeName.hashCode());
		result = prime * result + id;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (EmployeeName == null) {
			if (other.EmployeeName != null)
				return false;
		} else if (!EmployeeName.equals(other.EmployeeName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
		
	
	 
	}


