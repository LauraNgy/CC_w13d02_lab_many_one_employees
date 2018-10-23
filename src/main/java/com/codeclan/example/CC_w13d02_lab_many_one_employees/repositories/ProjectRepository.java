package com.codeclan.example.CC_w13d02_lab_many_one_employees.repositories;

import com.codeclan.example.CC_w13d02_lab_many_one_employees.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
