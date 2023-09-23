package com.neebal.practicespringcore.service;

import com.neebal.practicespringcore.entities.Movie;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MovieDetailsService {

    private Map<String, Movie> moviesMap;

    public MovieDetailsService(){
        this.moviesMap = new HashMap<>();
        this.moviesMap.put("Terminator 2",new Movie("Terminator 2","Movie on robots",4));
        this.moviesMap.put("3 idiots",new Movie("3 idiots","Movie on study",4));
        this.moviesMap.put("Dhoom",new Movie("Dhoom","Movie on bike",3));
        this.moviesMap.put("Titanic",new Movie("Titanic","Movie on ship",4));
        this.moviesMap.put("Avatar",new Movie("Avatar","Movie on aliens",4));

    }

    public Map<String, Movie> getMoviesMap() {
        return moviesMap;
    }

    public Movie getMovieDetails(String title){
        return this.moviesMap.get(title);
    }
}
