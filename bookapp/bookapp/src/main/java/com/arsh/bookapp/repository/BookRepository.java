package com.arsh.bookApp.repository;

import com.arsh.bookApp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends JpaRepository<Book, Integer> {
}
