package Homework;


public class Finance {
	
	private String custName;
	private int custID;
	private String address;
	private int age;
	private int salary;
	
	
	
	
	public String getCustName() {
		return custName;
	}




	public void setCustName(String custName) {
		this.custName = custName;
	}




	public int getCustID() {
		return custID;
	}


	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}



	public void CustomerInfo(String custName, int custID, String Address, int age, int salary) 
	{
		setCustName(custName);
		setCustID(custID);
		setAddress(Address);
		setAge(age);
		setSalary(salary);
	}
	
	public boolean HomeLoan()
	{
		if (getSalary() > 30000 && getAge()>18)
		{
			System.out.println("You get a home Loan");
			return true;
			
		}
			else
		{
				System.out.println("You do not get a home Loan");
			return false;
		
		}
	}
	
	
	public boolean CarLoan()
	{
		if(getSalary() > 15000 && getAge()>18)
		{	
			System.out.println("You get a car Loan");
			return true;
		}
			else 
			{
				System.out.println("You do not get a Car Loan");
			return false;

			}
	}
	
	public boolean PersonalLoan()
	{
		if(getSalary() > 10000 && getAge()>18)
		{
			System.out.println("You get a Personal Loan");
			return true;
			
		}
		else 
		{
			System.out.println("You do not get a Personal Loan");
			return false;
		
		}
		}
	
	
	public static void main(String[] agrs)
	{
		Finance fin = new Finance();
		// CustomerInfo(String custName, int custID, String Address, int age, int salary) 
		fin.CustomerInfo(  "Sid", 11, "Chicago", 23, 65000);
		fin.PersonalLoan();
		fin.CarLoan();
		fin.HomeLoan();
	}

}
