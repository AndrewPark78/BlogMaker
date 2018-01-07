package com.Rlbmut.BlogInHTML;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface PostRepository extends CrudRepository<Post, Long> {
	@Service
	public class DataLoader {
	    
	    private PostRepository postRepo;
	    
	    @Autowired
	    public DataLoader(PostRepository postRepo) {
	   	 this.postRepo = postRepo;
	    }
	    public Iterable<Post> getAllPosts() {
			return postRepo.findAll();
		}
	    @PostConstruct
	    private void loadData() {
	    	Post p1 = new Post("First Post", "This is my first post yayy", new Date());
	    		postRepo.save(p1);
	    		Post p2 = new Post("Second Post", "This is best post of all time", new Date());
	    		postRepo.save(p2);
	    		Post p3 = new Post("Third Post", "Wow I can't believe the record was passed already", new Date());
	    		postRepo.save(p3);
	    		Post p4 = new Post("Legendary???", "I heard this lit new blog site called Rlbmut just came out its so cool", new Date());
	    		postRepo.save(p4);
	    }
	}

}
