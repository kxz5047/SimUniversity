
public class Student extends Person implements Changeable {
	
	Student(String fn, String ln, String pn, String em, String st)
	{
		firstName = fn;
		lastName = ln;
		phoneNumber = pn;
		emailAddress = em;
		status = st;
	}
	
	//Student's class status, constant
	final String status;
	
	//Abstract method from Changeable, changes Student's name
	public void changeNames(String fName, String lName) 
	{
		firstName = fName;
		lastName = lName;
	}
	
	//Override of toString
	public String toString()
	{
		return("Student\nName: " + firstName + " " + lastName + "\nClass status: " + status);
	}

}
