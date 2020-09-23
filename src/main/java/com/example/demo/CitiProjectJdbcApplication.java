package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.citi.bean.Employee;
import com.citi.configuration.EmployeeConfig;
import com.citi.dao.EmployeeDAOImpl;

@SpringBootApplication
public class CitiProjectJdbcApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CitiProjectJdbcApplication.class, args);
//		app.webApplicationType = WebApplicationType.REACTIVE;
		ApplicationContext context=SpringApplication.run(EmployeeConfig.class);
		// remaining code will write after the break
		
				// perform operation @Employee
				
			EmployeeDAOImpl employeeJDBCTemplate = 
					context.getBean(EmployeeDAOImpl.class);
						
			// method call here 
			runEmployeeCRUD(employeeJDBCTemplate);
			
			}
			
			
			
			
		    public static void runEmployeeCRUD(EmployeeDAOImpl 
		    		employeeJDBCTemplate) {
					
				// create the employee data 
				
		          employeeJDBCTemplate.setupDB();
				
				System.out.println("------Records Creation--------");
				employeeJDBCTemplate.create("siddu", 11);
				employeeJDBCTemplate.create("bano", 2);
				employeeJDBCTemplate.create("gridhar", 15);

				System.out.println("------Listing Multiple Records--------");
				List<Employee> employees = employeeJDBCTemplate.listEmployees();
				for (Employee record : employees) {
					System.out.print("ID : " + record.getId());
					System.out.print(", Name : " + record.getName());
					System.out.println(", Age : " + record.getAge());
				}
				
		/*
				System.out.println("----Updating Record with ID = 2 -----");
				employeeJDBCTemplate.update(2, 20);
		*/
//				System.out.println("----Listing Record with ID = 2 -----");
//				Employee employee = employeeJDBCTemplate.getEmployee(2);
//				System.out.print("ID : " + employee.getId());
//				System.out.print(", Name : " + employee.getName());
//				System.out.println(", Age : " + employee.getAge());

		    }
}
