package com.example.herok.Controller;

import com.example.herok.Entity.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.herok.Service.*;


@RestController
public class HomeController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/")
	public String hello() {
		return "Hello guys...";
	}
	
	@GetMapping("get")
	public List<MovieEntity> getMovie(){
		return movieService.getMovie();
	}


	
}
