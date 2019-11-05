package com.vtalent.swamy;

import java.util.Arrays;

public class Cricket_2_Exceptions extends Exception {
		public String toString() { 
		return " match is cancled due to rain";
		}
	  static class Fiftyovers extends Exception{
		public String toString() { 
			return "overs should be <=50";
			}
	
		}
		static class FourtyOvers extends Exception{
			public String toString() { 
				return "overs should be <=40";
				}
		}
		static class MatchTie extends Exception{
			public String toString() { 
				return "MATCH TIE";
				}
		}
	
	}
