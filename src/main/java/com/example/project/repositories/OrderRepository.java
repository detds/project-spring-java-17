package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}