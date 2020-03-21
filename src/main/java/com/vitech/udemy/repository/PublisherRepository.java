package com.vitech.udemy.repository;

import com.vitech.udemy.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
