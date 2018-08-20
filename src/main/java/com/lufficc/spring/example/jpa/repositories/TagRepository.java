package com.lufficc.spring.example.jpa.repositories;

import com.lufficc.spring.example.jpa.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
