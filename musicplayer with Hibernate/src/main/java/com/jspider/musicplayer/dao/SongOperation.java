package com.jspider.musicplayer.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;
import org.hibernate.internal.StaticFilterAliasGenerator;

import com.jspider.musicplayer.dto.Songs;

public class SongOperation {
	private static Player player = new Player();
	private static EntityManager entityManager;
	private static EntityManagerFactory entityManagerFactory;
	private static EntityTransaction entityTransaction;
	private static Scanner scanner = new Scanner(System.in);
	private static Query creatQuery;
	private static String query;
	private List<Songs> songList;

	Songs songs = new Songs();

	/// ArrayList<Songs> playList = new ArrayList<Songs>();

	// Add Songs
	// *******************************Hibernate Conection
	// Start***********************
	public static void openconnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("Musicplayer");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}
	// ********************************Hibernate Conection
	// End************************

	public static void clossConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			try {
				entityTransaction.rollback();
				;
			} catch (TransactionException e) {
				System.out.println("Trasanction is commited");
			}
		}
	}

	public int numberOfSongs() {
		query = "from Songs";
		Query creatQuery = entityManager.createQuery(query);
		List<Songs> songsList = creatQuery.getResultList();
		int numOfSongs = songsList.size();
		return numOfSongs;

	}

	public void addSongs() {
		openconnection();
		entityTransaction.begin();
		// Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Song Id : ");
		int id = scanner.nextInt();
		songs.setId(id);

		System.out.print("Enter Song Name : ");
		songs.setName(scanner.next());

		System.out.print("Enter Song Movie/Album : ");
		songs.setMovie(scanner.next());

		System.out.print("Enter Song Length : ");
		songs.setLength(scanner.nextFloat());

		System.out.print("Enter  Singer Name : ");
		songs.setSinger(scanner.next());

		System.out.print("Enter Song Composer Name : ");
		songs.setCompose(scanner.next());

		System.out.print("Enter Song lyrics Creater Name : ");
		songs.setLyrics(scanner.next());

		entityManager.persist(songs);
		entityTransaction.commit();
		System.out.println("Song Added Successfull.");
	}

	// View All Songs
	public List<Songs> viewAllSongs() {
		openconnection();
		entityTransaction.begin();
		if (numberOfSongs() > 0) {
			System.out.println("List Of All Songs :-");
			query = "from Songs";
			creatQuery = entityManager.createQuery(query);
			List<Songs> songsList = creatQuery.getResultList();
			for (int i = 0; i < songsList.size(); i++) {
				System.out.println(songsList.get(i));
			}
			return songsList;
		} else {
			System.out.println("\nSorry! Song Is Not Present.\n Please Add Songs First. ");
			return songList;
		}

	}

	// Play All Songs
	public void playAllSongs() {
		openconnection();
		entityTransaction.begin();

		if (numberOfSongs() > 0) {

//			query = "fron songs";
//			creatQuery = entityManager.createQuery(query);
//			List<Songs> songsList = creatQuery.getResultList();

//	****************************** Working Here *************************

			query = "from Songs";
			creatQuery = entityManager.createQuery(query);
			List<Songs> songsList = creatQuery.getResultList();
			for (int i = 0; i < songsList.size(); i++) {
//				System.out.println(songsList.get(i).getName());
				System.out.println("Now " + songsList.get(i).getName() + " Song Playing....");
				System.out.println("Zingg...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("\nSorry! Song Is Not Present.\n Please Add Songs First. ");

		}
	}

	// Play Random Songs
	public void playRandomSongs() {
		openconnection();
		entityTransaction.begin();

		if (numberOfSongs() > 0) {

			int random = 0;
			for (int i = 1; i <= numberOfSongs(); i++) {
				random = (int) (Math.random() * 10);
				if (random <= numberOfSongs() && random != 0) {
					songs = entityManager.find(Songs.class, random);
					System.out.println("Now " + songs.getName() + " Song Playing....");
					System.out.println("Zingg...");

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("\nSorry! Song Is Not Present... ");
		}

	}

//	// Select Song
	public void selectSong() {
		openconnection();
		entityTransaction.begin();
		songList = viewAllSongs();

		System.out.println("\nWhich Song you want to play please choose Song Id :- ");
		int choise = scanner.nextInt();
		
// **************** Work  for check song id is present or not*********************//

//		query = "id from songs where name='d'";
//		creatQuery = entityManager.createQuery(query);
//		List songsId = creatQuery.getResultList();
//		for (int i = 0; i < songsId.size(); i++) {
////		songs = entityManager.find(Songs.class, songsId);
//		System.out.println(songsId.get(i));
//			
//		}
		
		
// ************************** End *************************************//
		if (numberOfSongs() > 0) {

			songs = entityManager.find(Songs.class, choise);
			System.out.println("Now " + songs.getName() + " Song Playing....");
			System.out.println("Zingg...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

//**************************DELETE**********************
	// Delete Song
	public void deleteSongs(int choise) {
		openconnection();
		entityTransaction.begin();
		if (numberOfSongs() > 0) {

			songs = entityManager.find(Songs.class, choise);
			entityManager.remove(songs);
			entityTransaction.commit();
			System.out.println("Song Deleted Successfully");
		}

	}

	// Edit Song
	public void editSong() {
		openconnection();
		entityTransaction.begin();
		if (numberOfSongs() > 0) {

			songList = viewAllSongs();// geting all Songs but yet not get
			System.out.print("Which song you want to Edit Choose No. :- ");
			songs = entityManager.find(Songs.class, scanner.nextInt());// choosing Song for delete
			System.out.println("What you want to Edit :-");
			System.out.println(
					"\n 1 : id\n 2 : Song name\n 3 : Movie/Album name \n 4 : Length\n 5 : Singer \n 6 : Composer\n 7 : Lyrics Creater\n 8 : Back");
			int choise = scanner.nextInt();
			switch (choise) {
			case 1:
				System.out.print("Enter Song Id : ");
				songs.setId(scanner.nextInt());
				entityManager.persist(songs);
				entityTransaction.commit();
				System.out.println("Song Id Updated Successfull.");

				break;
			case 2:
				System.out.print("Enter Song Name : ");
				songs.setName(scanner.next());
				entityManager.persist(songs);
				entityTransaction.commit();
				System.out.println("Song Name Updated Successfull.");
				break;

			case 3:
				System.out.print("Enter Song Movie/Album : ");
				songs.setMovie(scanner.next());
				entityManager.persist(songs);
				entityTransaction.commit();
				System.out.println(" Movie/Album Updated Successfull.");
				break;

			case 4:
				System.out.print("Enter Song Length : ");
				songs.setLength(scanner.nextFloat());
				entityManager.persist(songs);
				entityTransaction.commit();
				System.out.println("Length Updated Successfull.");
				break;

			case 5:
				System.out.print("Enter Song Singer Name : ");
				songs.setSinger(scanner.next());
				entityManager.persist(songs);
				entityTransaction.commit();
				System.out.println("Singer Updated Successfull.");
				break;

			case 6:
				System.out.print("Enter Song Composer Name : ");
				songs.setCompose(scanner.next());
				entityManager.persist(songs);
				entityTransaction.commit();
				System.out.println("composer Updated Successfull.");
				break;

			case 7:
				System.out.print("Enter Song lyrics Creater Name : ");
				songs.setLyrics(scanner.next());
				entityManager.persist(songs);
				entityTransaction.commit();
				System.out.println("Lyrics Updated Successfull.");
				break;

			default:
				System.out.println("Invalid choise...");
				break;
			}
		}

	}

}
