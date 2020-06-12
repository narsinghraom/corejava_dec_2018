package com.vtalent.tarun.basics;

import java.util.Scanner;

public class Solution2 {
	

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Movie2[] mov = new Movie2[4];
		for (int i = 0; i < mov.length; i++) {
			int movieId = s.nextInt();s.nextLine();
			String director = s.nextLine();
			int rating = s.nextInt();
			int budget = s.nextInt();
			s.nextLine();
			mov[i] = new Movie2(movieId, director, rating, budget);
		}
			String director = null;
			int output1 = findAvgBudgetByDirector(mov, director);
			if (output1 == 0) {
				System.out.println("Sorry the director nnot directed any movie");
			} else {
				System.out.println(output1);
			}
			int budget;
			int rating;
			Movie2 output2 = getmovieByRatingbudget(mov, rating, budget);
			if (output2 == null) {
				System.out.println("Sorry, no movie avlb with specified rating and budget req");
			} else {
				System.out.println(output2);
			}
		}


	public static int findAvgBudgetByDirector(Movie2[] mov, String director) {
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < mov.length; i++) {
			if (mov[i].getDirector().equalsIgnoreCase(director)) {
				sum = sum + mov[i].getBudget();
			}
		}
		avg = sum / 2;
		return avg;

	}

	public static Movie2 getmovieByRatingbudget(Movie2[] mov, int rating, int budget) {
		Movie2 movie3 = null;
		for (int i = 0; i < mov.length; i++) {
			if (mov[i].getRating() == mov[i].getBudget() && mov[i].getBudget() % mov[i].getRating() == 0) {
				movie3 = mov[i];
				break;
			}
		}
		return movie3;
	}
}

class Movie2 {
	int movieId;
	String director;
	int rating;
	int budget;

	public Movie2(int movieId, String director, int rating, int budget) {
		super();
		this.movieId = movieId;
		this.director = director;
		this.rating = rating;
		this.budget = budget;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

}
