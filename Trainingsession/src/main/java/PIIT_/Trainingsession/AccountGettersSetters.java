package PIIT_.Trainingsession;

public class AccountGettersSetters {
	
	String Name;
	int age;
	String school;
	int empId;
	
	
	
	public static void main(String[] args) {
		AccountGettersSetters acct = new AccountGettersSetters();
		String name = acct.setName("robinson");
		String age = acct.setAge(39);
		

	}
	
	
	
	
	
	
	
	

	public String getName() {
		return Name;
	}













	public String setName(String name) {
		return Name = name;
	}













	public int getAge() {
		return age;
	}













	public String setAge(int age) {
		this.age = age;
		return Name;
	}













	public String getSchool() {
		return school;
	}













	public void setSchool(String school) {
		this.school = school;
	}













	public int getEmpId() {
		return empId;
	}













	public void setEmpId(int empId) {
		this.empId = empId;
	}







}
