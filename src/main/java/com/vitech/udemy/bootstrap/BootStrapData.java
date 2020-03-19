package com.vitech.udemy.bootstrap;

import com.vitech.udemy.model.Author;
import com.vitech.udemy.model.Book;
import com.vitech.udemy.repository.AuthorRepository;
import com.vitech.udemy.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootStrapData implements CommandLineRunner {

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;

  @Override
  public void run(String... args){
    Author eric = Author.builder()
        .firstName("Eric")
        .lastName("Evans")
        .build();

    Book ddd = Book.builder()
        .title("Domain Driven Design")
        .build();

    eric.getBooks().add(ddd);
    ddd.getAuthors().add(eric);

    authorRepository.save(eric);
    bookRepository.save(ddd);

    System.out.println("Book: " + ddd);
  }
}
