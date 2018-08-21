package com.spring.example.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.jpa.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
