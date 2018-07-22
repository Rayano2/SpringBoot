package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Department;

public interface DeparmentRepo extends CrudRepository<Department, Long> {

}
