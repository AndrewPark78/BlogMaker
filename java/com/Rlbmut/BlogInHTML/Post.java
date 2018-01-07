package com.Rlbmut.BlogInHTML;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {
	@Id
	@GeneratedValue
	Long id;
	String title;
	String body;
	Date postedOn;

	Post() {

	}

	public Post(String title, String body, Date postedOn) {
		this.title = title;
		this.body = body;
		this.postedOn = postedOn;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public Date getPostedOn() {
		return postedOn;
	}
}
