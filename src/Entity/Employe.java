package Entity;

public class Employe {
	
	String name;
	String email;
	double salary;
	
	 public Employe(String name, String email, double salary) {
		 this.name = name;
		 this.email = email;
		 this.salary = salary;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String Email) {
		 this.email = email;
	 }
	 
	 public double getSalary() {
		 return salary;
	 }
	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
}
