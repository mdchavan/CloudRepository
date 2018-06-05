package com.techlab.player;

public class Player {
	static int playerid;
	private int id;
	private int age;
	private String name;
	static {
		playerid = 1000;
	}

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = ++playerid;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

}
