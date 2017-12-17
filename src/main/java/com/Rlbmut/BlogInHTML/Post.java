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

	Post(String title, String body, Date postedOn) {

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
