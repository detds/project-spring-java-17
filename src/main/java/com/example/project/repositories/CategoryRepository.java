package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}