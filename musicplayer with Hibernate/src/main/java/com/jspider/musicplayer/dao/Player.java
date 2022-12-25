package com.jspider.musicplayer.dao;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jspider.musicplayer.dto.Songs;

import lombok.Data;

@Data
public class Player {

	private Scanner scanner;
	private static SongOperation operation = new SongOperation();
	static boolean loop = true;

	// ************ main() Method *********************//
	
	public static void main(String[] args) {

		Player player = new Player();

		while (loop) {
			try {
				player.player();
				System.out.println();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("\nWrong Input...");
				player.player();
			}
		}

	}

	// player method
	public void player() {

		scanner = new Scanner(System.in);
		System.out.println(
				"\nPlease chose following operation :-\n1 :- Add/Remove Songs\n2 :- Play a Songs\n3 :- Edit a Songs\n4 :- View Songs\n5 :- Exist ");
		int choise = scanner.nextInt();
		switch (choise) {
		case 1:// for Add/Remove songs
			System.out.println("\nChoose  :-\n 1 :- Add Songs\n 2 :- Remove a Songs\n 3 :- Back ");
			choise = scanner.nextInt();
			switch (choise) {
			case 1:// add Songs
				System.out.print("\nHow many Songs you want you to add :- ");
				choise = scanner.nextInt();
				while (choise > 0) {
					try {
						operation.addSongs();
					} catch (InputMismatchException e) {
						System.out.println("\nWrong Input...\nPlease Check Data Type\n");
						break;
					}
					// call add method

					System.out.println();
					choise--;
				}
				// operation.viewAllSongs();

				loop = true;
				break;
			case 2:// for Remove Songs
				operation.viewAllSongs();
				// System.out.println(operation.viewAllSongs());
				System.out.print("\nWhich song you want to Delete Please Choose a Song Id. :- ");
				choise = scanner.nextInt();
				operation.deleteSongs(choise);// delete method call by passing choise number
				break;
			case 3:// for Back Home
				player();
				break;
			default:
				System.out.println("\nInvalid Input ");
				break;
			}

			break;
		case 2:// for Play a Songs

			System.out.println(
					"\nchoose following Operation :- \n1 :- Play All Song\n2 :- Play Random Songs\n3 :- Select Song to Play\n4 :- Back");
			choise = scanner.nextInt();
			switch (choise) {
			case 1:// PlayAll songs

				operation.playAllSongs();

				break;
			case 2:// Play Random Songs
				operation.playRandomSongs();

				break;
			case 3:// select Song to Play
				//operation.viewAllSongs();
				operation.selectSong();
				break;
			case 4:
				player();
				break;

			default:
				System.out.println("\nInvalid choise...");
				loop = true;
				break;
			}

			break;
		case 3:// Edit a Songs
				// operation.viewAllSongs();
			try {
				operation.editSong();

			} catch (InputMismatchException e) {
				System.out.println("\nWrong Input..");
			}
			break;
		case 4:
			operation.viewAllSongs();
			break;
		case 5:
			loop = false;
			System.out.println("\nThank You.");
			break;
		default:
			System.out.println("\nInvalid choise...");
			break;
		}

	}

}
