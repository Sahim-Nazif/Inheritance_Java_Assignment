
public class Employee {
	protected String name;
	protected double salary;
	

public Employee (String name, double salary) {
	this.name=name;
	this.salary=salary;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setSalary(double salary) {
	this.salary=salary;
}
public double getSalary() {
	return salary;
}
public double getYearlyBonus() {
	
	double yearlyBonus=3500.91;
	return yearlyBonus;
}
public double gettotal() {
	double total;
	total=salary+getYearlyBonus();
	return total;
}
public String toString() {
	return"\nName:" +name +"\nSalary:"+ salary;
}

}