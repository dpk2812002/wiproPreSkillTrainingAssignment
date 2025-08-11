package com.example.movie_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie_service.model.Movie;
import com.example.movie_service.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAllMovies(){
	return movieRepository.findAll();
	}
	
	public Optional<Movie> getMovieById(Long id) {
		return movieRepository.findById(id);
	}
	
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public void deleteMovie(Long id) {
		movieRepository.deleteById(id);	
	}

}
