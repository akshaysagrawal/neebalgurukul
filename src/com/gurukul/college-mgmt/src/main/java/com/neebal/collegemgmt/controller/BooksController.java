package com.neebal.collegemgmt.controller;

import com.neebal.collegemgmt.entities.Book;
import com.neebal.collegemgmt.exceptions.ResourceNotFoundException;
import com.neebal.collegemgmt.repository.BookRepository;
import jakarta.servlet.http.PushBuilder;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookRepository bookRepository;

    //GET ALL BOOKS
//    @GetMapping
//    public ResponseEntity getAllBooks() {
//        List<Book> books = this.bookRepository.findAll();
//        return new ResponseEntity(books, HttpStatus.OK);
//    }

    @GetMapping
    @ResponseBody
    public List<Book> getAllBooks() {
         return this.bookRepository
                 .findAll()
                 .stream()
                 .map(book -> {
                     book.setTitle(book.getTitle().toUpperCase());
                     return book;
                 })
                 .collect(Collectors.toList());

    }

    //GET ONE BOOK BY ID
  /*  @GetMapping("/{bookId}")
    public ResponseEntity getBook(@PathVariable Long bookId){
        final ResponseEntity[] re = new ResponseEntity[1];
        this.bookRepository.findById(bookId)
                .ifPresentOrElse(book -> re[0]= new ResponseEntity(book,HttpStatus.OK),
                ()-> re[0] = new ResponseEntity("not found",HttpStatus.NOT_FOUND));

        return re[0];
    }*/

    //Alternate method with globalised exception

    @GetMapping("/{bookId}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Book getBook(@PathVariable Long bookId){

        Book book = this.bookRepository.findById(bookId)
                .orElseThrow(()-> new ResourceNotFoundException(
                        String.format("book with id %s not found",bookId)));
        return book;
    }

    //DELETE ONE BOOK BY ID WHICH IS NEVER ISSUED TO A STUDENT
   /* @DeleteMapping("/{bookId}")
    public ResponseEntity deleteBook(@PathVariable Long bookId){
        if(!this.bookRepository.existsById(bookId)){
            return new ResponseEntity("book not found",HttpStatus.NOT_FOUND);
        }
        this.bookRepository.deleteById(bookId);
        return new ResponseEntity("",HttpStatus.NO_CONTENT);
    }*/

    //Alternate method with globalised exception

    @DeleteMapping("/{bookId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable Long bookId){
        if(!this.bookRepository.existsById(bookId)){
            throw new ResourceNotFoundException(String.format("Book with id %s not found",bookId));
        }
        this.bookRepository.deleteById(bookId);

    }

    /*@PostMapping
    public ResponseEntity createBook(@RequestBody Book book){
       Book newBook = this.bookRepository.save(book);
       return new ResponseEntity<>(newBook,HttpStatus.CREATED);
    }*/


    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@Valid @RequestBody Book book){
        return this.bookRepository.save(book);
    }
}
