package add_employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DBOperationRunner implements CommandLineRunner{

	@Autowired 
	EmployeeRepository employeerepo;
	
	@Override
	public void run(String... args) throws Exception {
		employeerepo.saveAll(List.of(
				new New_employee(1234, "cosmus", "Njagi", "developer"),
				new New_employee(560, "cosmus", "Njagi", "developer"),
				new New_employee(789, "cosmus", "Njagi", "developer")
				));
		System.out.println("Employee saved");
	}
}
