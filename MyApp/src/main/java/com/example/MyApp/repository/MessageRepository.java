package com.example.MyApp.repository;

import com.example.MyApp.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message,Long> {
    List<Message> findByTag(String tag);

}
