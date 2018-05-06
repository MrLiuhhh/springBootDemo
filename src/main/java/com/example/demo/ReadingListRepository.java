package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by liumolong on 18/5/5.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long>{
    List<Book> findByReader(String reader);
}
