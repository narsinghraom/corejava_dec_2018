package com.vtalent.rakesh;

public class Plant {
	private String name;

	public Plant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public class Tree extends Plant {
		public Tree(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		public void growFruit() {
		}

		public void dropLeaves() {
		}
	}
}