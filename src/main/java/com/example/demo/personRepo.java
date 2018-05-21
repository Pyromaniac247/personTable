package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface personRepo extends JpaRepository<Person, Long> {

}
