package com.example.GatewayDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Film {
	private String title;
	private String actors;
	
	public Film() {
		super();
	}

	public Film(String title, String actors) {
		super();
		this.title = title;
		this.actors = actors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}
}
