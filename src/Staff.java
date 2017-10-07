public class Staff extends Employee {
	
	Staff(String fn, String ln, String pn, String em, String tl)
	{
		firstName = fn;
		lastName = ln;
		phoneNumber = pn;
		emailAddress = em;
		title = tl;
	}
	
	//Staff member's title
	String title;
	
	//Returns staff member's title
	String getTitle()
	{
		return title;
	}
	
	//Sets staff member's title
	void setTitle(String t)
	{
		title = t;
	}
	
	//Override of toString
	public String toString()
	{
		return("Faculty Member\nName: " + firstName + " " + lastName + "\nTitle: " + title);
	}

}
