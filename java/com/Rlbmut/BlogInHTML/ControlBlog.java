package com.Rlbmut.BlogInHTML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Rlbmut.BlogInHTML.PostRepository.DataLoader;

@Controller
public class ControlBlog {
	@Autowired
	DataLoader d;
	@RequestMapping("/post")
	public String modelToString(Model m) {
		m.addAttribute("guts", "tag");
		m.addAttribute("post", d.getAllPosts());
		return "index";
	}
}
