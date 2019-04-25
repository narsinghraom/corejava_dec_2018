package com.vtalent.sri;
 interface Abce {
	 public void function();
	 public int function(int k);

}
 interface Xyz extends TheKing,Abce{
	 
 }
 class TheKingImpOne extends TheKingImp1 implements Xyz{
public void method(){
	System.out.println("method extends");
}
 }
class Test5{
	public static void main(String[] args) {
		TheKing king=new TheKingImp();
		king.method();
		king.function();
		TheKingImp TheKing=new TheKingImp();
		TheKing.function();
		TheKing.method();
		TheKing.function(3);
}
	
}