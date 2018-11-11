
public class Manager extends Employee
{
	protected String dept;

 public Manager(String name, double salary, String dept) {
		super(name, salary);
		this.dept=dept;
	}
 public void  setDept(String dept) {
	   this.dept=dept;
   }
 public String getDept() {
	 return dept;
 }
 public String toString() {
	 return super.toString() +"\nDeptartment Name:"+getDept()+"\nTotal Salary including bonus is:"+ super.gettotal();
 }
public double getYearlyBonus() {
	
	double yearlyBonus=4500;
	return yearlyBonus;
}

	
}

