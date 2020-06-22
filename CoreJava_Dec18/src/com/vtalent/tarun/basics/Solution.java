package com.vtalent.tarun.basics;

//import java.io.*;
import java.util.*;
/*import java.text.*;
import java.math.*;
import java.util.regex.*;*/

public class Solution {

	public static void main(String[] args) {
		Movie[] movie = new Movie[4];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < movie.length; i++) {
			int movieId = s.nextInt();
			s.nextLine();
			String director = s.nextLine();
			int rating = s.nextInt();
			int budget = s.nextInt();
			movie[i] = new Movie(movieId, director, rating, budget);
		}
		s.nextLine();
		String nm = s.nextLine();
		int um = s.nextInt();
		int dm = s.nextInt();
			int output1 = findAvgBudgetByDirector(movie, nm);
			if (output1 == 0) {
				System.out.println("Sorry the director not directed any movie");
			} else {
				System.out.println(output1);
			}
			Movie output2 = getmovieByRatingbudget(movie, um, dm);
			if (output2 == null) {
				System.out.println("Sorry, no movie avlb with specified rating and budget req");
			} else {
				System.out.println(output2.getMovieId());
			}
		}
	public static int findAvgBudgetByDirector(Movie[] movie, String nm) {
//			int avg = 0;
//			int sum =0;
//			for(int i = 0 ; i<movie.length;i++) {
//				if (movie[i].getDirector().equalsIgnoreCase(director)) {
//					sum = sum + movie[i].getBudget();
//				}
//			}
//			avg = sum/2;
//			return avg;
//			
//		}
	int avg, s = 0, j = 0;
	for (int i = 0; i < movie.length; i++) {
		if (nm.equalsIgnoreCase(movie[i].getDirector())) {
			s = s + movie[i].getBudget();
			j++;
		}
	}
	if (j > 0) {
		avg = s / j;
		return avg;
	} else
		return 0;
}

	public static Movie getmovieByRatingbudget(Movie[] movie, int rating, int budget) {
		Movie movie2 = null;
		for (int i = 0; i < movie.length; i++) {
			if ((movie[i].getRating() == rating) && (movie[i].getBudget() == budget) && (movie[i].getBudget() % movie[i].getRating() == 0)) {
				movie2 = movie[i];
				break;
			}
		}
		return movie2;
	}
}
class Movie {
	private int movieId;
	private String director;
	private int rating;
	private int budget;
	public Movie(int movieId, String director, int rating, int budget) {
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
