
public class Employee extends Person {
	
	//Employee's office number
	String officeNumber;
	
	//Employee's office phone number
	String officePhoneNumber;
	
	//Employee's date of employment
	String dateOfEmployment;
	
	//Returns the employee's office number
	String getOfficeNumber()
	{
		return officeNumber;
	}

	//Sets the employee's office number
	void setOfficeNumber(String offNumber)
	{
		officeNumber = offNumber;
	}
	
	//Returns the employee's office phone number
	String getOfficePhoneNumber()
	{
		return officePhoneNumber;
	}
	
	//Sets the employee's office phone number
	void setOfficePhoneNumber(String phNum)
	{
		officePhoneNumber = phNum;
	}
	
	//Returns the employee's date of employment
	String getDateOfEmployment()
	{
		return dateOfEmployment; 
	}
	
	//Sets the employee's date of employment
	void setDateOfEmployment(String doe)
	{
		dateOfEmployment = doe;
	}
}
