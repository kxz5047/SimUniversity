
public class Faculty extends Employee implements Changeable {
	
	Faculty(String fn, String ln, String pn, String em, String rk)
	{
		firstName = fn;
		lastName = ln;
		phoneNumber = pn;
		emailAddress = em;
		rank = rk;
	}
	
	//Faculty's rank
	String rank;
	
	//Returns the employee's rank
	String getRank()
	{
		return rank;
	}
	
	//Sets the employee's rank
	void setRank(String rk)
	{
		rank = rk;
	}

	//Override of toString
	public String toString()
	{
		return("Faculty Member\nName: " + firstName + " " + lastName + "\nRank: " + rank);
	}
	
	//Abstract method from Changeable, changes Faculty's name
	public void changeNames(String fName, String lName) 
	{
		firstName = fName;
		lastName = lName;
	}
}
