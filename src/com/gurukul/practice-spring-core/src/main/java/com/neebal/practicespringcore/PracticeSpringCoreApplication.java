package com.neebal.practicespringcore;

import com.neebal.practicespringcore.service.SurpriseMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PracticeSpringCoreApplication implements CommandLineRunner {

	@Autowired
	private SurpriseMeService surpriseMeService;
	@Autowired
	private SurpriseMeService surpriseMeService1;

	public static void main(String[] args) {

		SpringApplication.run(PracticeSpringCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter Username");
			String username = scanner.nextLine();
			System.out.println("welcome "+username);

			//System.out.println(new SurpriseMeService().getMovie()); //do not use this bcoz new keyword not allowed

			System.out.println(this.surpriseMeService.getMovie());
			System.out.println(this.surpriseMeService1.getMovie());
		}
	}
}
