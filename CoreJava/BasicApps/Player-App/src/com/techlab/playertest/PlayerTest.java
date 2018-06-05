package com.techlab.playertest;

import com.techlab.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player("Ram", 24);
		Player player2 = new Player("Mahesh", 25);

		System.out.println(
				"PAlyer name : " + player1.getName() + " age : " + player1.getAge() + " id : " + player1.getId());
		System.out.println(
				"Player name : " + player2.getName() + " age : " + player2.getAge() + " id : " + player2.getId());
		System.out.println(player1.getId());
	}

}
