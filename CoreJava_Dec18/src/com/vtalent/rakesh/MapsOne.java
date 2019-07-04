package com.vtalent.rakesh;

import java.util.HashMap;
import java.util.Map;

public class MapsOne {
	public static void main(String[] args) {

		HashMap<Integer, Integer> mapRef = new HashMap<>();
		mapRef.put(1, 2);
		mapRef.put(2, 2);
		mapRef.put(2, 2);
		for (Map.Entry<Integer, Integer> mapobj : mapRef.entrySet()) {
			System.out.println(mapobj.getKey() + "" + mapobj.getValue());
		}
		HashMap<String, String> mapRef1 = new HashMap<>();
		mapRef1.put("r", "a");
		for (Map.Entry<String, String> mapobj : mapRef1.entrySet()) {
			System.out.println(mapobj.getKey() + "" + mapobj.getValue());
		}
		HashMap<Double, Double> mapRef2 = new HashMap<>();
		mapRef2.put(0.0, 5.1);
		for (Map.Entry<String, String> mapobj : mapRef1.entrySet()) {
			System.out.println(mapobj.getKey() + "" + mapobj.getValue());
		}
	}

}