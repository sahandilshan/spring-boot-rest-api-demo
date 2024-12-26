package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // We don't need to add custom method for this example. The methods available in JpaRepository are sufficient.
}
