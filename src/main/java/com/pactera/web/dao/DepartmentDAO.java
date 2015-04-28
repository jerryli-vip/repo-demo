package com.pactera.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pactera.web.model.Department;

@Repository("departmentDAO")
public interface DepartmentDAO extends JpaRepository<Department, Integer> {

}
