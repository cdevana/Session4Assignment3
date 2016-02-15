package session4;

public class EmployeeDetailsEncapsulation {
	
	private String empName;
	private String empID;
	private String empAddress;
	
	//Setters
	public void setName(String name) {
		this.empName = name;
	}
	
	public void setID(String id) {
		this.empID = id;
	}
	
	public void setAddress(String address) {
		this.empAddress = address;
	}
	
	//Getters
	public String getName() {
		return empName;
	}
	
	public String getID() {
		return empID;
	}
	
	public String getAddress() {
		return empAddress;
	}

}
