package com.Rlbmut.BlogInHTML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Rlbmut.BlogInHTML.PostRepository.DataLoader;

@SpringBootApplication
public class RlbmutBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(RlbmutBlogApplication.class, args);
	
	}
}
