
public class EmployeeTest {

	public static void main(String[] args) {
	Employee employee= new Employee("Kelly Jones",44955.78);
	Manager manager= new Manager("Macas Warda",65800.29,"Bank of Montreal(BMO)");
	Executive executive=new Executive ("Alam Yusuf",97670.39,"Bank of Montreal(BMO)",6700.93,20);
	Employee employee1= new Executive("Shakib Hassan", 55400,"Bank of Montreal (BMO)",3200,22); 
	

	System.out.println("\nEmployees information processed as : ");
	System.out.println("------------------------------------");
	System.out.println("\n*Software Developer");
	System.out.println(employee1.toString());
	System.out.println("\n*Java Developer");
	System.out.println(employee.toString());
	System.out.println("Yearly Bonus :"+employee.getYearlyBonus());
	
	System.out.println("Total annual Salary plus bonus: "+employee.gettotal());
	System.out.println("\n*Manager information:*");
	System.out.println(manager.toString());
	System.out.println("Yearly Bonus :"+manager.getYearlyBonus());
	System.out.println("\n*Executive Manager information:*");
    System.out.println(executive.toString());	 
   
	
	}

}
