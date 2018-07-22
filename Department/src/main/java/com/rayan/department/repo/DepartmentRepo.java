package com.rayan.department.repo;

import org.springframework.data.repository.CrudRepository;

import com.rayan.department.Entity.DepartMent;

public interface DepartmentRepo extends CrudRepository<DepartMent,Long> {

}
