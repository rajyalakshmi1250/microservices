package com.capgemini.movieinfoservice.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieinfoservice.entity.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	
	private List<Movie> movies;
	
	public MovieInfoController() {
		movies = new ArrayList<Movie>();
		movies.add(new Movie(101, "titanic", "relases in 1999"));
		movies.add(new Movie(102, "the matrix", "relases in 1991"));
		movies.add(new Movie(103, "the shift", "relases in 1992"));
		movies.add(new Movie(104, "the peaceful", "relases in 1993"));
	}
	
	@GetMapping("/{movieId}")
	public ResponseEntity<Movie> getMovieInfo(@PathVariable int movieId){
		
		
		
		for(Movie movie: movies) {
			if(movie.getMovieId()==movieId)
				return new ResponseEntity<Movie>(movie, HttpStatus.OK);
		}
		return new ResponseEntity<Movie>( HttpStatus.NOT_FOUND);
		
		
		
	}

}
