package com.neebal.practicespringcore.service;

import com.neebal.practicespringcore.entities.Movie;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
//Every spring managed bean by default is Singleton scope----ie it is only created once for every usage.
//@Scope("prototype") //for every usage a new object is being created by the spring container
public class SurpriseMeService {

    private List<String> movieTitles;
    private Random random;

    //Dependency injection (DI)
    //Inversion of Control (IOC)
    /*@Autowired //property injection
    private MovieDetailsService movieDetailsService;*/


    private MovieDetailsService movieDetailsService;

   /* public SurpriseMeService(MovieDetailsService movieDetailsService){
        System.out.println("SurpriseMeService Object created by spring framework");

        // Constructor Injection
        this.movieDetailsService = movieDetailsService;
        this.movieTitles = Arrays.asList(
                "Terminator 2",
                "3 idiots",
                "Dhoom",
                "Titanic",
                "Avatar"
        );
        this.random = new Random();
    }*/

    public SurpriseMeService(){
        System.out.println("SurpriseMeService Object created by spring framework");

        this.movieTitles = Arrays.asList(
                "Terminator 2",
                "3 idiots",
                "Dhoom",
                "Titanic",
                "Avatar"
        );
        this.random = new Random();

        //avoid
        //dependencies injectiov graph gets copleted once all constructors finish running
       // System.out.println(this.movieDetailsService.getMoviesMap());
    }

    @PostConstruct //runs after the constructor has finished running
    // and the dependency injection graph is initialized
    public void init(){
        System.out.println(this.movieDetailsService.getMoviesMap());
    }

    @PreDestroy  //runs just before the method is destroyed
    public void cleanup() {
        System.out.println("byeee !!!");
    }

    // Setter injection
    @Autowired
    public void setMovieDetailsService(MovieDetailsService movieDetailsService) {
        this.movieDetailsService = movieDetailsService;
    }

    //business function
    public Movie getMovie() {
        int r = this.random.nextInt(this.movieTitles.size());
        String title = this.movieTitles.get(r);
        return this.movieDetailsService.getMovieDetails(title);

    }
}
