package com.vitech.udemy.repository;

import com.vitech.udemy.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
