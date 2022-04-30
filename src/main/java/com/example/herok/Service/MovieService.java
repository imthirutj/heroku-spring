package com.example.herok.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.herok.Entity.MovieEntity;
import com.example.herok.Repo.MovieRepo;

@Service
public class MovieService {

	@Autowired
	private MovieRepo movieRepo;
	
public List<MovieEntity> getMovie(){
		
		List<MovieEntity> movieList= new ArrayList<>();
		
		movieRepo.findAll().forEach(p->movieList.add(p));
		return movieList;
	}
}
