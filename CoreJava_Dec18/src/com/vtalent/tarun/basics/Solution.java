package com.vtalent.tarun.basics;

import java.util.*;

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
			//s.nextLine();
			movie[i] = new Movie(movieId, director, rating, budget);
			int output1 = findAvgBudgetByDirector(movie, director);
			if (output1 == 0) {
				System.out.println("Sorry the director nnot directed any movie");
			} else {
				System.out.println(output1);
			}
			Movie output2 = getmovieByRatingbudget(movie, rating, budget);
			if (output2 == null) {
				System.out.println("Sorry, no movie avlb with specified rating and budget req");
			} else {
				System.out.println(output2);
			}
		}
	}

	public static int findAvgBudgetByDirector(Movie[] movie, String director) {
			int avg = 0;
			int sum =0;
			for(int i = 0 ; i<movie.length;i++) {
				if (movie[i].getDirector().equalsIgnoreCase(director)) {
					sum = sum + movie[i].getBudget();
				}
			}
			avg = sum/2;
			return avg;
			
		}

	public static Movie getmovieByRatingbudget(Movie[] movie, int rating, int budget) {
		Movie movie2 = null;
		for (int i = 0; i < movie.length; i++) {
			if (movie[i].getRating() == movie[i].getBudget() && movie[i].getBudget() % movie[i].getRating() == 0) {
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
