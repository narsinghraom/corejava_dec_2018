package com.vtalent.mamathasri1;

public class EmployeeBean {
	private int no;
	private int num;
	private String nAME;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getnAME() {
		return nAME;
	}
	public void setnAME(String nAME) {
		this.nAME = nAME;
	}
	
	public static void main(String[] args) {
		
		EmployeeBean b=new EmployeeBean();
		b.setNo(1);
		b.setNum(4);
		b.setnAME("mamatha");
		System.out.println(b.getnAME());
		System.out.println(b.getNo());
		System.out.println(b.getNum());
		
		
	}

}
