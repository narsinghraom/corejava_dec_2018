package com.vtalent.rakesh;

class Hotel {
	public int bookings = 2;

	public void book() {
		bookings++;
	}
}

public class SuperHotel extends Hotel {
	public void book() {
		bookings--;
	}

	public void book(int size) {
		book();
		super.book();
		bookings += size;
	}

	public static void main(String args[]) {
		SuperHotel Shotel = new SuperHotel();
		Shotel.book(2);
		System.out.print(Shotel.bookings);
	}
}
