package com.jspider.musicplayer.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Songs {
	@Id
	private int id;
	private String name;
	private String movie;
	private float length;
	private String singer;
	private String compose;
	private String lyrics;

	@Override
	public String toString() {
		return "\nSongs :- " + " Song id= " + id + " Song Name= " + name + " Movie= " + movie + " Length of Song= "
				+ length + " singer Name= " + singer + " Composer Of Song= " + compose + " lyrics Of Song= " + lyrics;
	}

}
