package add_employee;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class New_employee {
	//Declare id as primary key
	@Id
	private int emp_id;
	private String firstname;
	private String lastname;
	private String role;
	
	//default constructor
	public New_employee() {}
	
	//pass parameters into the constructor
	public New_employee(int emp_id, String firstname, String lastname, String role) {
		super();
		this.emp_id=emp_id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.role=role;
	}
	//Getters and setters for employee

	public int getId() {
		return emp_id;
	}

	public void setId(int id) {
		this.emp_id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
