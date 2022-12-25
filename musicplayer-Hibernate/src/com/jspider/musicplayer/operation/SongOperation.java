package com.jspider.musicplayer.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.musicplayer.song.Songs;

public class SongOperation {

	ArrayList<Songs> playList = new ArrayList<Songs>();

	// Add Songs
	public ArrayList<Songs> addSongs() {
		Songs songs = new Songs();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Song Id : ");
		int id = scanner.nextInt();
		songs.setId(id);

		System.out.print("Enter Song Name : ");
		String name = scanner.next();
		songs.setName(name);

		System.out.print("Enter Song Movie/Album : ");
		String movie = scanner.next();
		songs.setMovie(movie);

		System.out.print("Enter Song Length : ");
		float length = scanner.nextFloat();
		songs.setLength(length);

		System.out.print("Enter  Singer Name : ");
		String singer = scanner.next();
		songs.setSinger(singer);

		System.out.print("Enter Song Composer Name : ");
		String composer = scanner.next();
		songs.setCompose(composer);

		System.out.print("Enter Song lyrics Creater Name : ");
		String lyrics = scanner.next();
		songs.setLyrics(lyrics);
		playList.add(songs);
		System.out.println("\nSongs Added Successfull.");

		return (ArrayList<Songs>) playList;
	}

	// View All Songs
	public ArrayList<Songs> viewAllSongs() {
		if (playList.isEmpty()) {
			System.out.println("Sorry Song is Not Available in Playlist.");
		} else {
			System.out.println("List Of All Songs :-");
			for (int i = 0; i < playList.size(); i++) {

				System.out.println(i + 1 + " : " + playList.get(i));

			}
		}

		// System.out.println("By");
		return playList;
	}

	// Play All Songs
	public void playAllSongs() {
		if (playList.isEmpty()) {
			System.out.println("Sorry Song is Not Available in Playlist.");
		} else {
			for (int i = 0; i < playList.size(); i++) {

				System.out.println("Now " + playList.get(i) + " Song Playing....");
				try {
					System.out.println("Zingg...");
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}
	}

	// Play Random Songs
	public void playRandomSongs() {
		if (playList.isEmpty()) {
			System.out.println("Sorry Song is Not Available in Playlist.");
		} else {

			// System.out.println(random);
			for (int i = 0; i < 10; i++) {
				int random = (int) (Math.random() * 10);
				if (random < playList.size()) {
					System.out.println("Now " + playList.get(random) + " Song Playing....");
					try {
						System.out.println("Zingg...");
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

				}

			}

		}

	}

	// Select Song
	public void selectSong(int choise) {

		System.out.println("Now " + playList.get(choise - 1) + " Song Playing....");
		try {
			System.out.println("Zingg...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	// Delete Song
	public void deleteSongs(int choise) {
		if (playList.isEmpty()) {
			System.out.println("Sorry Song is Not Available in Playlist.");
		} else {
			if (choise <= playList.size()) {
				System.out.println(playList.get(choise - 1) + " Delete Successfully,");
				playList.remove(choise - 1);
			} else {
				System.out.println(choise + " is Not Present in List.");
			}

		}

	}

	// Edit Song
	public void editSong() {
		if (playList.isEmpty()) {
			System.out.println("Sorry Song is Not Available in Playlist.");
		} else {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Which song you want to Edit Choose No. :- ");
			int songNo = scanner.nextInt();
			System.out.println("What you want to Edit :-");
			System.out.println(
					"\n 1 : id\n 2 : Song name\n 3 : Movie/Album name \n 4 : Composer\n 5 : Length \n 6 : Lyrics Creater\n 7 : Back");
			int choise = scanner.nextInt();
			switch (choise) {
			case 1:
				System.out.print("Enter Song Id : ");
				playList.get(songNo - 1).setId(scanner.nextInt());
				break;
			case 2:
				System.out.print("Enter Song Name : ");
				playList.get(songNo - 1).setName(scanner.next());
				break;
			case 3:
				System.out.print("Enter Song Movie/Album : ");
				playList.get(songNo - 1).setMovie(scanner.next());
				break;
			case 4:
				System.out.print("Enter Song Composer Name : ");
				playList.get(songNo - 1).setCompose(scanner.next());
				break;
			case 5:
				System.out.print("Enter Song Length : ");
				playList.get(songNo - 1).setLength(scanner.nextFloat());
				break;
			case 6:
				System.out.print("Enter Song lyrics Creater Name : ");
				playList.get(songNo - 1).setLyrics(scanner.next());
				break;
			case 7:
				break;

			default:
				System.out.println("Invalid choise...");
				break;
			}
			System.out.println("Update Successfull.");

		}
	}

}
