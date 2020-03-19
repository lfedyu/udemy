package com.vitech.udemy.repository;

import com.vitech.udemy.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
