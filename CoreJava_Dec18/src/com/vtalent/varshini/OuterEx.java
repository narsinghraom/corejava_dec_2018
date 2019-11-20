package com.vtalent.varshini;

    class OuterEx {
    	private int i;
    	public void function() {
    		System.out.println("outer class function"+i);
    	}
    	    static class Inner{
    		float f;
    		public void function() {
    			OuterEx o=new OuterEx();
    			o.i=2;
    			System.out.println("Inner class function"+(f+o.i));
    		}
    	}
	
     public static void main(String[] args) {
    	 OuterEx o=new OuterEx();
    	 o.i=10;
    	 o.function();
    	 OuterEx.Inner in=new OuterEx.Inner();
    	 in.f=1.5f;
         in.function();
         
     }

}
