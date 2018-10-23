package com.codeclan.example.CC_w13d02_lab_many_one_employees;

import com.codeclan.example.CC_w13d02_lab_many_one_employees.models.Department;
import com.codeclan.example.CC_w13d02_lab_many_one_employees.models.Employee;
import com.codeclan.example.CC_w13d02_lab_many_one_employees.models.Project;
import com.codeclan.example.CC_w13d02_lab_many_one_employees.repositories.DepartmentRepository;
import com.codeclan.example.CC_w13d02_lab_many_one_employees.repositories.EmployeeRepository;
import com.codeclan.example.CC_w13d02_lab_many_one_employees.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CcW13d02LabManyOneEmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createAndAdd() {
		Department department = new Department("Dept1");
		departmentRepository.save(department);
		Employee employee = new Employee("Employee", "One", "Number1", department);
		employeeRepository.save(employee);
	}


	@Test
	public void manyToMany() {
		Department department = new Department("Dept1");
		departmentRepository.save(department);
		Employee employee = new Employee("Employee", "One", "Number1", department);
		employeeRepository.save(employee);
		Project project = new Project("Project1", 6);
		projectRepository.save(project);
	}


	@Test
	public void addToManyToMany() {
		Department department = new Department("Dept10");
		departmentRepository.save(department);
		Employee employee = new Employee("Employee20", "Two", "Number22", department);
		employeeRepository.save(employee);
		Project project = new Project("Project30", 8);
		projectRepository.save(project);
		project.addEmployee(employee);
		projectRepository.save(project);
		employee.addProject(project);
		employeeRepository.save(employee);
	}



}
