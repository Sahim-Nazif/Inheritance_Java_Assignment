
public class Executive extends Manager
{
 private double yearlyBonus;
 private int yearOfExp;
 public Executive (String name, double salary, String dept, double yearlyBonus, int yearOfExp) {
	 super(name, salary,dept);
	 this.yearlyBonus=yearlyBonus;
	 this.yearOfExp=yearOfExp;
 }
 public void setYearlyBonus(double yearlyBonus) {
	 this.yearlyBonus=yearlyBonus;
 }
 public double getYearlyBonus() {
	 return yearlyBonus;
 }
 public void setYearofExp(int yearofExp) {
	 this.yearOfExp=yearOfExp;
 }
 public int getYearOfExp() {
	 return yearOfExp;
 }
 public String toString() {
	 return super.toString()+ "\nYearly Bonus :"+getYearlyBonus()+"\nYears of Experience:"+getYearOfExp();
 }
 
}
