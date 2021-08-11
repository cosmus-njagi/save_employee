package add_employee;

import org.springframework.data.jpa.repository.JpaRepository;

	public interface EmployeeRepository extends JpaRepository<New_employee, Integer> {		
		//where New_employee is the intended class

	}


