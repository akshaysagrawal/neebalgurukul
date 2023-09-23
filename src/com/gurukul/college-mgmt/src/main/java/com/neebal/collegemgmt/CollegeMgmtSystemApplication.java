package com.neebal.collegemgmt;

import com.neebal.collegemgmt.entities.Book;
import com.neebal.collegemgmt.entities.Student;
import com.neebal.collegemgmt.repository.BookRepository;
import com.neebal.collegemgmt.repository.BookStudentRepository;
import com.neebal.collegemgmt.repository.StudentRepository;
import com.neebal.collegemgmt.services.BookStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableAsync
public class CollegeMgmtSystemApplication /*implements CommandLineRunner */{

//	@Autowired
//	private BookRepository bookRepository;

//	@Autowired
//	private StudentRepository studentRepository;
//
//	@Autowired
//	private BookStudentService bookStudentService;



	public static void main(String[] args) {
		SpringApplication.run(CollegeMgmtSystemApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		//save a new book
//		/*Book book = new Book("prog in java",900,1500.0);
//		book = this.bookRepository.save(book);
//		System.out.println(book.getId());*/
//
//		// save multiple books
//		/*Book b1 = new Book("prog in python",1000,3400.0);
//		Book b2 = new Book("groovy in action",450,1004.0);
//		List<Book> books = Arrays.asList(b1,b2);
//		this.bookRepository.saveAll(books);*/
//
//		//query for the book by id
//		/*this.bookRepository.findById(1l).ifPresentOrElse(book -> System.out.println(book),
//				()-> System.out.println("book not found"));*/
//
//		//update a book whose id is 2
//		/*this.bookRepository.findById(2l).ifPresentOrElse(book -> {book.setPages(800);this.bookRepository.save(book);},
//		()-> System.out.println("book not found"));*/
//
//		//delete a book whose id is 3
////		this.bookRepository.deleteById(3l);
//
//		//query for all the books
////		this.bookRepository.findAll().forEach(book -> System.out.println(book));
//
//
//		//count of all the books
////		System.out.println(this.bookRepository.count());
//
//		//whether a book with id 1 exists in db or not
//		//System.out.println(this.bookRepository.existsById(1l));
//		//System.out.println(this.bookRepository.existsById(5l));
//
//		//find all books by price 3400
////		this.bookRepository.findBookByPrice(3400.0).forEach(book -> System.out.println(book));
//
//		//find all books by price greater than 1000
////		this.bookRepository.findBookByPriceGreaterThan(1000.0).forEach(book -> System.out.println(book));
//
//		//find all books by price greater than 1000 and pages less than 900
//		/*this.bookRepository.findBookByPriceGreaterThanAndPagesLessThan(1000.0,900).
//				forEach(book -> System.out.println(book));*/
//
//		//count of all the books where pages is greater than 200
////		System.out.println(bookRepository.countBookByPagesGreaterThan(200));
//
//		//find all books that have the word prog in their title sorted in the desc order of price
//		/*bookRepository.findBookByTitleContainingOrderByPriceDesc("prog").
//				forEach(book -> System.out.println(book));*/
//
//		//check whether a book exists whose title starts with prog
////		System.out.println(bookRepository.existsBookByTitleStartingWith("prog"));
//
//		//query for title,price of all books whose pages greater than 200
//		/*bookRepository.findBookByPagesGreaterThan(200).forEach(bookTitlePrice ->
//				System.out.println(bookTitlePrice.getTitle()+" "+bookTitlePrice.getPrice()));*/
//
//		//group the books by price and find the count of the groups
//		/*bookRepository.groupByPriceCountBooks().forEach(objectArray ->
//				System.out.println(objectArray[0]+" "+objectArray[1]));*/
//
//		//using named queries
////		this.bookRepository.queryBookByPriceLessThanEqual(2000.0)
////				.forEach(book -> System.out.println(book));
//
////		Student s1 = new Student("ram","ram123",'M');
////		Student s2 = new Student("ankita","ankita123",'F');
////		Student s3 = new Student("mohan","mohan123",'M');
////		List<Student> students = Arrays.asList(s1,s2,s3);
////		this.studentRepository.saveAll(students);
//
//		this.bookStudentService.issueBook(2l,3l);
//		//this.bookStudentService.returnBook(2l,3l);
//		//this.bookStudentService.transferBook(2l,2l,1l);
//	}
}
