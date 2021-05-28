package com.raufali.library.repositories;

import com.raufali.library.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author,Long> {
}
