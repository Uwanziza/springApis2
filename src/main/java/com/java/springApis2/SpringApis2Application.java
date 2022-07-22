package com.java.springApis2;

import com.java.springApis2.Model.Employee;
import com.java.springApis2.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;



@SpringBootApplication
@EnableJpaRepositories("com.java.springApis2.repository")
public class SpringApis2Application implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(SpringApis2Application.class, args);
	}

    //@Autowired
    //private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        /*Employee employee=new Employee();
        employee.setFirstName("uwa");
        employee.setLastName("chane");
        employee.setEmailId("chane12@gmail.com");
        employeeRepository.save(employee);

        Employee employee1=new Employee();
        employee1.setFirstName("john");
        employee1.setLastName("mack");
        employee1.setEmailId("johnmack12@gmail.com");
        employeeRepository.save(employee1);*/
    }
}
