package com;

import com.dto.req.NewEmployeeRequest;
import com.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbIntroductionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbIntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EmployeeService employeeService = new EmployeeService();

		NewEmployeeRequest newEmployeeRequest = new NewEmployeeRequest(
				"Kathirkamanathan",
				"Premnath",
				"rexprem1991@gmail.com",
				31,
				150000,
				(short)1,
				true
		);
		employeeService.createNewEmployee(newEmployeeRequest);
	}
}
