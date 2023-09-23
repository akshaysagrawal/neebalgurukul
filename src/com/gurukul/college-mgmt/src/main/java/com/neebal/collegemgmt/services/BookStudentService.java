package com.neebal.collegemgmt.services;

import com.neebal.collegemgmt.entities.Book;
import com.neebal.collegemgmt.entities.BookStudent;
import com.neebal.collegemgmt.entities.Student;
import com.neebal.collegemgmt.exceptions.BookAlreadyIssuedException;
import com.neebal.collegemgmt.exceptions.BookNotIssuedException;
import com.neebal.collegemgmt.exceptions.ResourceNotFoundException;
import com.neebal.collegemgmt.repository.BookRepository;
import com.neebal.collegemgmt.repository.BookStudentRepository;
import com.neebal.collegemgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;
import java.util.Set;


@Service
public class BookStudentService {


    private BookRepository bookRepository;


    private StudentRepository studentRepository;

    private BookStudentRepository bookStudentRepository;

    public BookStudentService(
            BookRepository bookRepository,
            StudentRepository studentRepository,
            BookStudentRepository bookStudentRepository
    ) {
        this.bookRepository = bookRepository;
        this.studentRepository = studentRepository;
        this.bookStudentRepository = bookStudentRepository;
    }

    // Self injection to call business methods within the same service class
    @Autowired
    @Lazy  //to avoid circular dependency error in case of self injection
    private BookStudentService bookStudentService;

   @Autowired
    private SendEmailService sendEmailService;

    @Transactional
    public BookStudent issueBook(Long bookId, Long studentId) {

//        Optional<Book> o1 = bookRepository.findById(bookId);
//        if(o1.isEmpty()){
//            throw new ResourceNotFoundException(
//            String.format("Book with id %s not found",bookId));
//        }
//
//        Optional<Student> o2 = studentRepository.findById(studentId);
//        if (o2.isEmpty()){
//            throw new ResourceNotFoundException(
//            String.format("Student with id %s not found",studentId));
//        }
//
//        Book book = o1.get();
//        Student student = o2.get();

        //Alternate method

       Book book =  bookRepository.findById(bookId)
                .orElseThrow(()-> new ResourceNotFoundException(
                        String.format("Book with id %s not found",bookId)));

       Student student = studentRepository.findById(studentId)
               .orElseThrow(()-> new ResourceNotFoundException(
            String.format("Student with id %s not found",studentId)));

        Set<BookStudent> bookStudents = student.getBooksIssued();
        long c = bookStudents.stream().filter(bookStudent -> bookStudent.getBook() == book && bookStudent.getReturnDate()==null).count();
        if (c > 0) {
            throw new BookAlreadyIssuedException(
                    String.format("Book %s has already been issued to id %s, can not reissue",book.getTitle(),student.getUsername())
            );
        }

        BookStudent bookStudent = new BookStudent(book, student, new Date());
        this.bookStudentRepository.save(bookStudent);

        String email = "akshaysagrawal99@gmail.com";
        sendEmailService.sendEmail(email,"Books was successfully issued");

        System.out.println("Book issued successfully");

        return bookStudent;

   }

   @Transactional
   public BookStudent returnBook(Long bookId, Long studentId){
        Book book =  bookRepository.findById(bookId)
               .orElseThrow(()-> new ResourceNotFoundException(
                       String.format("Book with id %s not found",bookId)));

       Student student = studentRepository.findById(studentId)
               .orElseThrow(()-> new ResourceNotFoundException(
                       String.format("Student with id %s not found",studentId)));

       Set<BookStudent> bookStudents = student.getBooksIssued();
       long c = bookStudents.stream().filter(bookStudent -> bookStudent.getBook() == book && bookStudent.getReturnDate()==null).count();
       if (c == 0) {
           throw new BookNotIssuedException(
                   String.format("Book %s not yet issued to student id %s",bookId,studentId)
           );
       }

       BookStudent bookStudent = bookStudentRepository.findBookStudentByBookAndStudentAndReturnDateIsNull(
               book,
               student
       );
       bookStudent.setReturnDate(new Date());
       this.bookStudentRepository.save(bookStudent);

       return bookStudent;
   }

   /* @Transactional
    public void transferBook(Long bookId, Long fromStudentId, Long toStudentId){

        Book book =  bookRepository.findById(bookId)
                .orElseThrow(()-> new ResourceNotFoundException(
                        String.format("Book with id %s not found",bookId)));

        // From Student

        Student fromStudent = studentRepository.findById(fromStudentId)
                .orElseThrow(()-> new ResourceNotFoundException(
                        String.format("Student with id %s not found",fromStudentId)));


        Set<BookStudent> bookStudents1 = fromStudent.getBooksIssued();
        long c1 = bookStudents1.stream().filter(bookStudent -> bookStudent.getBook() == book && bookStudent.getReturnDate()==null).count();
        if (c1 == 0) {
            throw new BookNotIssuedException(
                    String.format("Book %s not yet issued to student id %s",book.getTitle(),fromStudent.getUsername())
            );
        }

        BookStudent bookStudent = bookStudentRepository.findBookStudentByBookAndStudentAndReturnDateIsNull(
                book,
                fromStudent
        );
        bookStudent.setReturnDate(new Date());
        this.bookStudentRepository.save(bookStudent);

        //To Student

        Student toStudent = studentRepository.findById(toStudentId)
                .orElseThrow(()-> new ResourceNotFoundException(
                        String.format("Student with id %s not found",toStudentId)));

        Set<BookStudent> bookStudents2 = toStudent.getBooksIssued();
        long c2 = bookStudents2.stream().filter(bookStudent1 -> bookStudent1.getBook() == book && bookStudent1.getReturnDate()==null).count();
        if (c2 > 0) {
            throw new BookAlreadyIssuedException(
                    String.format("Book %s has already been issued to id %s, can not reissue",book.getTitle(),toStudent.getUsername())
            );
        }

        BookStudent bookStudent2 = new BookStudent(book, toStudent, new Date());
        this.bookStudentRepository.save(bookStudent2);
    }*/
    @Transactional
    public void transferBook(Long bookId, Long fromStudentId, Long toStudentId){
        bookStudentService.returnBook(bookId,fromStudentId);

        bookStudentService.issueBook(bookId,toStudentId);
    }



}
