package com.vtalent.swamy;

public class CricException {
public static void exception2(String s) throws Exception {
	if(s.equals("y")) {
		throw new Exception("match is stoped due to rain");
	}
}
public static void oversException() throws Exception {
	throw new Exception("overs exceeded");
}
public static void runrateException() throws Exception {
	throw new Exception("wrong runrate");
}

}